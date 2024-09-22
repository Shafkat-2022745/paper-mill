/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papermillsltd;

import static java.awt.AWTEventMulticaster.remove;
import static java.awt.AWTEventMulticaster.remove;
import static java.awt.AWTEventMulticaster.remove;
import static java.awt.AWTEventMulticaster.remove;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class AnatrendsController implements Initializable {

    @FXML
    private TextField papsize;
    @FXML
    private TextField idea;
    @FXML
    private TableView<AnaClass> tableview;
    @FXML
    private TableColumn<AnaClass, String> col1;
    @FXML
    private TableColumn<AnaClass, String> col2;
    @FXML
    private TableColumn<AnaClass, String> id3;
    @FXML
    private ToggleGroup p;
    @FXML
    private RadioButton white;
    @FXML
    private RadioButton news;
    
    private ArrayList<AnaClass> Anatable;
    @FXML
    private TextField rem;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        AnaClass AT;
        AT = new AnaClass();
        Anatable = new ArrayList<AnaClass>();
        col1.setCellValueFactory(new PropertyValueFactory<AnaClass,String>("size"));
        col2.setCellValueFactory(new PropertyValueFactory<AnaClass,String>("type"));
        id3.setCellValueFactory(new PropertyValueFactory<AnaClass,String>("idea"));
        
        // TODO
    }    

    @FXML
    private void FtoSales(ActionEvent event) throws IOException {
        Parent twoViewParent = FXMLLoader.load(getClass().getResource("SandM.fxml"));
        Scene twoViewScene = new Scene(twoViewParent);
        
        Stage two = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        two.setScene(twoViewScene);
        two.show();
    }

    @FXML
    private void Add(ActionEvent event) {
        if(papsize.getText().isEmpty() && idea.getText().isEmpty()){
        }
        else{
            Anatable.add(
            new AnaClass(
                papsize.getText(),
                (white.isSelected()?"White paper":"News print"),
                 idea.getText()
            )
        );
        papsize.clear();
        white.setSelected(false);
        news.setSelected(false);
        idea.clear();
        tableview.getItems().clear();
        for (AnaClass AT : Anatable){
            tableview.getItems().add(AT);
        }
        }
        
        
    }

    @FXML
    private void remove(ActionEvent event) {
        for (AnaClass AT: Anatable){
            if((rem.getText().equals(AT.getSize()))){ // here rem is the fxid of remove text field. and getSize is from java class (anaclass)
                Anatable.remove(AT);
                tableview.getItems().clear();
                break;
            }
        }
        for (AnaClass AT : Anatable){
            tableview.getItems().add(AT);
    }

    
}
}
