/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import model.ProductModel;

/**
 *
 * @author xuanhung
 */
public class MyApplication extends Application {

    private Scene scene1;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        ProductModel model = new ProductModel();
        GridPane gridpane = new GridPane();
        gridpane.setPadding(new Insets(20, 20, 20, 20));
        gridpane.setHgap(20);
        gridpane.setVgap(20);
        gridpane.setAlignment(Pos.CENTER);

        Label lblName = new Label("Name");
        Label lblImage = new Label("Image");
        Label lblPrice = new Label("Price");
        TextField txtName = new TextField();
        TextField txtImage = new TextField();
        TextField txtPrice = new TextField();
        Button btnSubmit = new Button("Submit");
        btnSubmit.setOnAction((event) -> {
            String name = txtName.getText();
            String image = txtImage.getText();
            String price = txtPrice.getText();
            Product product = new Product( name, image, price);
            model.submit(product);
            System.out.println("Oder thành công");
        });
        Button btnReset = new Button("Reset");

        gridpane.add(lblName, 0, 0, 1, 1);
        gridpane.add(lblImage, 0, 1, 1, 1);
        gridpane.add(lblPrice, 0, 2, 1, 1);
        gridpane.add(txtName, 1, 0, 1, 1);
        gridpane.add(txtImage, 1, 1, 1, 1);
        gridpane.add(txtPrice, 1, 2, 1, 1);
       
        HBox hbox = new HBox();
        hbox.setSpacing(10);
        hbox.getChildren().addAll(btnSubmit, btnReset);
        
        gridpane.add(hbox, 1, 3, 1, 1);        
        
        scene1 = new Scene(gridpane, 500, 250);

        stage.setScene(scene1);
        stage.show();
    }
}
