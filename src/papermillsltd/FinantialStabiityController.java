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
public class FinantialStabiityController implements Initializable {

    @FXML
    private Button finantialPieChartButton;
    @FXML
    private Button finantialGoalButton;
    @FXML
    private Button reportGenerateButton;
    @FXML
    private Button assignResponsibilities;
    @FXML
    private Button backButton;
    @FXML
    private BorderPane borderPane;

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
            Logger.getLogger(FinantialStabiityController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void finantialPieChartLoadOnAction(ActionEvent event) {
        loadUI("UI2");
    }

    @FXML
    private void finantialGoalOnAction(ActionEvent event) {
        loadUI("FinantialGoal");
    }

    @FXML
    private void reportGenerateOnClick(ActionEvent event) {
        loadUI("PDFGenerate");
    }


    @FXML
    private void assignResponsibilitiesOnClick(ActionEvent event)  {
    loadUI("AssignResponsibilityes");
}
    @FXML
    private void backOnClick(ActionEvent event) throws IOException {
    Parent loginSceneParent = FXMLLoader.load(getClass().getResource("BODDashboard.fxml"));
    Scene loginSceneScene = new Scene(loginSceneParent);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Object Scene = null; /*contactDetailsScene*/
    window.setScene(loginSceneScene);
    window.show();
}
    
}
