module com.example.desktop_auth {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.desktop_auth to javafx.fxml;
    exports com.example.desktop_auth;
}