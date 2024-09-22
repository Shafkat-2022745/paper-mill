package papermillsltd;

import java.io.FileWriter;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NewEmployeeDetailsController implements Initializable {

    @FXML
    private Button backButton;
    @FXML
    private Button submitButton;
    @FXML
    private TextField salary;
    @FXML
    private TextField phone;
    @FXML
    private TextField add;
    @FXML
    private TextField mail;
    @FXML
    private TextField deg;
    @FXML
    private TextField name;
    @FXML
    private TextField fname;

    private Person item;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
        Parent AddMemberParent = FXMLLoader.load(getClass().getResource("HRDashboard.fxml"));
        Scene AddMemberScene = new Scene(AddMemberParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(AddMemberScene);
        window.show();
    }

    @FXML
    public void submitButtonOnClick(ActionEvent event) throws IOException {
        String data = "Name:" + name.getText() + "," + "Father Name:" + fname.getText() + "," + "Salary:" + salary.getText() +
                "," + "Phone:" + phone.getText() + "Add:" + add.getText() + "," + "Mail:" + mail.getText() + "," + "Deg:" + deg.getText() + "\n";

        try {
            FileWriter writer = new FileWriter("Employee Details.txt", true);
            writer.write(data);
            writer.close();

            item = new Person(name.getText(),
                    fname.getText(),
                    salary.getText(),
                    phone.getText(),
                    add.getText(),
                    mail.getText(),
                    deg.getText());

            fname.setText("");
            name.setText("");
            salary.setText("");
            phone.setText("");
            add.setText("");
            mail.setText("");
            deg.setText("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Person getItem() {
        return item;
    }
}