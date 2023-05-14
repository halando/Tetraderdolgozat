/*
* File: ButtonPanel.java
* Author: Andó Attila
* Copyright: 2023, Andó Attila
* Group: Szoft I/1/N
* Date: 2023-05-14
* Github: https://github.com/halando/
* Licenc: GNU GPL
*/

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tetrader  extends Application{
    TextField TatField;
TextField heightField;
TextField volumeField;
    public static void main(String[] args) throws Exception {
       launch(args);
   }
    @Override
        public void start(Stage stage) throws Exception {
            StackPane stackPane = new StackPane();
            VBox vbox1 = new VBox();
            HBox hbox = new HBox();
            HBox titlehbox = new HBox();
            HBox Tathbox = new HBox();
            HBox heighthbox = new HBox();
            HBox buttonhbox = new HBox();
            HBox volumehbox = new HBox();
            HBox abouthbox = new HBox();
    
            Label titleLabel = new Label(" Tetraéder térfogat számítása");
            titlehbox.getChildren().add(titleLabel);
            titlehbox.setPadding(new Insets(10,10,10,10));
            titlehbox.setAlignment(Pos.CENTER_RIGHT);
            
            Label TatLabel = new Label("T terület alap");
            this.TatField = new TextField();
            Tathbox.getChildren().addAll(TatLabel,TatField);
            Tathbox.setPadding(new Insets(10, 10, 10, 10));
            HBox.setMargin(TatLabel, new Insets(0, 10, 0, 10));
            HBox.setMargin(TatField, new Insets(0, 10, 0, 10));
            TatLabel.setMinWidth(100);
            TatLabel.setAlignment(Pos.CENTER_RIGHT);
    
    
            Label heightLabel = new Label("Magasság");
           this.heightField = new TextField();
            heighthbox.getChildren().addAll(heightLabel, heightField);
            heighthbox.setPadding(new Insets(10, 10, 10, 10));
            HBox.setMargin(heightLabel, new Insets(0, 10, 0, 10));
            HBox.setMargin(heightField, new Insets(0, 10, 0, 10));
            heightLabel.setMinWidth(100);
            heightLabel.setAlignment(Pos.CENTER_RIGHT);
    
            Button calcButton = new Button("Számít");
            buttonhbox.getChildren().add(calcButton);
            buttonhbox.setAlignment(Pos.CENTER);
            buttonhbox.setPadding(new Insets(10,10,10,10));
            calcButton.setOnAction(e -> {
               startCalcVolume();
            });
    
            Label volumeLabel = new Label();
            volumeField = new TextField();
            volumehbox.getChildren().addAll(volumehbox,volumeField);
           volumehbox.setPadding(new Insets(10, 10, 10, 10));
            HBox.setMargin(volumeLabel, new Insets(0, 10, 0, 10));
            HBox.setMargin(volumeField, new Insets(0, 10, 0, 10));
           volumeLabel.setMinWidth(100);
            volumeLabel.setAlignment(Pos.CENTER_RIGHT);
    
           // Névjegy
           Label aboutLabel = new Label("Andó Attila, Szoft I-1 N, 2023-05-14");
            abouthbox.getChildren().add(titleLabel);
            abouthbox.setPadding(new Insets(10,10,10,10));
            abouthbox.setAlignment(Pos.CENTER);
    
            vbox1.getChildren().add(titlehbox);
            vbox1.getChildren().add(Tathbox);
            vbox1.getChildren().add(aboutLabel);
            
            vbox1.getChildren().add(heighthbox);
            vbox1.getChildren().add(buttonhbox);
            vbox1.getChildren().add(volumehbox);
            vbox1.getChildren().add(abouthbox);
            Scene scene = new Scene(vbox1);
            stage.setScene(scene);
            stage.show();
        }
        private void startCalcVolume(){
        String TatStr = TatField.getText();
        String heightStr = heightField.getText();
       double Tat = Double.parseDouble(TatStr);
       double height = Double.parseDouble(heightStr);
       Double volume = calcVolume(Tat, height);
       volumeField.setText(volume.toString());
        }
        
        private double calcVolume(double Tat, double height){
        double volume = (Tat *height)/3;
            return volume;
        }
        
}
      

    

    

