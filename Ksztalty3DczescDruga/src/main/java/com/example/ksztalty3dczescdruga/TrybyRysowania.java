package com.example.ksztalty3dczescdruga;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.shape.Box;
import javafx.scene.shape.DrawMode;
import javafx.stage.Stage;

import java.io.IOException;

public class TrybyRysowania extends Application{
    @Override
    public void start(Stage stage){
        Box box1 = new Box();
        box1.setWidth(100.0);
        box1.setHeight(100.0);
        box1.setDepth(100.0);
        box1.setTranslateX(200);
        box1.setTranslateY(150);
        box1.setTranslateZ(0);
        box1.setDrawMode(DrawMode.LINE);

        Box box2 = new Box();
        box2.setWidth(100.0);
        box2.setHeight(100.0);
        box2.setDepth(100.0);
        box2.setTranslateX(450);
        box2.setTranslateY(150);
        box2.setTranslateZ(300);
        box2.setDrawMode(DrawMode.FILL);

        Group root = new Group(box1, box2);
        Scene scene = new Scene(root, 600, 300);

        PerspectiveCamera camera = new PerspectiveCamera(false);
        camera.setTranslateX(0);
        camera.setTranslateY(0);
        camera.setTranslateZ(0);
        scene.setCamera(camera);

        stage.setTitle("Rysowanie pudełka");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}