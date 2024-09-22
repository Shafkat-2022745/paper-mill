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
public class TranningController implements Initializable {

    @FXML
    private TableView<Emp> tableview;
    @FXML
    private TableColumn<Emp, String> namecol;
    @FXML
    private TableColumn<Emp, String> idcol;
    @FXML
    private TableColumn<Emp, String> performancecol;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         namecol.setCellValueFactory(new PropertyValueFactory<Emp,String>("Name"));
        idcol.setCellValueFactory(new PropertyValueFactory<Emp,String>("ID"));
        performancecol.setCellValueFactory(new PropertyValueFactory<Emp,String>("Performance"));
    }    

    @FXML
    private void Bk(ActionEvent event) throws IOException {
        Parent mainpage = FXMLLoader.load(getClass().getResource("scene2.fxml"));
        Scene mainScene = new Scene(mainpage);
        
        Stage st = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        st.setScene(mainScene);
        st.show();
    }

    @FXML
    private void ShowPerformance(ActionEvent event) {
         try{
            Emp e;
            FileInputStream fis=new FileInputStream("Emp.bin");
            ObjectInputStream ois=new ObjectInputStream(fis);
            
            tableview.getItems().clear();
            while(true){
            
                e= (Emp) ois.readObject();
                tableview.getItems().add(e);
            }
        }
        catch(Exception e){
        }
    }
    
}
