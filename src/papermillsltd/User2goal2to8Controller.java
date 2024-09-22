/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papermillsltd;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author KING
 */
public class User2goal2to8Controller implements Initializable {

    @FXML
    private Button viewDetails;
    @FXML
    private Button back;
    @FXML
    private BorderPane borderPane;
    @FXML
    private Button sp;
    @FXML
    private Button cb;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
  private void loadUI(String ui) {
        Parent root;
        try {
            root = javafx.fxml.FXMLLoader.load(getClass().getResource(ui+".fxml"));
            borderPane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(OperatiosController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void viewDetailsAction(ActionEvent event) {
        loadUI("View3");
    }

    @FXML
    private void backButtonOnAction(ActionEvent event) throws IOException {
    Parent loginSceneParent = FXMLLoader.load(getClass().getResource("HRDashboard.fxml"));
    Scene loginSceneScene = new Scene(loginSceneParent);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Object Scene = null; /*contactDetailsScene*/
    window.setScene(loginSceneScene);
    window.show();
}

    @FXML
    private void spOnClick(ActionEvent event) {
         loadUI("view4");
    }

    @FXML
    private void cbOnClick(ActionEvent event) {
         loadUI("view5");
    }
    
}
