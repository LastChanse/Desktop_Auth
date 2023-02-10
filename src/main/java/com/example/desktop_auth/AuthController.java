package com.example.desktop_auth;

import com.example.desktop_auth.Utils.Config;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class AuthController {
    private Stage thisStage;
    private AuthApplication parentController;

    public AuthController(AuthApplication parentController) {
        this.parentController = parentController;

        thisStage = new Stage();

        try {
            // Создание загрузчика окна авторизации
            FXMLLoader fxmlLoader = new FXMLLoader(AuthApplication.class.getResource("auth-view.fxml"));
            fxmlLoader.setController(this);
            Scene scene = new Scene(fxmlLoader.load());
            // Задание ограничений размеров, название и иконку она
            thisStage.setMaxHeight(350);
            thisStage.setMaxWidth(600);
            thisStage.setMinHeight(350);
            thisStage.setMinWidth(600);
            thisStage.getIcons().add(new Image(String.valueOf(AuthApplication.class.getResource(Config.appIconPath))));
            thisStage.setTitle(Config.appName);
            thisStage.setScene(scene);
            thisStage.show(); // Отобразить окно на экране

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String cod = "000";

    @FXML
    private PasswordField passwordField;

    @FXML
    public void initialize() {
        passwordField.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent ke) {
                if (ke.getCode().equals(KeyCode.ENTER)) {
                    CodeGenerator.generate();
                }
            }
        });
    }
}