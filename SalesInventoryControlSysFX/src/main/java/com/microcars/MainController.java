package com.microcars;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainController {	
			
	@FXML
	private BorderPane mainBorderPane;
	
	@FXML
	private TreeView<String> treeView;
	
	Image icon1 = new Image(getClass().getResourceAsStream("/img/warehouse.png"));
	Image icon2 = new Image(getClass().getResourceAsStream("/img/purchase-icon.png"));
	Image icon3 = new Image(getClass().getResourceAsStream("/img/Old-Car-2-icon.png"));
	Image icon4 = new Image(getClass().getResourceAsStream("/img/invoice.png"));
	Image icon5 = new Image(getClass().getResourceAsStream("/img/analytics.png"));
	
	@FXML
	public void viewItemMasterFileGUI() {
		
		Stage primaryStage = new Stage();
		
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("ItemMaster.fxml"));
			Scene scene = new Scene(root,850,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.initOwner(mainBorderPane.getScene().getWindow());
			primaryStage.initModality(Modality.WINDOW_MODAL);
			Image icon = new Image(getClass().getResourceAsStream("/img/company-logo.png"));
			primaryStage.getIcons().add(icon);
			primaryStage.setResizable(true);
			primaryStage.setMinHeight(400);
			primaryStage.setMinWidth(850);
			primaryStage.setTitle("Micro Cars - Item Master File");
			primaryStage.initStyle(StageStyle.DECORATED);
			primaryStage.setResizable(false);
			primaryStage.show();
		
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Couldn't load the ItemMasterFileGUI");
		}	
		
	}
	
	@FXML
	public void viewItemCategoryFileGUI() {
		
		Stage primaryStage = new Stage();
		
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("ItemCategory.fxml"));
			Scene scene = new Scene(root,700,150);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.initOwner(mainBorderPane.getScene().getWindow());
			primaryStage.initModality(Modality.WINDOW_MODAL);
			Image icon = new Image(getClass().getResourceAsStream("/img/company-logo.png"));
			primaryStage.getIcons().add(icon);
			primaryStage.setResizable(true);
			primaryStage.setMinHeight(150);
			primaryStage.setMinWidth(700);
			primaryStage.setTitle("Micro Cars - Item Category File");
			primaryStage.initStyle(StageStyle.DECORATED);
			primaryStage.setResizable(false);
			primaryStage.show();
		
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Couldn't load the ItemCategoryFileGUI");
		}
	}
		
	@FXML
	public void viewItemModelFileGUI() {

		Stage primaryStage = new Stage();
		
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("ItemModel.fxml"));
			Scene scene = new Scene(root,700,150);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.initOwner(mainBorderPane.getScene().getWindow());
			primaryStage.initModality(Modality.WINDOW_MODAL);
			Image icon = new Image(getClass().getResourceAsStream("/img/company-logo.png"));
			primaryStage.getIcons().add(icon);
			primaryStage.setResizable(true);
			primaryStage.setMinHeight(150);
			primaryStage.setMinWidth(700);
			primaryStage.setTitle("Micro Cars - Item Model File");
			primaryStage.initStyle(StageStyle.DECORATED);
			primaryStage.setResizable(false);
			primaryStage.show();
		
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Couldn't load the ItemModelFileGUI");
		}
		
	}
	
	@FXML
	public void viewItemInquiryGUI() {
		
		Stage primaryStage = new Stage();
		
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("ItemInquiry.fxml"));
			Scene scene = new Scene(root,700,300);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.initOwner(mainBorderPane.getScene().getWindow());
			primaryStage.initModality(Modality.WINDOW_MODAL);
			Image icon = new Image(getClass().getResourceAsStream("/img/company-logo.png"));
			primaryStage.getIcons().add(icon);
			primaryStage.setResizable(true);
			primaryStage.setMinHeight(300);
			primaryStage.setMinWidth(700);
			primaryStage.setTitle("Micro Cars - Item Inquiry");
			primaryStage.initStyle(StageStyle.DECORATED);
			primaryStage.show();
		
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Couldn't load the ItemInquiryGUI");
		}
	}
	
	@FXML
	public void viewPurchaseOrderGUI() {
		
		Stage primaryStage = new Stage();
		
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("PurchaseOrder.fxml"));
			Scene scene = new Scene(root,800,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.initOwner(mainBorderPane.getScene().getWindow());
			primaryStage.initModality(Modality.WINDOW_MODAL);
			Image icon = new Image(getClass().getResourceAsStream("/img/company-logo.png"));
			primaryStage.getIcons().add(icon);
			primaryStage.setResizable(true);
			primaryStage.setMinHeight(600);
			primaryStage.setMinWidth(800);
			primaryStage.setTitle("Micro Cars - Purchase Order");
			primaryStage.initStyle(StageStyle.DECORATED);
			primaryStage.show();
		
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Couldn't load the PurchaseOrderGUI");
		}
		
	}
	
	@FXML
	public void viewGoodReceivedNoteGUI() {
		
		Stage primaryStage = new Stage();
		
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("GoodReceived.fxml"));
			Scene scene = new Scene(root,800,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.initOwner(mainBorderPane.getScene().getWindow());
			primaryStage.initModality(Modality.WINDOW_MODAL);
			Image icon = new Image(getClass().getResourceAsStream("/img/company-logo.png"));
			primaryStage.getIcons().add(icon);
			primaryStage.setResizable(true);
			primaryStage.setMinHeight(600);
			primaryStage.setMinWidth(800);
			primaryStage.setTitle("Micro Cars - Good Received Note");
			primaryStage.initStyle(StageStyle.DECORATED);
			primaryStage.show();
		
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Couldn't load the GoodReceivedNoteGUI");
		}
		
	}
	
	@FXML
	public void viewSupplierMasterFileGUI() {
		
		Stage primaryStage = new Stage();
		
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("SupplierMaster.fxml"));
			Scene scene = new Scene(root,725,300);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.initOwner(mainBorderPane.getScene().getWindow());
			primaryStage.initModality(Modality.WINDOW_MODAL);
			Image icon = new Image(getClass().getResourceAsStream("/img/company-logo.png"));
			primaryStage.getIcons().add(icon);
			primaryStage.setResizable(true);
			primaryStage.setMinHeight(300);
			primaryStage.setMinWidth(725);
			primaryStage.setTitle("Micro Cars - Supplier Master File");
			primaryStage.initStyle(StageStyle.DECORATED);
			primaryStage.setResizable(false);
			primaryStage.show();
		
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Couldn't load the SupplierMasterFileGUI");
		}
		
	}
	
	@FXML
	public void viewVehicleMasterFileGUI() {
		Stage primaryStage = new Stage();
		
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("VehicleMaster.fxml"));
			Scene scene = new Scene(root,700,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.initOwner(mainBorderPane.getScene().getWindow());
			primaryStage.initModality(Modality.WINDOW_MODAL);
			Image icon = new Image(getClass().getResourceAsStream("/img/company-logo.png"));
			primaryStage.getIcons().add(icon);
			primaryStage.setResizable(true);
			primaryStage.setMinHeight(400);
			primaryStage.setMinWidth(700);
			primaryStage.setTitle("Micro Cars - Vehicle Master File");
			primaryStage.initStyle(StageStyle.DECORATED);
			primaryStage.setResizable(false);
			primaryStage.show();
		
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Couldn't load the VehicleMasterFileGUI");
		}
		
	}
	
	@FXML
	public void viewVehicleCategoryFileGUI() {
		
		Stage primaryStage = new Stage();
		
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("VehicleCategory.fxml"));
			Scene scene = new Scene(root,700,150);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.initOwner(mainBorderPane.getScene().getWindow());
			primaryStage.initModality(Modality.WINDOW_MODAL);
			Image icon = new Image(getClass().getResourceAsStream("/img/company-logo.png"));
			primaryStage.getIcons().add(icon);
			primaryStage.setResizable(true);
			primaryStage.setMinHeight(150);
			primaryStage.setMinWidth(700);
			primaryStage.setTitle("Micro Cars - Vehicle Category File");
			primaryStage.initStyle(StageStyle.DECORATED);
			primaryStage.setResizable(false);
			primaryStage.show();
		
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Couldn't load the VehicleCategoryFileGUI");
		}
		
	}
	
	@FXML
	public void viewVehicleModelFileGUI() {
		
		Stage primaryStage = new Stage();
		
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("VehicleModel.fxml"));
			Scene scene = new Scene(root,700,200);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.initOwner(mainBorderPane.getScene().getWindow());
			primaryStage.initModality(Modality.WINDOW_MODAL);
			Image icon = new Image(getClass().getResourceAsStream("/img/company-logo.png"));
			primaryStage.getIcons().add(icon);
			primaryStage.setResizable(true);
			primaryStage.setMinHeight(200);
			primaryStage.setMinWidth(700);
			primaryStage.setTitle("Micro Cars - Vehicle Model File");
			primaryStage.initStyle(StageStyle.DECORATED);
			primaryStage.setResizable(false);
			primaryStage.show();
		
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Couldn't load the VehicleModelFileGUI");
		}
		
	}
	
	@FXML
	public void viewVehicleMakeFileGUI() {
		
		Stage primaryStage = new Stage();
		
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("VehicleMake.fxml"));
			Scene scene = new Scene(root,700,150);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.initOwner(mainBorderPane.getScene().getWindow());
			primaryStage.initModality(Modality.WINDOW_MODAL);
			Image icon = new Image(getClass().getResourceAsStream("/img/company-logo.png"));
			primaryStage.getIcons().add(icon);
			primaryStage.setResizable(true);
			primaryStage.setMinHeight(150);
			primaryStage.setMinWidth(700);
			primaryStage.setTitle("Micro Cars - Vehicle Make File");
			primaryStage.initStyle(StageStyle.DECORATED);
			primaryStage.setResizable(false);
			primaryStage.show();
		
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Couldn't load the VehicleMakeFileGUI");
		}
		
	}
	
	@FXML
	public void viewVehicleOwnerFileGUI() {
		
		Stage primaryStage = new Stage();
		
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("VehicleOwner.fxml"));
			Scene scene = new Scene(root,750,350);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.initOwner(mainBorderPane.getScene().getWindow());
			primaryStage.initModality(Modality.WINDOW_MODAL);
			Image icon = new Image(getClass().getResourceAsStream("/img/company-logo.png"));
			primaryStage.getIcons().add(icon);
			primaryStage.setResizable(true);
			primaryStage.setMinHeight(350);
			primaryStage.setMinWidth(750);
			primaryStage.setTitle("Micro Cars - Vehicle Owner / Customer Master File");
			primaryStage.initStyle(StageStyle.DECORATED);
			primaryStage.setResizable(false);
			primaryStage.show();
		
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Couldn't load the VehicleOwnerFileGUI");
		}
	}
	
	@FXML
	public void viewVehicleDeliveryRecordGUI() {
		
		Stage primaryStage = new Stage();
		
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("VehicleDeliveryRecord.fxml"));
			Scene scene = new Scene(root,700,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.initOwner(mainBorderPane.getScene().getWindow());
			primaryStage.initModality(Modality.WINDOW_MODAL);
			Image icon = new Image(getClass().getResourceAsStream("/img/company-logo.png"));
			primaryStage.getIcons().add(icon);
			primaryStage.setResizable(true);
			primaryStage.setMinHeight(400);
			primaryStage.setMinWidth(700);
			primaryStage.setTitle("Micro Cars - Vehicle Delivery Record");
			primaryStage.initStyle(StageStyle.DECORATED);
			primaryStage.setResizable(false);
			primaryStage.show();
		
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Couldn't load the VehicleDeliveryRecordGUI");
		}
		
	}
	
	@FXML
	public void viewSalesInvoiceGUI() {
		
		Stage primaryStage = new Stage();
		
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("SalesInvoice.fxml"));
			Scene scene = new Scene(root,800,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.initOwner(mainBorderPane.getScene().getWindow());
			primaryStage.initModality(Modality.WINDOW_MODAL);
			Image icon = new Image(getClass().getResourceAsStream("/img/company-logo.png"));
			primaryStage.getIcons().add(icon);
			primaryStage.setResizable(true);
			primaryStage.setMinHeight(600);
			primaryStage.setMinWidth(800);
			primaryStage.setTitle("Micro Cars - Sales Invoice");
			primaryStage.initStyle(StageStyle.DECORATED);
			primaryStage.show();
		
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Couldn't load the SalesInvoiceGUI");
		}
		
	}
	
	@FXML
	public void viewItemSalesReportGUI() {
		
		Stage primaryStage = new Stage();
		
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("ItemSalesReport.fxml"));
			Scene scene = new Scene(root,800,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.initOwner(mainBorderPane.getScene().getWindow());
			primaryStage.initModality(Modality.WINDOW_MODAL);
			Image icon = new Image(getClass().getResourceAsStream("/img/company-logo.png"));
			primaryStage.getIcons().add(icon);
			primaryStage.setResizable(true);
			primaryStage.setMinHeight(600);
			primaryStage.setMinWidth(800);
			primaryStage.setTitle("Micro Cars - Item Sales Report");
			primaryStage.initStyle(StageStyle.DECORATED);
			primaryStage.show();
		
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Couldn't load the ItemSalesReportGUI");
		}
		
	}
	
	@FXML
	public void viewVehicleDeliveryReportGUI() {
		
		Stage primaryStage = new Stage();
		
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("VehicleDeliveryReport.fxml"));
			Scene scene = new Scene(root,800,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.initOwner(mainBorderPane.getScene().getWindow());
			primaryStage.initModality(Modality.WINDOW_MODAL);
			Image icon = new Image(getClass().getResourceAsStream("/img/company-logo.png"));
			primaryStage.getIcons().add(icon);
			primaryStage.setResizable(true);
			primaryStage.setMinHeight(600);
			primaryStage.setMinWidth(800);
			primaryStage.setTitle("Micro Cars - Vehicle Delivery Report");
			primaryStage.initStyle(StageStyle.DECORATED);
			primaryStage.show();
		
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Couldn't load the VehicleDeliveryReportGUI");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	@SuppressWarnings("unchecked")
	@FXML
	public void initialize() {
		
		TreeItem<String> root = new TreeItem<>("Department");
		root.setExpanded(true);
		treeView.setEditable(true);
		//treeView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		TreeItem<String> mainnode1 = new TreeItem<>("Wareshouse",  new ImageView(icon1));
		TreeItem<String> mainnode2 = new TreeItem<>("Procurement", new ImageView(icon2));
		TreeItem<String> mainnode3 = new TreeItem<>("Production", new ImageView(icon3));
		TreeItem<String> mainnode4 = new TreeItem<>("Sales", new ImageView(icon4));
		TreeItem<String> mainnode5 = new TreeItem<>("Reports", new ImageView(icon5));
		
		root.getChildren().addAll(mainnode1, mainnode2, mainnode3,mainnode4,mainnode5);
		
		TreeItem<String> mainnode11 = new TreeItem<>("Item Master File");
		TreeItem<String> mainnode12 = new TreeItem<>("Item Category");
		TreeItem<String> mainnode13 = new TreeItem<>("Item Models");
		TreeItem<String> mainnode14 = new TreeItem<>("Item Inquiry");
		mainnode1.getChildren().addAll(mainnode11, mainnode12, mainnode13,mainnode14);
		mainnode1.setExpanded(true);
		
		TreeItem<String> mainnode21 = new TreeItem<>("Purchase Order");
		TreeItem<String> mainnode22 = new TreeItem<>("Good Receive Note");
		TreeItem<String> mainnode23 = new TreeItem<>("Supplier Master File");
		mainnode2.getChildren().addAll(mainnode21, mainnode22, mainnode23);
		mainnode2.setExpanded(true);
		
		TreeItem<String> mainnode31 = new TreeItem<>("Vehicle Master File");
		TreeItem<String> mainnode32 = new TreeItem<>("Vehicle Category");
		TreeItem<String> mainnode33 = new TreeItem<>("Vehicle Model");
		TreeItem<String> mainnode34 = new TreeItem<>("Vehicle Make");
		TreeItem<String> mainnode35 = new TreeItem<>("Vehicle Owner");
		TreeItem<String> mainnode36 = new TreeItem<>("Vehicle Delivery Record");
		mainnode3.getChildren().addAll(mainnode31, mainnode32, mainnode33,mainnode34,mainnode35,mainnode36);
		mainnode3.setExpanded(true);
		
		TreeItem<String> mainnode41 = new TreeItem<>("Sales Invoice");
		mainnode4.getChildren().addAll(mainnode41);
		mainnode4.setExpanded(true);
		
		TreeItem<String> mainnode51 = new TreeItem<>("Item Sales Report");
		TreeItem<String> mainnode52 = new TreeItem<>("Vehicle Delivery Report");
		TreeItem<String> mainnode53 = new TreeItem<>("Other Reports");
		
		mainnode5.getChildren().addAll(mainnode51,mainnode52,mainnode53);
		mainnode5.setExpanded(true);
		
	
		treeView.setRoot(root);
		
		
		
	}
	
	@FXML
	public void mouseClick(MouseEvent mouseEvent) {
		
		TreeItem<String> item = treeView.getSelectionModel().getSelectedItem();
		
		String value = item.getValue();
	
        switch (value) {
            case "Item Master File"			: viewItemMasterFileGUI();
                 							break;
            case "Item Category"			: viewItemCategoryFileGUI();
            								break;
            case "Item Models"				: viewItemModelFileGUI();
            								break;
            case "Item Inquiry"				: viewItemInquiryGUI();
                     						break;
            case "Purchase Order"			: viewPurchaseOrderGUI();
                     						break;
            case "Good Receive Note"		: viewGoodReceivedNoteGUI();
                     						break;
            case "Supplier Master File"		: viewSupplierMasterFileGUI();
                     						break;
            case "Vehicle Master File"		: viewVehicleMasterFileGUI();
                     						break;
            case "Vehicle Category"			: viewVehicleCategoryFileGUI();
                     						break;
            case "Vehicle Model"			: viewVehicleModelFileGUI();
                     						break;
            case "Vehicle Make"				: viewVehicleMakeFileGUI();
                     						break;
            case "Vehicle Owner"			: viewVehicleOwnerFileGUI();
                     						break;
            case "Vehicle Delivery Record"  : viewVehicleDeliveryRecordGUI();
                     						break;					
            case "Sales Invoice"			: viewSalesInvoiceGUI();
            		 						break;
            case "Item Sales Report"		: viewItemSalesReportGUI();
   		 			 						break;
            case "Vehicle Delivery Report" 	: viewVehicleDeliveryReportGUI();
   		 			 						break;
            
        }	
		
	}
	
	

	
	





	
	
	
	
	
	
	
	
}
