/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papermillsltd;

import java.io.BufferedReader;
import java.io.FileReader;
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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Shanto
 */
public class CultureController implements Initializable {

    @FXML
    private TextArea screen;
    @FXML
    private TextField name;
    @FXML
    private TextField share;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Bk(ActionEvent event) throws IOException {
    Parent AddMemberParent = FXMLLoader.load(getClass().getResource("BODDashboard.fxml"));
    Scene AddMemberScene = new Scene(AddMemberParent);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Object Scene = null; /*contactDetailsScene*/
    window.setScene(AddMemberScene);
    window.show();
}

    @FXML
    private void Add(ActionEvent event) {
        String data = "Create Culture :"+name.getText() + "    " + "Delete Culture:"+share.getText();
    
    try {
        // Create a FileWriter object to write to the file
        FileWriter writer = new FileWriter("Culture.txt", true);
        
        // Write the data to the file
        writer.write(data);
        
        // Close the writer
        writer.close();
        
        // Clear the text fields
        name.setText("");
        share.setText("");
    } catch (IOException e) {
        e.printStackTrace();
    }
    }

    @FXML
    private void Show(ActionEvent event) {
        try {
        // Create a FileReader object to read from the file
        FileReader reader = new FileReader("Culture.txt");
        
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
        screen.setText(contents);
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    
}
