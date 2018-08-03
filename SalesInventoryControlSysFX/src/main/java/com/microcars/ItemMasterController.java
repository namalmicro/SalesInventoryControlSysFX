package com.microcars;

import java.io.File;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;

public class ItemMasterController {
	
	@FXML
	private BorderPane itemMasterBorderPane;
	
	@FXML
	public void showItemImageFileChooser() {
		
		FileChooser chooser = new FileChooser();
		chooser.setTitle("Select The Item Image");
		chooser.getExtensionFilters().addAll(
				new FileChooser.ExtensionFilter("Image File", "*.jpg"));
		
		File file = chooser.showOpenDialog(itemMasterBorderPane.getScene().getWindow());
		
		if(file != null) {
			System.out.println(file.getPath());
		}else {
			System.out.println("Not import an image");
		}
		
	}
	
	

}
