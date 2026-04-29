/*
 * 1.0 2026-04-28 Truong Tan Long Nguyen
 *
 * Copyright (c) 2025-2026 Gervithrall Systems GmbH. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * Gervithrall Systems GmbH ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Gervithrall Systems GmbH.
 *
 * GERVITHRALL SYSTEMS GMBH MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT
 * THE SUITABILITY OF THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT. GERVITHRALL SYSTEMS GMBH
 * SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT
 * OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */
package SEG11.IFE_Entertainment.UIGameController;

import java.io.IOException;
import SEG11.IFE_Entertainment.App;
import SEG11.IFE_Entertainment.FourConnect.FourConnectGame;
import SEG11.IFE_Entertainment.FourConnect.Player;
import SEG11.IFE_Entertainment.GameCore.GameState;
import SEG11.IFE_Entertainment.UIController.GameController;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * Controller für den Vier-Gewinnt-Spielscreen.
 *
 * <p>Verbindet die Spiellogik mit der Benutzeroberfläche. Verwaltet das
 * Spielfeld, verarbeitet Eingaben des Spielers und aktualisiert die Anzeige.
 */
public class FourConnectGameController implements GameController {

    /** Das Spielfeld als GridPane. */
    @FXML
    private GridPane gridPane;

    /** Label zur Anzeige des aktuellen Spielstatus. */
    @FXML
    private Label statusLabel;

    private final FourConnectGame game = new FourConnectGame();
    private Circle[][] circles = new Circle[6][7];

    /**
     * Startet das Spiel neu mit demselben Spielmodus.
     *
     * @throws IOException falls die FXML-Datei nicht geladen werden kann
     */
    @Override
    @FXML
    public void restartGame() throws IOException {
        game.restart();
        initBoard();
        updateStatus();
    }

    /**
     * Beendet das Spiel und navigiert zurück zum Hauptmenü.
     *
     * @throws IOException falls die FXML-Datei nicht geladen werden kann
     */
    @Override
    @FXML
    public void backToMainMenu() throws IOException {
        game.endGame();
        App.setRoot("MainMenu");
    }

    /**
     * Navigiert zum Hilfe-Screen.
     *
     * @throws IOException falls die FXML-Datei nicht geladen werden kann
     */
    @Override
    @FXML
    public void openHelp() throws IOException {
        App.setRoot("Help");
    }

    /**
     * Verarbeitet die Eingabe des Spielers für eine bestimmte Spalte.
     * Prüft ob die Spalte voll ist, wirft die Scheibe ein und aktualisiert die Anzeige.
     *
     * @param column die gewählte Spalte
     */
    public void handleColumnInput(Integer column) {
        if (game.getStatus() != GameState.Running) {
            return;
        }
        if (game.getBoard().getCellOwner(column, 0).getType() != Player.NONE) {
            statusLabel.setText("Spalte ist voll!");
            return;
        }
        GameState result = game.dropDisc(column);
        updateBoard();
        if (result == GameState.Won) {
            statusLabel.setText("Gewonnen!");
        } else if (result == GameState.Tied) {
            statusLabel.setText("Unentschieden!");
        } else {
            game.playerTurn();
            updateStatus();
        }
    }

    /**
     * Initialisiert das Spiel mit den gewählten Spielertypen und zeichnet das Spielfeld.
     *
     * @param playerOne der Typ von Spieler 1
     * @param playerTwo der Typ von Spieler 2
     */
    public void handlePlayMode(Player playerOne, Player playerTwo) {
        game.initFourConnectGame(playerOne, playerTwo);
        initBoard();
        updateStatus();
    }

    /**
     * Erstellt das Spielfeld als 6x7 Grid aus grauen Kreisen.
     * Jeder Kreis reagiert auf Mausklicks zur Spaltenauswahl.
     */
    private void initBoard() {
        gridPane.getChildren().clear();
        circles = new Circle[6][7];
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 7; col++) {
                Circle circle = new Circle(30);
                circle.setFill(Color.GRAY);
                circles[row][col] = circle;
                final int c = col;
                circle.setOnMouseClicked(e -> handleColumnInput(c));
                gridPane.add(circle, col, row);
            }
        }
    }

    /**
     * Aktualisiert die Farben der Kreise basierend auf dem aktuellen Spielfeldzustand.
     */
    private void updateBoard() {
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 7; col++) {
                String colour = game.getBoard().getCellOwner(col, row).getColour();
                if (colour != null) {
                    circles[row][col].setFill(Color.web(colour));
                } else {
                    circles[row][col].setFill(Color.GRAY);
                }
            }
        }
    }

    /**
     * Aktualisiert das Statuslabel basierend auf dem aktuellen Spielzustand.
     */
    private void updateStatus() {
        GameState state = game.getStatus();
        switch (state) {
            case Running -> statusLabel.setText("Spiel läuft");
            case Won -> statusLabel.setText("Gewonnen!");
            case Tied -> statusLabel.setText("Unentschieden!");
            default -> statusLabel.setText("");
        }
    }
}