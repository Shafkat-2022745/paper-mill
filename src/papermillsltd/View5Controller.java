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
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Shanto
 */
public class View5Controller implements Initializable {

    @FXML
    private TextArea ReadFromTextFile;
    @FXML
    private Button showDetails;

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
        FileReader reader = new FileReader("C&B.txt");
        
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
}
