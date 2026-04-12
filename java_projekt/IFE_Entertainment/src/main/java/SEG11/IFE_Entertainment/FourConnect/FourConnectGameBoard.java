package SEG11.IFE_Entertainment.FourConnect;

import javafx.geometry.Pos;

import java.util.Map;

public class FourConnectGameBoard {
    private Integer rows;
    private Integer columns;
    private Map<Position,FourConnectPlayer> cells;

    //todo Standardkonstruktor
    public FourConnectGameBoard(){

    }



    public Integer getRows() {
        return rows;
    }

    public Integer getColumns() {
        return columns;
    }

    /**
     * erhält eine bestimmte Zelle und gibt den Besitzter dieser Zelle zurück
     * @param cell
     * @return
     */
    public FourConnectPlayer getCellOwner(Position cell){
        //todo
        return null;
    }

    /**
     * wird in dropDisc() aufgerufen und erhält die ermittelte Zelle, diese Zelle wird nun dem Spieler zugewiesen
     * @param cell
     * @param currentPlayer
     * @return
     */
    public Integer setCellValue(Position cell, FourConnectPlayer currentPlayer){
        //todo
        return null;
    }
}
