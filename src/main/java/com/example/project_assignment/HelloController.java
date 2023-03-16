package com.example.project_assignment;

import Stock.stocks;
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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

import static javafx.fxml.FXMLLoader.load;


public class HelloController implements Initializable{
    @FXML
    private Stage stage;
    private Scene scene;
    private AnchorPane pane;
    private Parent root;
    @FXML
    private Button DD;


    @FXML
    private Button loginButton,goRegister,exitButton;
    @FXML
    private TextField idField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField qtyField;

    @FXML
    private TextField priceField;

    @FXML
    private TextField priceAtFullField;
    @FXML
    private TextField inDateField;

    @FXML
    private Button insertButton;

    @FXML
    private Button updateButton;

    @FXML
    private Button deleteButton;

    @FXML
    private TableView<stocks> TableView;

    @FXML
    private TableColumn<stocks, Integer> idColumn;

    @FXML
    private TableColumn<stocks, String> nameColumn;

    @FXML
    private TableColumn<stocks, Integer> qtyColumn;

    @FXML
    private TableColumn<stocks, Integer> priceColumn;

    @FXML
    private TableColumn<stocks, Integer> pirceAtFullColumn;
    @FXML
    private TableColumn<stocks, String> inDateColumn;






    public  void ToLogin(ActionEvent event) throws IOException{
        Parent fxmlLoader =  load(getClass().getResource("hello-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader);
        stage.setScene(scene);
        stage.show();
    }
    public  void ToRegister(ActionEvent event) throws IOException{
        Parent fxmlLoader =  load(getClass().getResource("register.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader);
        stage.setScene(scene);
        stage.show();
    }
    public  void ToMainScreen(ActionEvent event) throws IOException {
        Parent fxmlLoader = load(getClass().getResource("Main_screen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(true);
    }


    public  void searchUpdate(ActionEvent event) throws IOException {
        Parent fxmlLoader = load(getClass().getResource("search_to_update.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(true);}

//    public  void backButton(ActionEvent event) throws IOException {
//        Parent fxmlLoader = load(getClass().getResource("Main_screen"));
//        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        stage.toBack();
//        scene = new Scene(fxmlLoader);
//        stage.setScene(scene);
//        stage.show();
//        stage.setResizable(true);}

    public  void toSearch(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("MainPane.fxml"));
        scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();}


     public void ToDelete(ActionEvent event) throws IOException {
         Parent fxmlLoader = load(getClass().getResource("delete.fxml"));
         stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
         scene = new Scene(fxmlLoader);
         stage.setScene(scene);
         stage.show();
         stage.setResizable(true);}


    @FXML
    private void insertButton() {
        String query = "insert into stocks values("+idField.getText()+",'"+nameField.getText()+"','"+qtyField.getText()+"','"+priceField.getText()+"','"+priceAtFullField.getText()+"','"+inDateField.getText()+"'); ";
        executeQuery(query);
        showStocks();
    }


    @FXML
    private void updateButton() {
        String query = "UPDATE stocks SET name= "+nameField.getText()+", quantity= "+qtyField.getText()+",price="+priceField.getText()+",price_at_full="+priceAtFullField.getText()+",in_date="+inDateField.getText()+" WHERE ID="+idField.getText()+";";
        executeQuery(query);
        showStocks();
    }
//    @FXML
//    private void updateButton1() {
//        String query = "UPDATE stocks SET name='"+nameField.getText()+"',quanity='"+qtyField.getText()+"',price="+priceField.getText()+",Price At Full="+priceAtFullField.getText()+",In Date="+inDateField.getText()+" WHERE ID="+idField.getText()+"";
//        executeQuery(query);
//        showStocks();
//    }

    @FXML
    private void deleteButton() {
        String query = "DELETE FROM stocks WHERE ID="+idField.getText()+"";
        executeQuery(query);
        showStocks();
    }

    public void executeQuery(String query) {
        Connection conn = getConnection();
        Statement st;
        try {
            st = conn.createStatement();
            st.executeUpdate(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void initialize(URL location, ResourceBundle resources) {

    }

    public Connection getConnection() {
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock_manangement","root","1206");
            return con;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public ObservableList<stocks> getBooksList(){
        ObservableList<stocks> booksList = FXCollections.observableArrayList();
        Connection connection = getConnection();
        String query = "SELECT * FROM stocks ";
        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            stocks stock;
            while(rs.next()) {
                stock = new stocks(rs.getInt("Id"),rs.getString("Name"),rs.getInt("Quantity"),rs.getInt("Price"),
                        rs.getInt("Price_At_Full"),rs.getString("In_Date"));
                booksList.add(stock);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return booksList;
    }

    // I had to change ArrayList to ObservableList I didn't find another option to do this but this works :)
    public void showStocks() {
        ObservableList<stocks> list = getBooksList();

        idColumn.setCellValueFactory(new PropertyValueFactory<stocks,Integer>("Id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<stocks,String>("Name"));
        qtyColumn.setCellValueFactory(new PropertyValueFactory<stocks,Integer>("qty"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<stocks,Integer>("price"));
        pirceAtFullColumn.setCellValueFactory(new PropertyValueFactory<stocks,Integer>("priceAtFull"));
        inDateColumn.setCellValueFactory(new PropertyValueFactory<stocks,String>("in_Date"));
        TableView.setItems(list);
    }




    public void logout(ActionEvent event) {
        javafx.application.Platform.exit();
//        stage = (Stage) pane.getScene().getWindow();
//        stage.close();


    }





}