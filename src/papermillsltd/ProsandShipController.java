/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papermillsltd;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class ProsandShipController implements Initializable {

    @FXML
    private AnchorPane dob;
    @FXML
    private TextField nam;
    @FXML
    private TextField prod;
    @FXML
    private TextField addr;
    @FXML
    private TextField pric;
    @FXML
    private TableView<Orandship> tableview;
    @FXML
    private TableColumn<Orandship, String> Nmc1;
    @FXML
    private TableColumn<Orandship, String> prodc2;
    @FXML
    private TableColumn<Orandship, String> Addc3;
    @FXML
    private TableColumn<Orandship, String> dc4;
    @FXML
    private TableColumn<Orandship, String> pric5;
    
    private ArrayList<Orandship> order;
    @FXML
    private DatePicker DOB;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Orandship OS;
        OS = new Orandship();
        order = new ArrayList <Orandship>();
        Nmc1.setCellValueFactory(new PropertyValueFactory<Orandship,String>("name"));
        prodc2.setCellValueFactory(new PropertyValueFactory<Orandship,String>("prodcut"));
        Addc3.setCellValueFactory(new PropertyValueFactory<Orandship,String>("address"));
        dc4.setCellValueFactory(new PropertyValueFactory<Orandship,String>("date"));
        pric5.setCellValueFactory(new PropertyValueFactory<Orandship,String>("price"));
        // TODO
    }    

    @FXML
    private void toCS(ActionEvent event) throws IOException {
        Parent twoViewParent = FXMLLoader.load(getClass().getResource("CustomerService.fxml"));
        Scene twoViewScene = new Scene(twoViewParent);
        
        Stage two = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        two.setScene(twoViewScene);
        two.show();
    }

    @FXML
    private void sh(ActionEvent event) {
        
     
        order.add(
            new Orandship(
                nam.getText(),
                prod.getText(),
                addr.getText(),
                pric.getText(),
                DOB.getValue()
                    
            )
        );
        nam.clear();
        prod.clear();
        addr.clear();
        pric.clear();
        DOB.setValue(null);
        tableview.getItems().clear();
        for (Orandship OS: order){
            tableview.getItems().add(OS);
        }
    }
    
}
