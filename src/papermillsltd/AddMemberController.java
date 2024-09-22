/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papermillsltd;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.mindrot.bcrypt.BCrypt;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class AddMemberController implements Initializable {

    @FXML
    private Button save;
    @FXML
    private Button cancel;
    @FXML
    private TextField nameField;
    @FXML
    private TextField userIdField;
    private TextField departmentField;
    @FXML
    private TextField passwordinput;
    @FXML
    private ComboBox<String> departmentCombobox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         departmentCombobox.getItems().addAll("Board of directors","Human resources staff","Maintenance manager","Project Engineer",
              "Executive management team","Quality control managers and staff","Sales and marketing team","Customer service and representatives","Admin");
    }    

    @FXML
    private void saveMember(ActionEvent event) {
        
        String password=passwordinput.getText();
        String hashpw=BCrypt.hashpw(password, BCrypt.gensalt());
//        System.out.println(hashpw);
        Member member=new Member(nameField.getText(), userIdField.getText(), departmentCombobox.getValue().toString(), hashpw);
//        System.out.println(member.getId());
//        System.out.println(passwordinput.getText());
        File file=null;
        DataOutputStream dataOutputStream=null;
        FileOutputStream fileOutputStream=null;
           
        try{
            file=new File("User.bin");
            if(file.exists())
            {
                fileOutputStream=new FileOutputStream(file,true);
                
            }
            else
            {
                fileOutputStream=new FileOutputStream(file);
            }
            dataOutputStream=new DataOutputStream(fileOutputStream);
//            dataOutputStream.write(1000000);
            writeMember(dataOutputStream, member);
            System.out.println("successfully added the member");
            
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    private void cancelTheAction(ActionEvent event) throws IOException {
    Parent loginSceneParent = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
    Scene loginSceneScene = new Scene(loginSceneParent);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Object Scene = null; /*contactDetailsScene*/
    window.setScene(loginSceneScene);
    window.show();
    }
    
    private static void writeMember(DataOutputStream dataOutputStream,Member member)throws  IOException
    {
        System.out.println("i don't know");
        dataOutputStream.writeUTF(member.getName());
        dataOutputStream.writeUTF(member.getId());

        dataOutputStream.writeUTF(member.getDept());
       
        dataOutputStream.writeUTF(member.getPassword());

    }

    @FXML
    private void departmentComboboxOnClick(ActionEvent event) {
        String selectedDepartment = departmentCombobox.getSelectionModel().getSelectedItem();
    System.out.println("Selected Department: " + selectedDepartment);
    // Do something with the selected value
}
    }
   
