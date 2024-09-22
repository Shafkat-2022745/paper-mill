/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papermillsltd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import static java.util.Optional.empty;
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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class ProductController implements Initializable {

    @FXML
    private TableView<Product> tableView;
    @FXML
    private TableColumn<Product, String> namecol;
    @FXML
    private TableColumn<Product, String> pricecol;
    @FXML
    private TableColumn<Product, String> mdatecol;
    @FXML
    private TextField nameField;
    @FXML
    private TextField priceField;
    @FXML
    private DatePicker mdate;
    private ArrayList<Product> productcount;
    @FXML
    private TextField removebyName;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        productcount = new ArrayList<Product>();
        Product p;
        p= new Product();
        
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
    private void AddToArray(ActionEvent event) {
        if(nameField.getText().isEmpty() && priceField.getText().isEmpty()){
       
       }
        else{
            productcount.add(
            new Product(
                nameField.getText(),
                priceField.getText(),
                mdate.getValue()
            )
      
        );
        }
        nameField.clear();
        priceField.clear();
        mdate.setValue(null);
       
    }

    @FXML
    private void AddToFile(ActionEvent event) {
       
       try{
        
        FileOutputStream fos= new FileOutputStream("Product.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        for(Product p: productcount){
           oos.writeObject(p);
        }
       }
       catch(Exception e){
       
       }
       
    }

    @FXML
    private void ViewOnTable(ActionEvent event) throws FileNotFoundException, IOException {
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

    @FXML
    private void Remove(ActionEvent event) {
        for(Product p: productcount){
            if(removebyName.getText().equals(p.getName())){
                productcount.remove(p);
                tableView.getItems().clear();
                break;
            }
        }
        for(Product p: productcount){
            tableView.getItems().add(p);
        }
    }
    
}
