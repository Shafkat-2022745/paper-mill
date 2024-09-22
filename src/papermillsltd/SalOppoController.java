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
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class SalOppoController implements Initializable {

    @FXML
    private PieChart piechart;

    /**
     * Initializes the controller class.
     */  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ObservableList<PieChart.Data>pieChartData =FXCollections.observableArrayList(
            new PieChart.Data("Bond paper", 13), 
            new PieChart.Data("White paper", 40), 
            new PieChart.Data("newsprint", 10), 
            new PieChart.Data("parchment paper", 5),
            new PieChart.Data("others", 10));    
        piechart.setData(pieChartData);
        piechart.setTitle("Most Sold Paper");
    }  

    @FXML
    private void FromCusS(ActionEvent event) throws IOException {
        Parent twoViewParent = FXMLLoader.load(getClass().getResource("CustomerService.fxml"));
        Scene twoViewScene = new Scene(twoViewParent);
        
        Stage two = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        two.setScene(twoViewScene);
        two.show();
    }
    
}
