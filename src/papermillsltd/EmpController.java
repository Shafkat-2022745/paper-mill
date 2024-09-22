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
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class EmpController implements Initializable {

    @FXML
    private TextField emname;
    @FXML
    private TextField emid;
    @FXML
    private TextField emperformance;
    @FXML
    private TextField removeid;
    @FXML
    private TableView<Emp> tableview;
    @FXML
    private TableColumn<Emp,String> namecol;
    @FXML
    private TableColumn<Emp,String> idcol;
    @FXML
    private TableColumn<Emp,String> performancecol;
    private ArrayList<Emp>em;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        em= new ArrayList<Emp>();
        Emp e;
        e= new Emp();
        
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
    private void AddtoArray(ActionEvent event) {
        if(emname.getText().isEmpty() && emid.getText().isEmpty()){
        }
        
        else{
        
            em.add(
              
                    new Emp(
                    
                            emname.getText(),
                            emid.getText(),
                            emperformance.getText()
                    )
            );
        }
         
        emname.clear();
        emid.clear();
        emperformance.clear();
    }

    @FXML
    private void AddtoFile(ActionEvent event) {
        try{
        
            FileOutputStream fos=new FileOutputStream("Emp.bin");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            
            for(Emp e:em){
            
                oos.writeObject(e);
            }
    }
        catch(Exception e){
        }
    }

    @FXML
    private void ShowonTable(ActionEvent event) {
        
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

    @FXML
    private void Remove(ActionEvent event) {
        
       for(Emp e: em){
            if(removeid.getText().equals(e.getID())){
                em.remove(e);
                tableview.getItems().clear();
                break;
            }
        }
       
       for(Emp e: em){
           tableview.getItems().add(e);
       }
    }
    
}
