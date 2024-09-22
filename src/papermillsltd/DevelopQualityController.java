/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papermillsltd;

import java.io.IOException;
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
public class DevelopQualityController implements Initializable {

    @FXML
    private TextField pname;
    @FXML
    private ComboBox<String> quality;
    private ArrayList<DevelopQuality>devq;
    @FXML
    private TextArea screen;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        quality.getItems().addAll("good","bad","worst");
       
        devq = new ArrayList<DevelopQuality>();
        DevelopQuality dq;
        dq = new DevelopQuality();
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
    private void Show(ActionEvent event) {
       screen.clear();
        for(DevelopQuality dq:devq){
          screen.appendText(dq.toString());
        }
    }

    @FXML
    private void add(ActionEvent event) {
        devq.add(
         new DevelopQuality(
            pname.getText(),
            quality.getValue()
         )
        );
    }
    
}
