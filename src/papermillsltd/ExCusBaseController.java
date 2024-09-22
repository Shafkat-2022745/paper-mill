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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class ExCusBaseController implements Initializable {

    @FXML
    private TextField cusNam;
    @FXML
    private TextField Cusno;
    @FXML
    private TextField CusAdd;
    @FXML
    private TextArea Cusinfo;
    
    private ArrayList<ExpandClass> exp;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ExpandClass EC;
        EC = new ExpandClass();
        exp = new ArrayList<ExpandClass>();
        
        // TODO
    }    

    @FXML
    private void toSales(ActionEvent event) throws IOException {
        Parent twoViewParent = FXMLLoader.load(getClass().getResource("SandM.fxml"));
        Scene twoViewScene = new Scene(twoViewParent);
        
        Stage two = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        two.setScene(twoViewScene);
        two.show();
    }

    @FXML
    private void Add(ActionEvent event) {
        exp.add(
            new ExpandClass(
                cusNam.getText(),
               Cusno.getText(),
                CusAdd.getText()
                    
                )
            );
    
}

    @FXML
    private void Details(ActionEvent event) {
        Cusinfo.clear();
        for (ExpandClass IC : exp){
                Cusinfo.appendText(IC.toString());
        
    }
}
}