/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papermillsltd;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class HighQuController implements Initializable {

    @FXML
    private TextField matname;
    @FXML
    private ComboBox<String> type;
    @FXML
    private TextField prodcode;
    @FXML
    private TextArea textarea;
    
    private ArrayList<Quality> qual;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        type.getItems().addAll("White paper","News Print");
        Quality HQ;
        HQ = new Quality();
        qual = new ArrayList<Quality>();
        
        // TODO
    }    

    @FXML
    private void FromHsales(ActionEvent event) throws IOException {
        Parent twoViewParent = FXMLLoader.load(getClass().getResource("SandM.fxml"));
        Scene twoViewScene = new Scene(twoViewParent);
        
        Stage two = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        two.setScene(twoViewScene);
        two.show();
    }

    @FXML
    private void add(ActionEvent event) {
        qual.add(
            new Quality(
                matname.getText(),
                type.getValue(),
                prodcode.getText()
            )
        );
    }

    @FXML
    private void file(ActionEvent event) throws FileNotFoundException, IOException { //throws are used because we didn't use the try catch exceptions
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fout=new FileOutputStream("Quality.dat");
        DataOutputStream dout=new DataOutputStream(fout);
        fout.close();
        dout.close();
        ob.close();
    }

    @FXML
    private void show(ActionEvent event) {
        
        textarea.clear();
        for (Quality HQ : qual){
            textarea.appendText(HQ.toString());
        }
    }
    
}
