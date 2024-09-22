/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papermillsltd;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
import javafx.scene.control.ComboBox;
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
public class Employee2Controller implements Initializable {

    @FXML
    private TextField employeeName;
    @FXML
    private TextField id;
    @FXML
    private TextField address;
    @FXML
    private TextField email;
    @FXML
    private ComboBox<String> designation;
    @FXML
    private RadioButton male;
    @FXML
    private ToggleGroup gender;
    @FXML
    private RadioButton female;
    @FXML
    private TextField fatherName;
    @FXML
    private TextField salary;
    @FXML
    private TextField phone;
    @FXML
    private TableView<Employee2> tableView;
    @FXML
    private TableColumn<Employee2, String> employeeNamecol;
    @FXML
    private TableColumn<Employee2, String> idcol;
    @FXML
    private TableColumn<Employee2, String> addresscol;
    @FXML
    private TableColumn<Employee2, String> emailcol;
    @FXML
    private TableColumn<Employee2, String> designationcol;
    @FXML
    private TableColumn<Employee2, String> gendercol;
    @FXML
    private TableColumn<Employee2, String> fathernamecol;
    @FXML
    private TableColumn<Employee2, String> salarycol;
    @FXML
    private TableColumn<Employee2, String> phonecol;
    private ArrayList<Employee2>employeecount;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         designation.getItems().addAll("Officer","Clark");
        
        employeecount = new ArrayList<Employee2>();
        Employee2 e;
        e= new Employee2();
        
         employeeNamecol.setCellValueFactory(new PropertyValueFactory<Employee2, String>("EmployeeName"));
        idcol.setCellValueFactory(new PropertyValueFactory<Employee2, String>("ID"));
        emailcol.setCellValueFactory(new PropertyValueFactory<Employee2, String>("Email"));
        designationcol.setCellValueFactory(new PropertyValueFactory<Employee2, String>("Designation"));
        gendercol.setCellValueFactory(new PropertyValueFactory<Employee2, String>("Gender"));
        fathernamecol.setCellValueFactory(new PropertyValueFactory<Employee2, String>("FatherName"));
        salarycol.setCellValueFactory(new PropertyValueFactory<Employee2, String>("Salary"));
        phonecol.setCellValueFactory(new PropertyValueFactory<Employee2, String>("Phone"));
        
    }    

    @FXML
    private void AddtoArray(ActionEvent event) {
         employeecount.add(
            new Employee2(
                employeeName.getText(),
                id.getText(),
                address.getText(),
                email.getText(),
                designation.getValue(),
                (male.isSelected()?"male":"female"),
                fatherName.getText(),
                salary.getText(),
                phone.getText()
               
            )
      
        );
    }

    @FXML
    private void AddtoFile(ActionEvent event) {
        
        try{
        
        FileOutputStream fos= new FileOutputStream("Employee2.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        for(Employee2 e: employeecount){
           oos.writeObject(e);
        }
       }
       catch(Exception e){
       
       }
    }

    @FXML
    private void ShowOnTable(ActionEvent event) {
        
         try{
         Employee2 e;   
         FileInputStream fis= new FileInputStream("Employee2.bin");
         ObjectInputStream ois= new ObjectInputStream(fis);
        
         tableView.getItems().clear();
         while(true){
           e= (Employee2) ois.readObject();
           tableView.getItems().add(e);
         }
        }
        catch(Exception e){
        }
    }

    @FXML
    private void Back(ActionEvent event) throws IOException {
        Parent mainpage = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
        Scene mainScene = new Scene(mainpage);
        
        Stage st = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        st.setScene(mainScene);
        st.show();
    
    }
    
}
