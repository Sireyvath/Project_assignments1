package com.example.project_assignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;



public class HelloController {
    @FXML
    private Stage stage;
    private Scene scene;
    private AnchorPane pane;

    @FXML
    private Button loginButton,goRegister,exitButton;





    public  void ToLogin(ActionEvent event) throws IOException{
        Parent fxmlLoader =  FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader);
        stage.setScene(scene);
        stage.show();
    }
    public  void ToRegister(ActionEvent event) throws IOException{
        Parent fxmlLoader =  FXMLLoader.load(getClass().getResource("register.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader);
        stage.setScene(scene);
        stage.show();
    }
    public  void ToMainScreen(ActionEvent event) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("Main_screen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(true);
    }


    public  void searchUpdate(ActionEvent event) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("search_to_update.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(true);}

    public  void backButton(ActionEvent event) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("Main_screen"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.toBack();
        scene = new Scene(fxmlLoader);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(true);}




    public void logout(ActionEvent event) {
        javafx.application.Platform.exit();
//        stage = (Stage) pane.getScene().getWindow();
//        stage.close();


    }





}