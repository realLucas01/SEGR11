/* 
 * 1.0 2026-05-28 Marc Müller
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
import java.util.List;
import SEG11.IFE_Entertainment.App;
import SEG11.IFE_Entertainment.FourConnect.FourConnectGame;
import SEG11.IFE_Entertainment.FourConnect.Position;
import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * Controller für die Anzeige des gewinnbringenden Spielzugs.
 *
 * <p>Zeigt nach Spielende das Spielfeld erneut an und hebt die vier
 * gewinnbringenden Spielsteine visuell hervor.
 */
public class FourConnectWinningMoveController {

  /** Das Spielfeld als GridPane. */
  @FXML
  private GridPane gridPane;

  /** Aktuelles Four-Connect-Spiel. */
  private final FourConnectGame game = FourConnectGame.getInstance();

  /** Kreise zur Darstellung der einzelnen Spielfeldzellen. */
  private Circle[][] circles = new Circle[6][7];

  /**
   * Initialisiert die Anzeige des Spielfelds und markiert den Gewinnzug.
   */
  @FXML
  public void initialize() {
    initBoard();
    updateBoard();
    highlightWinningPositions(game.getWinningPositions());
  }

  /**
   * Navigiert zurück zum Ergebnisbildschirm.
   *
   * @throws IOException falls die FXML-Datei nicht geladen werden kann
   */
  @FXML
  public void backToEndScreen() throws IOException {
    App.setRoot("EndScreen");
  }

  /**
   * Erstellt das Spielfeld als 6x7 Grid aus Kreisen.
   */
  private void initBoard() {
    gridPane.getChildren().clear();
    circles = new Circle[6][7];

    for (int row = 0; row < 6; row++) {
      for (int col = 0; col < 7; col++) {
        Circle circle = new Circle(45);
        circle.setFill(Color.GRAY);
        circles[row][col] = circle;
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
   * Hebt die gewinnbringenden Spielsteine visuell hervor.
   *
   * @param winningPositions Positionen der gewinnbringenden Spielsteine
   */
  private void highlightWinningPositions(List<Position> winningPositions) {
    for (Position position : winningPositions) {
      Circle circle = circles[position.getY()][position.getX()];
      circle.setStroke(Color.WHITE);
      circle.setStrokeWidth(6);
    }
  }
}