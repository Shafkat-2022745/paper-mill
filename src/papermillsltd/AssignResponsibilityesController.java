/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papermillsltd;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Shanto
 */
public class AssignResponsibilityesController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField degTextField;
    @FXML
    private TextField aTextField;
    @FXML
    private Button add;
    @FXML
    private Button delete;
    @FXML
    private TableView<Employee> tableView;
    @FXML
    private TableColumn<Employee, String> nameCo;
    @FXML
    private TableColumn<Employee, String> degCo;
    @FXML
    private TableColumn<Employee, String> arCo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        

        //set up the columns in the table
        nameCo.setCellValueFactory(new PropertyValueFactory<Employee,String>("Name"));
        degCo.setCellValueFactory(new PropertyValueFactory<Employee,String>("Degicnation"));
        arCo.setCellValueFactory(new PropertyValueFactory<Employee,String>("AssignResponsibilities"));
        
        
        //load dummy data
        tableView.setItems(getEmployee());    
        
        //Allow first and last name to be edittable
        tableView.setEditable(true);
        arCo.setCellFactory(TextFieldTableCell.forTableColumn());;
        
        //allow the table to select multiple rows at once
        tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }        

    @FXML
    private void addOnClick(ActionEvent event) {
        Employee newEmployee = new Employee(nameTextField.getText(),
                                       degTextField.getText(),
                                       aTextField.getText()
                                    );
        tableView.getItems().add(0,newEmployee);
    }
    public ObservableList<Employee> getEmployee(){
        ObservableList<Employee> employee= FXCollections.observableArrayList();
        return employee;
    } 

    @FXML
    private void deleteOnClick(ActionEvent event) {
        ObservableList<Employee> selectedRows, allEmployee;
        allEmployee = tableView.getItems();
        selectedRows = tableView.getSelectionModel().getSelectedItems();
        
        for(Employee p: selectedRows){
            allEmployee.remove(p);
    }
    }

    private void backButtonOnClick(ActionEvent event) throws IOException {
        Parent mainpage = FXMLLoader.load(getClass().getResource("BODDashboard.fxml"));
        Scene mainScene = new Scene(mainpage);
        Stage st = (Stage)((Node)event.getSource()).getScene().getWindow();
        st.setScene(mainScene);
        st.show();
    }

    @FXML
    private void changeOnCommit(TableColumn.CellEditEvent edittedCell) {
        Employee employeeSelected = tableView.getSelectionModel().getSelectedItem();
        employeeSelected.setAssignResposibilityes(edittedCell.getNewValue().toString());
    }
    
}
