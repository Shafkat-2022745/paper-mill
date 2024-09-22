/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papermillsltd;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Shanto
 */
public class TableController implements Initializable {

    @FXML
    private AnchorPane tableView;
    @FXML
    private TableColumn<?, ?> name;
    @FXML
    private TableColumn<?, ?> fname;
    @FXML
    private TableColumn<?, ?> salary;
    @FXML
    private TableColumn<?, ?> phone;
    @FXML
    private TableColumn<?, ?> add;
    @FXML
    private TableColumn<?, ?> mail;
    @FXML
    private TableColumn<?, ?> deg;
    @FXML
    private Button load;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadOnClick(ActionEvent event) {
    }
    
}
