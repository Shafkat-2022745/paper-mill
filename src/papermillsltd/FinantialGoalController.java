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
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Shanto
 */
public class FinantialGoalController implements Initializable {

    @FXML
    private TextArea GoalTextField;
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
        String data = "Goal:"+GoalTextField.getText() + "\n";
    
    try {
        // Create a FileWriter object to write to the file
        FileWriter writer = new FileWriter("Goal.txt", true);
        
        // Write the data to the file
        writer.write(data);
        
        // Close the writer
        writer.close();
        
        // Clear the text fields
        GoalTextField.setText("");
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    }

