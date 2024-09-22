/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papermillsltd;

import java.io.BufferedReader;
import java.io.FileReader;
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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Shanto
 */
public class View2Controller implements Initializable {

    @FXML
    private TextArea ReadFromTextFile;
    @FXML
    private Button showDetails;
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
    private void showDetailsOnClick(ActionEvent event) {
        try {
        // Create a FileReader object to read from the file
        FileReader reader = new FileReader("Risk.txt");
        
        // Create a BufferedReader object to buffer the input
        BufferedReader bufferedReader = new BufferedReader(reader);

        String line;
        String contents = "";
        
        // Read each line of the file and add it to the contents string
        while ((line = bufferedReader.readLine()) != null) {
            contents += line + "\n";
        }
        
        // Close the buffered reader and the file reader
        bufferedReader.close();
        reader.close();

        // Set the contents of the output area
        ReadFromTextFile.setText(contents);
    } catch (IOException e) {
        e.printStackTrace();
    }
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
