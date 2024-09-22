/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papermillsltd;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class ProductImproveController implements Initializable {

    @FXML
    private TextArea screen;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Bk(ActionEvent event) throws IOException {
        Parent mainpage = FXMLLoader.load(getClass().getResource("scene3.fxml"));
        Scene mainScene = new Scene(mainpage);
        
        Stage st = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        st.setScene(mainScene);
        st.show();
    }

    @FXML
    private void ShowReview(ActionEvent event) {
        try{
           
            Review r;
            FileInputStream fis= new FileInputStream("Review.bin");
            ObjectInputStream ois= new ObjectInputStream(fis);
            
            screen.clear();
            while(true) {
            r= (Review) ois.readObject();
            screen.appendText(r.toString());
            }
        }
        
        catch(Exception e){
        
        }
    }
    
}
