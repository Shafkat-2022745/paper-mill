/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papermillsltd;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class QualityCheckController implements Initializable {

    @FXML
    private TableColumn<Product, String> namecol;
    @FXML
    private TableColumn<Product, String> pricecol;
    @FXML
    private TableColumn<Product, String> mdatecol;
    @FXML
    private TableView<Product> tableView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         namecol.setCellValueFactory(new PropertyValueFactory<Product, String>("name"));
        pricecol.setCellValueFactory(new PropertyValueFactory<Product, String>("price"));
        mdatecol.setCellValueFactory(new PropertyValueFactory<Product, String>("mdate"));
        
    }    

    @FXML
    private void Bk(ActionEvent event) throws IOException {
        Parent mainpage = FXMLLoader.load(getClass().getResource("scene3.fxml"));
        Scene mainScene = new Scene(mainpage);
        
        Stage st = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        st.setScene(mainScene);
        st.show();
    }

    @FXML
    private void ViewP(ActionEvent event) {
        
         try{
         Product p;   
         FileInputStream fis= new FileInputStream("Product.bin");
         ObjectInputStream ois= new ObjectInputStream(fis);
        
         tableView.getItems().clear();
         while(true){
           p= (Product) ois.readObject();
           tableView.getItems().add(p);
         }
        }
        catch(Exception e){
        }
    }
    
}
