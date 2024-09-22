/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papermillsltd;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

/**
 *
 * @author ASUS
 */
public class pieSalopp extends Application {
  
    public void start(Stage stage)
    {
        stage.setTitle("Creating Pie Chart");
        PieChart.Data data[] = new PieChart.Data[5];
        String status[] = {"Bond paper", "White paper",
                           "newsprint", "parchment paper",
                           "Others" };
                             
        int values[] = {15, 40, 30, 5, 10};
  
        for (int i = 0; i < 5; i++) {
            data[i] = new PieChart.Data(status[i], values[i]);
        }
        PieChart pie_chart = new
                PieChart(FXCollections.observableArrayList(data));

        Group group = new Group(pie_chart);
        Scene scene = new Scene(group, 500, 300);
        stage.setScene(scene);
        stage.show();
    }
  
    public static void main(String args[])
    {
        launch(args);
    }
}
