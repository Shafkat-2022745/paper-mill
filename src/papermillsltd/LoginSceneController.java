/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papermillsltd;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.mindrot.bcrypt.BCrypt;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class LoginSceneController implements Initializable {

    @FXML
    private Button genarelNoticeBtn;
    @FXML
    private Button contactDetailsBtn;
    @FXML
    private Button developtByBtn;
    @FXML
    private TextField password;
    @FXML
    private TextField userID;
    @FXML
    private ComboBox<String> type;
    @FXML
    private Button logInBtn;
    @FXML
    private Hyperlink regBtn;
    @FXML
    private BorderPane borderPane;
    @FXML
    private Button jab;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         type.getItems().addAll("Board of directors","Human resources staff","Maintenance manager","Project Engineer",
              "Executive management team","Quality control managers and staff","Sales and marketing team","Customer service and representatives","Admin");
    }    

    @FXML
    private void ClosetheScene(ActionEvent event) {
        Stage stage = (Stage) borderPane.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void genarelNoticeBtnAction(ActionEvent event)throws IOException {
        Parent mainpage = FXMLLoader.load(getClass().getResource("NoticeBoard.fxml"));
        Scene mainScene = new Scene(mainpage);
        Stage st = (Stage)((Node)event.getSource()).getScene().getWindow();
        st.setScene(mainScene);
        st.show();
    }

    @FXML
    private void contactDetailsBtnAction(ActionEvent event) throws IOException {
    Parent contactDetailsParent = FXMLLoader.load(getClass().getResource("ContactDetails.fxml"));
    Scene contactDetailsScene = new Scene(contactDetailsParent);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Object Scene = null; /*contactDetailsScene*/
    window.setScene(contactDetailsScene);
    window.show();
}

    @FXML
    private void developtByBtnAction(ActionEvent event) throws IOException {
    Parent DevelopByParent = FXMLLoader.load(getClass().getResource("DevelopBy.fxml"));
    Scene DevelopByScene = new Scene(DevelopByParent);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Object Scene = null; /*contactDetailsScene*/
    window.setScene(DevelopByScene);
    window.show();
}

    @FXML
    private void logInBtnAction(ActionEvent event) {
            String role;
        role = type.getValue();
        
        String id=userID.getText();
        String pass=password.getText();
        File file=null;
        FileInputStream  fileInputStream=null;
        DataInputStream dataInputStream=null;
        Member member=new Member();
        
        try{
            file=new File("User.bin");
            if(!file.exists())
            {
                System.out.println("did not get");
            }else
            {
                
            fileInputStream=new FileInputStream(file);

            dataInputStream=new DataInputStream(fileInputStream);
            int available=dataInputStream.available();
//                System.out.println(available);
            while(true)
            {
                String name=dataInputStream.readUTF();
                String id1=dataInputStream.readUTF();
                String dept=dataInputStream.readUTF();
                String pass1=dataInputStream.readUTF();
                if(id.equals(id1)){
                    
                    if(BCrypt.checkpw(pass, pass1))
                    {
                        System.out.println("yeah i am the login user"); 
                        if (role.equals(dept)) {
                            if (role.equals("Board of directors")){       
                    Parent dashboardParent = FXMLLoader.load(getClass().getResource("BODDashboard.fxml"));
                    Scene dashboardScene = new Scene(dashboardParent);
                    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    window.setScene(dashboardScene);
                    window.show();
                        }
                        else if (role.equals(dept="Human resources staff")) {
                    Parent dashboardParent = FXMLLoader.load(getClass().getResource("HRDashboard.fxml"));
                    Scene dashboardScene = new Scene(dashboardParent);
                    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    window.setScene(dashboardScene);
                     window.show();
                        }
                            else if (role.equals(dept="Admin")) {
                    Parent dashboardParent = FXMLLoader.load(getClass().getResource("ViewUser.fxml"));
                    Scene dashboardScene = new Scene(dashboardParent);
                    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    window.setScene(dashboardScene);
                     window.show();
                        }
                             else if (role.equals(dept="Sales and marketing team")) {
                    Parent dashboardParent = FXMLLoader.load(getClass().getResource("SandM.fxml"));
                    Scene dashboardScene = new Scene(dashboardParent);
                    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    window.setScene(dashboardScene);
                     window.show();
                        }
                            else if (role.equals(dept="Customer service and representatives")) {
                    Parent dashboardParent = FXMLLoader.load(getClass().getResource("CustomerService.fxml"));
                    Scene dashboardScene = new Scene(dashboardParent);
                    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    window.setScene(dashboardScene);
                     window.show();
                        }
                             else if (role.equals(dept="Quality control managers and staff")) {
                    Parent dashboardParent = FXMLLoader.load(getClass().getResource("scene3.fxml"));
                    Scene dashboardScene = new Scene(dashboardParent);
                    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    window.setScene(dashboardScene);
                     window.show();
                        }
                            else if (role.equals(dept="Executive management team")) {
                    Parent dashboardParent = FXMLLoader.load(getClass().getResource("scene2.fxml"));
                    Scene dashboardScene = new Scene(dashboardParent);
                    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    window.setScene(dashboardScene);
                     window.show();
                        }
} 

                        return ;
                    }  
                }      
              
            }  
            }
        }
    
        catch(IOException e)
        {
            e.printStackTrace();
        }
        finally{
            try{
                if(dataInputStream!=null)
                {
                    dataInputStream.close();
                }
            }
                catch(IOException e){
                        e.printStackTrace();
                        }
            
        }
        System.out.println("did not find the user");
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setTitle("ERROR");
        a.setHeaderText("Wrong ID or PassWord!");
        a.setContentText("Check Your ID or PassWord");
        a.showAndWait(); 
    }

    @FXML
    private void regBtnAction(ActionEvent event)  throws IOException {
    Parent loginSceneParent = FXMLLoader.load(getClass().getResource("AddMember.fxml"));
    Scene loginSceneScene = new Scene(loginSceneParent);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Object Scene = null; /*contactDetailsScene*/
    window.setScene(loginSceneScene);
    window.show();
    }

    @FXML
    private void jobOnClick(ActionEvent event) throws IOException {
        Parent loginSceneParent = FXMLLoader.load(getClass().getResource("SeeJobCircular.fxml"));
    Scene loginSceneScene = new Scene(loginSceneParent);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Object Scene = null; /*contactDetailsScene*/
    window.setScene(loginSceneScene);
    window.show();
    }
    
  
    
}
