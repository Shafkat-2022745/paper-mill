/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papermillsltd;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Shanto
 */
public class DevelopByController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void pressToBack(ActionEvent event) throws IOException  {
        Parent mainpage = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
        Scene mainScene = new Scene(mainpage); 
        Stage st = (Stage)((Node)event.getSource()).getScene().getWindow();
        st.setScene(mainScene);
        st.show();
    }
    
}
