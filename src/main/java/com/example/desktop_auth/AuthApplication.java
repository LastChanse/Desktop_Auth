package com.example.desktop_auth;

import com.example.desktop_auth.Utils.Config;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class AuthApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        new AuthController(this);
    }

    public static void main(String[] args) {
        launch();
    }
}