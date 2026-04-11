module SEG11.IFE_Entertainment {
    requires javafx.controls;
    requires javafx.fxml;

    opens SEG11.IFE_Entertainment to javafx.fxml;
    exports SEG11.IFE_Entertainment;
    
    opens SEG11.IFE_Entertainment.UIController to javafx.fxml;
    exports SEG11.IFE_Entertainment.UIController;
}
