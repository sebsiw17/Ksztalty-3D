package com.example.ksztalty3d;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;

import java.io.IOException;


    public class obiekty3D extends Application{
        @Override
        public void start(Stage stage){
            Sphere sphere1 = new Sphere();
            sphere1.setRadius(50.0);
            sphere1.setTranslateX(100);
            sphere1.setTranslateY(150);
            sphere1.setCullFace(CullFace.FRONT);

            Sphere sphere2 = new Sphere();
            sphere2.setRadius(50.0);
            sphere2.setTranslateX(300);
            sphere2.setTranslateY(150);
            sphere2.setCullFace(CullFace.BACK);

            Sphere sphere3 = new Sphere();
            sphere3.setRadius(50.0);
            sphere3.setTranslateX(500);
            sphere3.setTranslateY(150);

            sphere2.setCullFace(CullFace.NONE);

            Group root = new Group(sphere1, sphere2, sphere3);
            Scene scene = new Scene(root, 600, 300);
            stage.setTitle("Rysowanie kul");
            stage.setScene(scene);
            stage.show();

        }


    public static void main(String[] args) {
        launch();
    }
}