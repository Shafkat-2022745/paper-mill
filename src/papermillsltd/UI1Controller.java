package papermillsltd;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;


public class UI1Controller implements Initializable {

    @FXML private PieChart pieChart;
    @FXML private Button loadPieChartButton;
    @FXML private Label statusLabel;


    @Override
    public void initialize(URL url, ResourceBundle rb){
        // TODO
    }    

    @FXML
    private void loadPieChartButtonOnClick(ActionEvent event) {
        ObservableList <PieChart.Data> list = FXCollections.observableArrayList(
            new PieChart.Data("Water",50),
            new PieChart.Data("Waste",20),
            new PieChart.Data("Safety",30),
            new PieChart.Data("energy",10),
            new PieChart.Data("extra",5)
        );
        
        //ObservableList <PieChart.Data> list2 = FXCollections.observableArrayList();
        //list2.add(new PieChart.Data("Java",50));
        //...
        pieChart.setData(list);
        
        for(PieChart.Data data: pieChart.getData()){
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, 
                    new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent event) {
                    statusLabel.setText(String.valueOf(data.getPieValue()));
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            }
            );
        }
    }        

    @FXML
    private void labelMouseEnterOnClick(MouseEvent event) {
        statusLabel.setText("You are hoovering on the label");
    }
    
}
