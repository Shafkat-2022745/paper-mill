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
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Shanto
 */
public class RiskController implements Initializable {

    @FXML
    private BorderPane BorderPane;
    @FXML
    private TextField water;
    @FXML
    private TextField energy;
    @FXML
    private TextField waste;
    @FXML
    private TextField safety;
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
    String data = "Risk 1:"+water.getText() + "," + "Risk 2:"+waste.getText() + "," + "Risk 3:" + safety.getText() + "," + "Risk 4:"+energy.getText() + "\n";
    
    try {
        // Create a FileWriter object to write to the file
        FileWriter writer = new FileWriter("Risk.txt", true);
        
        // Write the data to the file
        writer.write(data);
        
        // Close the writer
        writer.close();
        
        // Clear the text fields
        water.setText("");
        waste.setText("");
        safety.setText("");
        energy.setText("");
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    }

    
}
