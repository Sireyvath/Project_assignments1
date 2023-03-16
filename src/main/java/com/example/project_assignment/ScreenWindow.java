package com.example.project_assignment;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
public class ScreenWindow {
    public static void display (String title, Scene scene, String iconPath){
        Stage stage = new Stage();
        stage.getIcons().add(new Image(iconPath));
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }

}
