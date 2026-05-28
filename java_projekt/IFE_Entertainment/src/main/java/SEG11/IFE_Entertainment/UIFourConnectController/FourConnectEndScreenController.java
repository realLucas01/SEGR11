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
package SEG11.IFE_Entertainment.UIFourConnectController;

import java.io.IOException;
import SEG11.IFE_Entertainment.App;
import SEG11.IFE_Entertainment.FourConnect.FourConnectGame;
import SEG11.IFE_Entertainment.FourConnect.Player;
import SEG11.IFE_Entertainment.GameCore.GameState;
import SEG11.IFE_Entertainment.UIController.EndScreenController;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.text.MessageFormat;
import SEG11.IFE_Entertainment.FourConnect.FourConnectPlayer;
import SEG11.IFE_Entertainment.Infrastructure.LocalizationService;

/**
 * FourConnect-spezifische Implementierung des EndScreenControllers.
 *
 * <p>Zeigt das Spielergebnis an und ermöglicht nach Spielende
 * die Navigation zurück zum Hauptmenü oder den Neustart des Spiels.
 * 
 * @author Truong Tan Long Nguyen
 */
public class FourConnectEndScreenController implements EndScreenController {

    /** Label zur Anzeige des Spielergebnisses. */
    @FXML
    private Label resultLabel;
    
    private final LocalizationService localizationService = LocalizationService.getInstance();
    
    /**
     * Initialisiert den EndScreen und zeigt das Spielergebnis an.
     */
    @Override
    @FXML
    public void initialize() {
      GameState state = FourConnectGame.getInstance().getStatus();

      if (state == GameState.Won) {
        resultLabel.setText(getWinnerText());
      } else if (state == GameState.Tied) {
        resultLabel.setText(localizationService.getText("game.draw"));
      }
    }

    /**
     * Erstellt den Ergebnistext für den Gewinner der aktuellen Runde.
     *
     * @return lokalisierter Ergebnistext
     */
    private String getWinnerText() {
      FourConnectGame game = FourConnectGame.getInstance();
      int winnerIndex = game.getCurrentPlayerIndex();
      FourConnectPlayer winner = game.getPlayers()[winnerIndex];

      if (winner.getType() != Player.HUMAN) {
        return localizationService.getText("game.botWin");
      }

      String winText = localizationService.getText("game.win");
      return MessageFormat.format(winText, winnerIndex + 1);
    }
    
    /**
     * Startet ein neues Spiel im selben Modus.
     *
     * @throws IOException falls die FXML-Datei nicht geladen werden kann
     */
    @Override
    @FXML
    public void restartGame() throws IOException {
        Player p1 = FourConnectGame.getInstance().getPlayers()[0].getType();
        Player p2 = FourConnectGame.getInstance().getPlayers()[1].getType();
        FourConnectGame.getInstance().endGame();
        FourConnectGameController controller = App.setRootAndGetController("FourConnectGame");
        controller.handlePlayMode(p1, p2);
    }

    /**
     * Navigiert zurück zum Hauptmenü.
     *
     * @throws IOException falls die FXML-Datei nicht geladen werden kann
     */
    @Override
    @FXML
    public void backToMainMenu() throws IOException {
        App.setRoot("MainMenu");
    }
}