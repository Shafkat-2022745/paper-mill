/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papermillsltd;

import java.io.FileWriter;
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
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Shanto
 */
public class User2Goal5Controller implements Initializable {

    @FXML
    private BorderPane BorderPane;
    @FXML
    private TextField water;
    @FXML
    private TextField energy;
    @FXML
    private TextField waste;
    @FXML
    private Button save;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void saveOnClick(ActionEvent event) {
        {
    // Create a string to hold the baseline assessment data
    String data = "Succession plan 1:"+water.getText()+ "\n"+"Succession plan 2:"+waste.getText()+ "\n" +
            "Succession plan 3:"+energy.getText()+ "\n" ;
    
    try {
        // Create a FileWriter object to write to the file
        FileWriter writer = new FileWriter("SucessionPlan.txt", true);
        
        // Write the data to the file
        writer.write(data);
        
        // Close the writer
        writer.close();
        
        // Clear the text fields
        water.setText("");
        waste.setText("");
        energy.setText("");
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    }

    @FXML
    private void backOnClick(ActionEvent event) throws IOException {
    Parent AddMemberParent = FXMLLoader.load(getClass().getResource("HRDashboard.fxml"));
    Scene AddMemberScene = new Scene(AddMemberParent);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Object Scene = null; /*contactDetailsScene*/
    window.setScene(AddMemberScene);
    window.show();
}
}
    
