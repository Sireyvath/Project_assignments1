package com.example.project_assignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.fxml.FXMLLoader.load;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

//        Parent parent = (Parent) load(getClass().getResource("hello-view.fxml"));
//        Scene scene = new Scene(parent);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("register.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400, Color.BLUEVIOLET);
        //Image icon = new Image("img/5164023.png");


        //stage.getIcons().add(icon);
        stage.setTitle("Stock Management");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }
    public static class register{

    }

    public static void main(String[] args) {
        launch();
    }
}