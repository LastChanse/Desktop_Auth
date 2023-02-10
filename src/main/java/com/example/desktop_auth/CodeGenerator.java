package com.example.desktop_auth;

import com.example.desktop_auth.Utils.Config;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class CodeGenerator {

    private final AuthController parentController;
    private static Stage thisStage;

    public CodeGenerator(AuthController parentController) {
        this.parentController = parentController;

        thisStage = new Stage();

        try {
            // Создание загрузчика окна авторизации
            FXMLLoader fxmlLoader = new FXMLLoader(AuthApplication.class.getResource("auth-view.fxml"));
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

    @FXML
    public TextField cod;

    @FXML
    public void initialize() {
        cod.setEditable(false);
    }

    public static String generate() {
        thisStage = new Stage();

        try {
            // Создание загрузчика окна авторизации
            FXMLLoader fxmlLoader = new FXMLLoader(AuthApplication.class.getResource("cod-view.fxml"));
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
        return "000";
    }
}
