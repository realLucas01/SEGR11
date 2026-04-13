package SEG11.IFE_Entertainment.FourConnect;

import javafx.geometry.Pos;

import java.util.Map;

public class FourConnectGameBoard {
    private Integer rows;
    private Integer columns;
    private Map<Position,FourConnectPlayer> cells;

    //todo Standardkonstruktor

    /**
     * Standardkonstruktor
     */
    public FourConnectGameBoard(){

    }


    /**
     *
     * @return die Anzahl an Zeilen
     */
    public Integer getRows() {
        return rows;
    }


    /**
     *
     * @return Anzahl der Spalten
     */
    public Integer getColumns() {
        return columns;
    }

    /**
     * erhält eine bestimmte Zelle und gibt den Besitzer dieser Zelle zurück
     * @param cell
     * @return den Spieler der Zelle
     */
    public FourConnectPlayer getCellOwner(Position cell){
        //todo
        return null;
    }

    /**
     * wird in dropDisc() aufgerufen und erhält die ermittelte Zelle, diese Zelle wird nun dem Spieler zugewiesen
     * @param cell
     * @param currentPlayer
     * @return Integer Wert, ob die Operation erfolgreich war
     */
    public Integer setCellValue(Position cell, FourConnectPlayer currentPlayer){
        //todo
        return null;
    }
}
