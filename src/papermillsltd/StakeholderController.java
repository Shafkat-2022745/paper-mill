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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class StakeholderController implements Initializable {

    @FXML
    private ComboBox<String> relation;
    @FXML
    private TextArea screen;
    @FXML
    private TextField name;
    private ArrayList<Stakeholder>stake;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        relation.getItems().addAll("Good","Bad","Wrost");
        stake= new ArrayList<Stakeholder>();
        Stakeholder s;
        s= new Stakeholder();
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
    private void Add(ActionEvent event) {
       screen.clear();
        stake.add(
         new Stakeholder(
                
                 name.getText(),
                 relation.getValue()
         )
        );
    }

    @FXML
    private void Show(ActionEvent event) {
        for(Stakeholder s: stake){
         
            screen.appendText(s.toString());
        }
    }
    
}
