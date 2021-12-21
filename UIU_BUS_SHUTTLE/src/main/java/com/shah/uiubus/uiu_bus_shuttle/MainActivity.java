package com.shah.uiubus.uiu_bus_shuttle;

import javafx.animation.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class MainActivity extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainActivity.class.getResource("sFlash.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 540, 842);
        stage.setTitle("UIU BUS SHUTTLE!");
       // stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {
        launch();

        startSequentialTransition();
    }










    public static Shape startSequentialTransition() {
        Rectangle rect = new Rectangle(100, 40, 100, 100);
        rect.setArcHeight(50);
        rect.setArcWidth(50);
        rect.setFill(Color.VIOLET);

        final Duration SEC_2 = Duration.millis(2000);
        final Duration SEC_3 = Duration.millis(3000);

        PauseTransition pause = new PauseTransition(Duration.millis(1000));
        FadeTransition fade = new FadeTransition(SEC_3);
        fade.setFromValue(1.0f);
        fade.setToValue(0.3f);
        fade.setCycleCount(Transition.INDEFINITE);
        fade.setAutoReverse(true);
        TranslateTransition translate = new TranslateTransition(SEC_2);
        translate.setFromX(-100f);
        translate.setToX(100f);
        translate.setCycleCount(Transition.INDEFINITE);
        translate.setAutoReverse(true);
        RotateTransition rotate = new RotateTransition(SEC_3);
        rotate.setByAngle(180f);
        rotate.setCycleCount(Transition.INDEFINITE);
        rotate.setAutoReverse(true);
        ScaleTransition scale = new ScaleTransition(SEC_2);
        scale.setByX(1.5f);
        scale.setByY(1.5f);
        scale.setCycleCount(Transition.INDEFINITE);
        scale.setAutoReverse(true);

        SequentialTransition seq = new SequentialTransition(rect, pause, fade, translate,
                rotate, scale);
        seq.play();
        return rect;
    }




}