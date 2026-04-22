package SEG11.IFE_Entertainment.FourConnect;

import SEG11.IFE_Entertainment.GameCore.IRuleSet;

/**
 * Implementierung des Interfaces IRuleSet
 * 
 * @param <T>
 */
public class FourConnectRules implements IRuleSet<FourConnectGameBoard, FourConnectPlayer> {

	@Override
	public boolean checkTie(FourConnectGameBoard board, FourConnectPlayer player) {
		return board.isFull();
	}

	@Override
	public boolean checkWin(FourConnectGameBoard board, FourConnectPlayer player) {

		// horizontal
		for (int i = 0; i < board.getColumns() - 3; i++) {
			for (int j = 0; j < board.getRows(); j++) {
				if (board.getCellOwner(new Position(i, j)).equals(player)
						&& board.getCellOwner(new Position(i + 1, j)).equals(player)
						&& board.getCellOwner(new Position(i + 2, j)).equals(player)
						&& board.getCellOwner(new Position(i + 3, j)).equals(player)) {
					return true;
				}
			}
		}

		// vertikal
		for (int i = 0; i < board.getColumns(); i++) {
			for (int j = 0; j < board.getRows() - 3; j++) {
				if (board.getCellOwner(new Position(i, j)).equals(player)
						&& board.getCellOwner(new Position(i, j + 1)).equals(player)
						&& board.getCellOwner(new Position(i, j + 2)).equals(player)
						&& board.getCellOwner(new Position(i, j + 3)).equals(player)) {
					return true;
				}
			}
		}

		// diagonal von links oben nach rechts unten
		for (int i = 0; i < board.getColumns() - 3; i++) {
			for (int j = 0; j < board.getRows() - 3; j++) {
				if (board.getCellOwner(new Position(i, j)).equals(player)
						&& board.getCellOwner(new Position(i + 1, j + 1)).equals(player)
						&& board.getCellOwner(new Position(i + 2, j + 2)).equals(player)
						&& board.getCellOwner(new Position(i + 3, j + 3)).equals(player)) {
					return true;
				}
			}
		}

		// diagonal von rechts oben nach links unten
		for (int i = board.getColumns() - 1; i >= 3; i--) {
			for (int j = 0; j < board.getRows() - 3; j++) {
				if (board.getCellOwner(new Position(i, j)).equals(player)
						&& board.getCellOwner(new Position(i - 1, j + 1)).equals(player)
						&& board.getCellOwner(new Position(i - 2, j + 2)).equals(player)
						&& board.getCellOwner(new Position(i - 3, j + 3)).equals(player)) {
					return true;
				}
			}
		}
		return false;
	}
}
