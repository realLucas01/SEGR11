package SEG11.IFE_Entertainment.FourConnect;


import java.util.*;

public class FourConnectGameBoard {
    private final Integer rows; //6
    private final Integer columns; //7
    private Map<Position,FourConnectPlayer> cells = new HashMap<>();

    /**
     * Standardkonstruktor zum Initialisieren des Spielbrettes
     */
    public FourConnectGameBoard(){
        rows =  6;
        columns = 7;
        FourConnectPlayer nonePlayer = new FourConnectPlayer(Player.NONE,null,null);
        for(int r=0;r<rows;r++){
            for(int c=0;c<columns;c++){
                Position position = new Position(c,r);
                assert cells != null;
                cells.put(position, nonePlayer);
            }
        }
    }
    /**
     * gibt die Anzahl der Zeilen zurück
     * @return die Anzahl an Zeilen
     */
    public Integer getRows() {
        return rows;
    }


    /**
     * gibt die Anzahl der Spalten zurück
     * @return Anzahl der Spalten
     */
    public Integer getColumns() {
        return columns;
    }

    /**
     * erhält eine bestimmte Zelle und gibt den Besitzer dieser Zelle zurück
     * @param y
     * @param x
     * @return den Spieler der Zelle
     */
    public FourConnectPlayer getCellOwner(Integer x, Integer y) {
        return cells.get(new Position(x,y));
    }

    /**
     * wird in dropDisc() aufgerufen und erhält die ermittelte Zelle, diese Zelle wird nun dem Spieler zugewiesen
     * @param cell übergabe der Position
     * @param currentPlayer der Spieler welcher das Spielfeld bekommen soll
     * @return Integer Wert, ob die Operation erfolgreich war
     */
    public void setCellValue(Position cell, FourConnectPlayer currentPlayer){
        cells.put(cell,currentPlayer);
    }

    /**
     * wird in dropDisc() aufgerufen und erhält die ermittelte Zelle, diese Zelle wird nun dem Spieler zugewiesen
     * @param x x Koordinate
     * @param y y Koordinate
     * @param currentPlayer der Spieler welcher das Spielfeld bekommen soll
     * @return Integer Wert, ob die Operation erfolgreich war
     */
    public void setCellValue(Integer x, Integer y, FourConnectPlayer currentPlayer){
        cells.put(new Position(x,y), currentPlayer);
    }

    /**
     * Wird in der BotStrategy benötigt, um eine Kopie des vorhanden Brettes zu erstellen
     * @param board das zu kopieren Spielfeld
     */
    public void copy(FourConnectGameBoard board) {
        for(int r=0;r<rows;r++){
            for(int c=0;c<columns;c++){
                Position position = new Position(c,r);
                cells.put(position, board.getCellOwner(c,r));
            }
        }
    }
}
