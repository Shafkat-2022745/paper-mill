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
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class InSalRevController implements Initializable {

    @FXML
    private Text Comname;
    @FXML
    private Text Comemail;
    @FXML
    private Text ComCode;
    @FXML
    private TextArea Showofinsalesrev;
    @FXML
    private TextField comName;
    @FXML
    private TextField Em;
    @FXML
    private TextField Comcode;
    
    private ArrayList<IncreClass> stack;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        IncreClass IC;
        IC = new IncreClass();
        stack = new ArrayList<IncreClass>();
        // TODO
    }    

    @FXML
    private void AddStake(ActionEvent event) {
        stack.add(
            new IncreClass(
                comName.getText(),
                Comcode.getText(),
                Em.getText()
                    
                )
            );
        
        
    }

    @FXML
    private void toSandM(ActionEvent event) throws IOException {
        Parent mainpage = FXMLLoader.load(getClass().getResource("DashOfUser.fxml"));
        Scene mainScene = new Scene(mainpage);
        
        Stage st = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        st.setScene(mainScene);
        st.show();
    }

    @FXML
    private void ShowS(ActionEvent event) {
        Showofinsalesrev.clear();
        for (IncreClass IC : stack){
                Showofinsalesrev.appendText(IC.toString());
        
        
    }
}
}    
