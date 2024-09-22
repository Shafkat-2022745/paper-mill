/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papermillsltd;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class ReviewController implements Initializable {

    @FXML
    private TextField pname;
    @FXML
    private TextField review;
    private ArrayList<Review>rev;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        rev= new ArrayList<Review>();
        Review r;
        r= new Review();
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
    private void click(ActionEvent event) {
        
        try{
          
            FileOutputStream fos= new FileOutputStream("Review.bin");
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            
            for(Review r:rev){
                oos.writeObject(r);
            }
        }
        
        catch(Exception e){
        
        }
    }

    @FXML
    private void AddtoArray(ActionEvent event) {
        if(pname.getText().isEmpty() && review.getText().isEmpty()){
        
        }
        else{
          rev.add(
           new Review(
             pname.getText(),
             review.getText()
           
           )
          );
        
        }
        
        pname.clear();
        review.clear();
    }
    
}
