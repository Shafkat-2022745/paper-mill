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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class ResCusProbController implements Initializable {

    @FXML
    private TextField nm;
    @FXML
    private TextField em;
    @FXML
    private TextArea textarea;
    
    private ArrayList<Comclass> rescus;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Comclass RS;
        RS = new Comclass();
        rescus = new ArrayList<Comclass>();
        // TODO
    }    

    @FXML
    private void TocusS(ActionEvent event) throws IOException {
        Parent twoViewParent = FXMLLoader.load(getClass().getResource("CustomerService.fxml"));
        Scene twoViewScene = new Scene(twoViewParent);
        
        Stage two = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        two.setScene(twoViewScene);
        two.show();
    }

    @FXML
    private void com(ActionEvent event) {
        rescus.add(
            new Comclass(
                nm.getText(),
                em.getText()
                    
            )
        );
        
        textarea.clear();
        for (Comclass RS : rescus){
            textarea.appendText(RS.toString());
        }
    }
    
}
