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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class RetandRefController implements Initializable {

    @FXML
    private TextField nm;
    @FXML
    private TextField addr;
    @FXML
    private RadioButton ret;
    @FXML
    private ToggleGroup f;
    @FXML
    private RadioButton ref;
    @FXML
    private TextArea textarea;
    
    private ArrayList<Backproc> retref;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        Backproc RAR;
        RAR = new Backproc();
        retref = new ArrayList<Backproc>();
        
        
        // TODO
    }    

    @FXML
    private void CRfromrandr(ActionEvent event) throws IOException {
        Parent twoViewParent = FXMLLoader.load(getClass().getResource("CustomerService.fxml"));
        Scene twoViewScene = new Scene(twoViewParent);
        
        Stage two = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        two.setScene(twoViewScene);
        two.show();
    }

    @FXML
    private void record(ActionEvent event) {
        retref.add(
            new Backproc(
                nm.getText(),
                (ret.isSelected()?"Return":"Refund"),
                addr.getText()
            )
        );
    }

    @FXML
    private void showA(ActionEvent event) {
        
        textarea.clear();
        for (Backproc RAR : retref){
            textarea.appendText(RAR.toString());
        }
    }
    
}
