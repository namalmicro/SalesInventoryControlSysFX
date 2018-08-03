package com.microcars;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(root,1150,650);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			Image icon = new Image(getClass().getResourceAsStream("/img/company-logo.png"));
			primaryStage.getIcons().add(icon);
			primaryStage.setResizable(true);
			primaryStage.setMinHeight(650);
			primaryStage.setMinWidth(1150);
			primaryStage.setTitle("Micro Cars - Sales and Inventory Control System");
			primaryStage.initStyle(StageStyle.DECORATED);
			primaryStage.show();
			
			 
			 
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
}
