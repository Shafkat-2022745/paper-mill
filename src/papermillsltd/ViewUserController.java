package papermillsltd;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ViewUserController implements Initializable {

    @FXML
    private TextArea userBinFileView;
    @FXML
    private Button view;
    private TextField writeOnBinFile;
    @FXML
    private Button logOut;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ViewOnAction(ActionEvent event) {
         try {
        FileInputStream fileIn = new FileInputStream("User.bin");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        List<Member> members = (List<Member>) in.readObject();

        StringBuilder sb = new StringBuilder();
        for (Member member : members) {
            sb.append(member.toString()).append("\n");
        }
        userBinFileView.setText(sb.toString());

        in.close();
        fileIn.close();
    } catch (IOException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
}

    @FXML
    private void logOutOnClick(ActionEvent event)throws IOException {
    Parent loginSceneParent = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
    Scene loginSceneScene = new Scene(loginSceneParent);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Object Scene = null; /*contactDetailsScene*/
    window.setScene(loginSceneScene);
    window.show();
    }
}
