package com.example.project_assignment;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ReadFunctionController {
//  @FXML
//  private TableView<ReadFunction>productTableView;
//  @FXML
//  private TableColumn<ReadFunction, Integer> productIDTableColumn;
//  @FXML
//  private TableColumn<ReadFunction, Integer> quantityTotalTableColumn;
//  @FXML
//  private TableColumn<ReadFunction, Integer> quantityRemainTableColumn;
//  @FXML
//  private TableColumn<ReadFunction, String> brandTableColumn;
//  @FXML
//  private TableColumn<ReadFunction, String> nameProductTableColumn;
//  @FXML
//  private TableColumn<ReadFunction, String> dateTableColumn;



    @FXML
    private TableColumn<?, ?> BrandTableColumn;

    @FXML
    private TableColumn<?, ?> DateTableColumn;

    @FXML
    private TableColumn<?, ?> IDTableView;

    @FXML
    private TableColumn<?, ?> NameTableColum;

    @FXML
    private TableColumn<?, ?> RemainTableColumn;

    @FXML
    private TableView<?> SearchTextField;

    @FXML
    private TableColumn<?, ?> TotalTableColumn;

    @FXML
    private TextField search;





 ObservableList<ReadFunction>productModelObservableList= FXCollections.observableArrayList();
  private DatabaseConnection CollectNow;


 public  void  initialize(URL url, ResourceBundle resource) {
//    DatabaseConnection connection = new DatabaseConnection();
//    Collection collectDB = CollectNow.getDBConnection();
//    String productViewQuery = "SELECT ProductID,Brand,nameProduct,date,quantityTotal,quantityRemain";
//      try {
//          Statement statement = collectDB.createStatement();
//          ResultSet QueryOutput=statement.executeQuery(productViewQuery);
//          while (QueryOutput.next()){
//              Integer QueryProductID=QueryOutput.getInt("ProductID");
//              String QueryBrand=QueryOutput.getString("Brand");
//              String QueryNameProduct=QueryOutput.getString("NameProduct");
//              String QueryDate=QueryOutput.getString("Date");
//              Integer QueryQuantityTotal=QueryOutput.getInt("QuantityTotal");
//              Integer QueryQuantityRemain=QueryOutput.getInt("QuantityRemain");
//
//
////populate the Observablelist
//              productModelObservableList.add(new ReadFunction(QueryProductID,QueryBrand,QueryNameProduct,QueryDate,QueryQuantityTotal,QueryQuantityRemain));
//          }
//          productIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("ProductID"));
//          quantityTotalTableColumn.setCellValueFactory(new PropertyValueFactory<>("quantityTotal"));
//          quantityRemainTableColumn.setCellValueFactory(new PropertyValueFactory<>("quantityRemain"));
//          brandTableColumn.setCellValueFactory(new PropertyValueFactory<>("brand"));
//          nameProductTableColumn.setCellValueFactory(new PropertyValueFactory<>("Name"));
//          dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("Date"));
//          productViewQuery.setItems(productModelObservableList);
//
//
//
//      } catch (SQLException e) {
//          Logger.getLogger(ReadFunctionController.class.getName()).log(Level.SEVERE,null,e);
//          e.printStackTrace();
//      }


  }
}
