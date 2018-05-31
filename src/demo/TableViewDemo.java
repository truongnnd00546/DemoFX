/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.ProductModel;

/**
 *
 * @author NAM TRUONG
 */
public class TableViewDemo extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        ProductModel model = new ProductModel();
        TableView<Product> tableView = new TableView<>();
        TableColumn<Product, String> columnName = new TableColumn<>("Name");
        columnName.setCellValueFactory(new PropertyValueFactory<>("name"));
        columnName.setMinWidth(200);
        
        TableColumn<Product, String> columnImage = new TableColumn<>("Image");
        columnImage.setCellValueFactory(new PropertyValueFactory<>("image"));
        columnImage.setMinWidth(200);
        
        TableColumn<Product, String> columnPrice = new TableColumn<>("Price");
        columnPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        columnPrice.setMinWidth(200);
        
        tableView.getColumns().addAll(columnName, columnImage, columnPrice);
        
        tableView.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Product p = tableView.getSelectionModel().getSelectedItem();
                System.out.println(p.getName());
                System.out.println(p.getImage());
                System.out.println(p.getPrice());
            }
        });
        Scene scene = new Scene(tableView,600,500);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
