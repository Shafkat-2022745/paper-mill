/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papermillsltd;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.graphics.color.PDColor;
import org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB;

/**
 * FXML Controller class
 *
 * @author Shanto
 */
public class PDFGenerateController implements Initializable {

    @FXML
    private Button PDF;
    @FXML
    private Button read;
    @FXML
    private TextArea outputTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
@FXML
private void pdfGenerateOnClick(ActionEvent event) {
    try {
        String text = outputTextArea.getText();
        PDDocument document = new PDDocument();

        PDPage page = new PDPage();
        document.addPage(page);
        PDPageContentStream contentStream = new PDPageContentStream(document, page);
        int fontSize = 12;

        PdfFont font = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);
       // contentStream.setFont(font, fontSize);

        PDColor textColor = new PDColor(new float[]{0, 0, 0}, PDDeviceRGB.INSTANCE);

        contentStream.setNonStrokingColor(textColor);

        float margin = 50;

        float pageWidth = page.getMediaBox().getWidth();
        float pageHeight = page.getMediaBox().getHeight();

        float yPosition = pageHeight - margin;
        float xPosition = margin;

        contentStream.beginText();
        contentStream.newLineAtOffset(xPosition, yPosition);
        contentStream.showText(text);
        contentStream.endText();

        contentStream.close();

        // Save the document to a file
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Save PDF file");
        dialog.setHeaderText(null);
        dialog.setContentText("Please enter the name of the file:");
        Optional<String> result = dialog.showAndWait();

        if (result.isPresent()) {
            String filename = result.get();
            document.save(filename + ".pdf");
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText(null);
            alert.setContentText("PDF successfully generated.");
            alert.showAndWait();
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please enter a file name.");
            alert.showAndWait();
        }

        // Close the document
        document.close();

    } catch (Exception e) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText("Oops! An error occurred: " + e.getMessage());
        alert.showAndWait();
    }
}

    @FXML
    private void readOnClick(ActionEvent event) {
        try {
        // Create a FileReader object to read from the file
        FileReader reader = new FileReader("Goal.txt");
        
        // Create a BufferedReader object to buffer the input
        BufferedReader bufferedReader = new BufferedReader(reader);

        String line;
        String contents = "";
        
        // Read each line of the file and add it to the contents string
        while ((line = bufferedReader.readLine()) != null) {
            contents += line + "\n";
        }
        
        // Close the buffered reader and the file reader
        bufferedReader.close();
        reader.close();

        // Set the contents of the output area
        outputTextArea.setText(contents);
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    
}
