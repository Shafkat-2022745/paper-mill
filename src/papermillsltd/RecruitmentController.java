/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papermillsltd;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.mindrot.bcrypt.BCrypt;

/**
 * FXML Controller class
 *
 * @author Shanto
 */
public class RecruitmentController implements Initializable {

    @FXML
    private TextArea textField;
    @FXML
    private Button save;
    @FXML
    private Button back;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void saveOnClick(ActionEvent event){
       {
    // Create a string to hold the baseline assessment data
    String data = "Job Circular:           "+textField.getText() + "\n";
    
    try {
        // Create a FileWriter object to write to the file
        FileWriter writer = new FileWriter("JobCircular.txt", true);
        
        // Write the data to the file
        writer.write(data);
        
        // Close the writer
        writer.close();
        
        // Clear the text fields
        textField.setText("");

    } catch (IOException e) {
        e.printStackTrace();
    }
}
    }

    @FXML
    private void backOnAction(ActionEvent event) throws IOException {
    Parent AddMemberParent = FXMLLoader.load(getClass().getResource("HRDashboard.fxml"));
    Scene AddMemberScene = new Scene(AddMemberParent);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Object Scene = null; /*contactDetailsScene*/
    window.setScene(AddMemberScene);
    window.show();
}
    
}
