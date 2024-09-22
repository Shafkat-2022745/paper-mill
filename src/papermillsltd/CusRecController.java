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
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
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
public class CusRecController implements Initializable {

    @FXML
    private TextField CusN;
    @FXML
    private TextField numormail;
    @FXML
    private ComboBox<String> Cho;
    @FXML
    private TableView<RecClass> tableview;
    @FXML
    private TableColumn<RecClass, String> nmc1;
    @FXML
    private TableColumn<RecClass, String> numc2;
    @FXML
    private TableColumn<RecClass, String> detc3;
    @FXML
    private TextField rem;
    
    private ArrayList<RecClass> record;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Cho.getItems().addAll("Mobile","Email");
        RecClass CR;
        CR = new RecClass();
        record = new ArrayList<RecClass>();
        nmc1.setCellValueFactory(new PropertyValueFactory<RecClass,String>("name"));
        numc2.setCellValueFactory(new PropertyValueFactory<RecClass,String>("choice"));
        detc3.setCellValueFactory(new PropertyValueFactory<RecClass,String>("info"));
        // TODO
    }    

    @FXML
    private void frCusS(ActionEvent event) throws IOException {
        Parent twoViewParent = FXMLLoader.load(getClass().getResource("CustomerService.fxml"));
        Scene twoViewScene = new Scene(twoViewParent);
        
        Stage two = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        two.setScene(twoViewScene);
        two.show();
    }

    @FXML
    private void addlist(ActionEvent event) {
        record.add(
            new RecClass(
                CusN.getText(),
                Cho.getValue(),
                numormail.getText()
                
                    
            )
        );
        CusN.clear();
        Cho.setValue(null);
        numormail.clear();
    }

    @FXML
    private void addfile(ActionEvent event) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("RecClass.bin");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        for (RecClass CR : record){
            os.writeObject(CR);
        }
        os.close();
        
        
    }

    @FXML
    private void show(ActionEvent event) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        RecClass CR;
        FileInputStream fis = new FileInputStream("RecClass.bin");
        ObjectInputStream oi = new ObjectInputStream(fis);
        tableview.getItems().clear();
        
        while(true){
            CR = (RecClass) oi.readObject();
            tableview.getItems().add(CR);
        }
        
    }

    @FXML
    private void discard(ActionEvent event) {
        for (RecClass CR: record){
            if (rem.getText().equals(CR.getName())){
                record.remove(CR);
                tableview.getItems().clear();
                break;
            }
        }
        for (RecClass CR: record){
            tableview.getItems().add(CR);
        }
    }
    
}
