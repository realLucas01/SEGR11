module SEG11.IFE_Entertainment {
    requires javafx.controls;
    requires javafx.fxml;

    opens SEG11.IFE_Entertainment to javafx.fxml;
    exports SEG11.IFE_Entertainment;
    
    opens SEG11.IFE_Entertainment.UIController to javafx.fxml;
    exports SEG11.IFE_Entertainment.UIController;
    
    opens SEG11.IFE_Entertainment.UIGameController to javafx.fxml;
    exports SEG11.IFE_Entertainment.UIGameController;
    exports SEG11.IFE_Entertainment.Infrastructure;
    opens SEG11.IFE_Entertainment.Infrastructure to javafx.fxml;
}
