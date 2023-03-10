package com.example.project_assignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400, Color.BLUEVIOLET);
        Image icon = new Image("D:\\School\\Term4\\Pratice OOP\\Project_assignment\\5164023.png");

        stage.getIcons().add(icon);
        stage.setTitle("Stock Management");
        stage.setScene(scene);
        stage.show();
    }
    public static class register{

    }

    public static void main(String[] args) {
        launch();
    }
}