package com.example.map;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {



    public static Stage stage;
    private final String ICON = "C:\\Users\\shahr\\IdeaProjects\\Map\\src\\main\\resources\\com\\example\\map\\Icon.png";

    @Override
    public void start(Stage stage) throws Exception {




        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MainPage.fxml")));
        stage.getIcons().add(new Image(ICON));
        stage.setScene(new Scene(root));

        stage.setTitle("UIU BUS SHUTTLE");
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}