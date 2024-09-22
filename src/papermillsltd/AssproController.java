/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papermillsltd;

import java.io.FileInputStream;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class AssproController implements Initializable {

    @FXML
    private TextField Ename;
    @FXML
    private TextField EID;
    @FXML
    private TextField AssW;
    @FXML
    private TableColumn<Assigned, String > N;
    @FXML
    private TableColumn<Assigned, String> AW;
    
    private ArrayList<Assigned> workAssigned;
    @FXML
    private TableView<Assigned> tableview;
    @FXML
    private TableColumn<Assigned, String> I;
    
    private ArrayList<Assigned>Workassigned;
    private TextArea window;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Assigned WA;
        WA = new Assigned();
        Workassigned = new ArrayList<Assigned>();
        
        N.setCellValueFactory(new PropertyValueFactory<Assigned,String>("name"));
        AW.setCellValueFactory(new PropertyValueFactory<Assigned,String>("ID"));
        I.setCellValueFactory(new PropertyValueFactory<Assigned,String>("Duty"));
        // TODO
    }    

    @FXML
    private void toosal(ActionEvent event) throws IOException {
        Parent twoViewParent = FXMLLoader.load(getClass().getResource("SandM.fxml"));
        Scene twoViewScene = new Scene(twoViewParent);
        
        Stage two = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        two.setScene(twoViewScene);
        two.show();
    }

    @FXML
    private void List(ActionEvent event) {
        Workassigned.add(
            new Assigned(
                Ename.getText(),
                EID.getText(),
                AssW.getText()
            )
        );
    }

    @FXML
    private void File(ActionEvent event) {
        
        try{
           FileOutputStream aiw = new FileOutputStream("Assigned.bin");
           ObjectOutputStream aiiw = new ObjectOutputStream(aiw);
           for (Assigned WA: Workassigned){
               aiiw.writeObject(WA);
            }
           aiiw.close();
        }
        
        catch(Exception e){
            
        }
    }

    @FXML
    private void Table(ActionEvent event) {
        Assigned WA;
        try{
            FileInputStream fis = new FileInputStream("Assigned.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            tableview.getItems().clear();
            
            while(true){
                WA = (Assigned)ois.readObject();
                tableview.getItems().add(WA);
            }
        }
        catch(Exception e){
        
        }
        
        
}
}
