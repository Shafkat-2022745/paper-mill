/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papermillsltd;

import java.io.BufferedReader;
import java.io.DataOutputStream;
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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class CustFedController implements Initializable {

    @FXML
    private TextField cusn;
    @FXML
    private TextField cuse;
    @FXML
    private TextField cusf;
    @FXML
    private TextArea textarea;
    
    private ArrayList<CusFeed> Feed;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        CusFeed CF;
        CF = new CusFeed();
        Feed = new ArrayList<CusFeed>();
        
        // TODO
    }    

    @FXML
    private void frtosales(ActionEvent event) throws IOException {
        Parent twoViewParent = FXMLLoader.load(getClass().getResource("SandM.fxml"));
        Scene twoViewScene = new Scene(twoViewParent);
        
        Stage two = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        two.setScene(twoViewScene);
        two.show();
    }

    @FXML
    private void feedback(ActionEvent event) {
        textarea.clear();
        Feed.add(
           new CusFeed(
               cusn.getText(),
               cuse.getText(),
               cusf.getText()
           )
        );
        
    }

    @FXML
    private void show(ActionEvent event) {
        textarea.clear();
        for (CusFeed CF :Feed){
            textarea.appendText(CF.toString());
            
        }
    }

    @FXML
    private void file(ActionEvent event) {
        try{
            BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
            FileOutputStream fout = new FileOutputStream("CusFeed.dat");
            DataOutputStream dout=new DataOutputStream(fout); 
            fout.close();
            dout.close();
            ob.close();
        }
        
        catch(Exception e){
        
    }
    } 
}
