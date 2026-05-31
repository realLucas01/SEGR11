module segeleven.ife.entertainment {
    requires javafx.controls;
    requires javafx.fxml;

    opens segeleven.ife.entertainment to javafx.fxml;
    exports segeleven.ife.entertainment;
    
    opens segeleven.ife.entertainment.uicontroller to javafx.fxml;
    exports segeleven.ife.entertainment.uicontroller;
    
    opens segeleven.ife.entertainment.uifourconnectcontroller to javafx.fxml;
    exports segeleven.ife.entertainment.uifourconnectcontroller;
    
    opens segeleven.ife.entertainment.infrastructure to javafx.fxml;
    exports segeleven.ife.entertainment.infrastructure;
    
    exports segeleven.ife.entertainment.gamecore;
    exports segeleven.ife.entertainment.fourconnect;
}
