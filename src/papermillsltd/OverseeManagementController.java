/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papermillsltd;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author KING
 */
public class OverseeManagementController implements Initializable {

    @FXML
    private Button governmentFButton;
    @FXML
    private Button budgetButton;
    @FXML
    private Button raButton;
    @FXML
    private Button backButton;
    @FXML
    private BorderPane borderPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
         private void loadUI(String ui) {
        Parent root;
        try {
            root = javafx.fxml.FXMLLoader.load(getClass().getResource(ui+".fxml"));
            borderPane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(OperatiosController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void governmentFButtonOnClick(ActionEvent event) {
               try{
            FileChooser fc = new FileChooser();
            fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF files", "*.pdf"));
            fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image files", "*.jpg", "*.bmp", "*.png"));
            File f = fc.showSaveDialog(null);
            if(f!=null){              
                PdfWriter pw = new PdfWriter(new FileOutputStream(f));
                PdfDocument pdf =  new PdfDocument(pw);
        pdf.addNewPage();
        Document document = new Document(pdf);
        document.setLeftMargin(70);
                Text titleText = new Text("Government Framework");
                titleText.setFontSize(18f);
                Paragraph pageTitle = new Paragraph(titleText);
                pageTitle.setBold();
                document.add(pageTitle);
             
        
        String paraText1 = "Strategic Management Framework Designed for Government\n"
                + "Demonstrate progress and measure impact from improved decision making";
        Paragraph para1 = new Paragraph(paraText1);
        document.add(para1);
        String newline = "\n";
        Paragraph lineSpace = new Paragraph(newline);
        lineSpace.setHeight(8);
        document.add(lineSpace);
           document.close();

        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("PDF successfully generated.");
        alert.showAndWait();
    } else {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText("Please select a file to save the PDF.");
        alert.showAndWait();
    }

} catch (Exception e) {
    Alert alert = new Alert(AlertType.ERROR);
    alert.setTitle("Error");
    alert.setHeaderText(null);
    alert.setContentText("Oops! An error occurred: " + e.getMessage());
    alert.showAndWait();
}               
    }

    @FXML
    private void budgetButtonOnClick(ActionEvent event) {
        loadUI("UI3");
    }

    @FXML
    private void raButtonOnClick(ActionEvent event) {
        loadUI("Risk");
    }
    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
    Parent loginSceneParent = FXMLLoader.load(getClass().getResource("BODDashboard.fxml"));
    Scene loginSceneScene = new Scene(loginSceneParent);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Object Scene = null; /*contactDetailsScene*/
    window.setScene(loginSceneScene);
    window.show();
}
    
}
