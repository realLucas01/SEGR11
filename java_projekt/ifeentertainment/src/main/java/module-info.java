module segeleven.ifeentertainment {
    requires javafx.controls;
    requires javafx.fxml;

    opens segeleven.ifeentertainment to javafx.fxml;
    exports segeleven.ifeentertainment;
    
    opens segeleven.ifeentertainment.uicontroller to javafx.fxml;
    exports segeleven.ifeentertainment.UIController;
    
    opens segeleven.ifeentertainment.uifourconnectcontroller to javafx.fxml;
    exports segeleven.ifeentertainment.uifourconnectcontroller;
    
    opens segeleven.ifeentertainment.infrastructure to javafx.fxml;
    exports segeleven.ifeentertainment.infrastructure;
    
    exports segeleven.ifeentertainment.gamecore;
    exports segeleven.ifeentertainment.fourconnect;
}
