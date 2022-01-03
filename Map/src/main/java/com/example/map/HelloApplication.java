package com.example.map;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {



    public static Stage stage;


    @Override
    public void start(Stage stage) throws Exception {




        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MainPage.fxml")));
        stage.setScene(new Scene(root));
        stage.setTitle("UIU BUS SHUTTLE");
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}