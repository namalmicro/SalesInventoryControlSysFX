package com.microcars.vehicle;

public class Vehicle {
	
	private long vehicleRegNumber;
	private String vehicleNumber;
	private String chassisNumber;
	private String engineNumber;
	private String bodyColorCode;
	private String bodyColor;
	private String manufatureYear;
	private String fuelType;
	private String vehicleMileage;
	private String vehicleRemarks;
	private VehicleCategory vehicleCategory;
	private VehicleMake vehicleMake;
	private VehicleModel vehicleModel;
	
	public Vehicle(long vehicleRegNumber, String vehicleNumber, String chassisNumber, String engineNumber,
			String bodyColorCode, String bodyColor, String manufatureYear, String fuelType, String vehicleMileage,
			String vehicleRemarks, VehicleCategory vehicleCategory, VehicleMake vehicleMake,
			VehicleModel vehicleModel) {

		this.vehicleRegNumber = vehicleRegNumber;
		this.vehicleNumber = vehicleNumber;
		this.chassisNumber = chassisNumber;
		this.engineNumber = engineNumber;
		this.bodyColorCode = bodyColorCode;
		this.bodyColor = bodyColor;
		this.manufatureYear = manufatureYear;
		this.fuelType = fuelType;
		this.vehicleMileage = vehicleMileage;
		this.vehicleRemarks = vehicleRemarks;
		this.vehicleCategory = vehicleCategory;
		this.vehicleMake = vehicleMake;
		this.vehicleModel = vehicleModel;
	}

	
	public long getVehicleRegNumber() {
		return vehicleRegNumber;
	}

	public void setVehicleRegNumber(long vehicleRegNumber) {
		this.vehicleRegNumber = vehicleRegNumber;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getChassisNumber() {
		return chassisNumber;
	}

	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}

	public String getEngineNumber() {
		return engineNumber;
	}

	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}

	public String getBodyColorCode() {
		return bodyColorCode;
	}

	public void setBodyColorCode(String bodyColorCode) {
		this.bodyColorCode = bodyColorCode;
	}

	public String getBodyColor() {
		return bodyColor;
	}

	public void setBodyColor(String bodyColor) {
		this.bodyColor = bodyColor;
	}

	public String getManufatureYear() {
		return manufatureYear;
	}

	public void setManufatureYear(String manufatureYear) {
		this.manufatureYear = manufatureYear;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getVehicleMileage() {
		return vehicleMileage;
	}

	public void setVehicleMileage(String vehicleMileage) {
		this.vehicleMileage = vehicleMileage;
	}

	public String getVehicleRemarks() {
		return vehicleRemarks;
	}

	public void setVehicleRemarks(String vehicleRemarks) {
		this.vehicleRemarks = vehicleRemarks;
	}

	public VehicleCategory getVehicleCategory() {
		return vehicleCategory;
	}

	public void setVehicleCategory(VehicleCategory vehicleCategory) {
		this.vehicleCategory = vehicleCategory;
	}

	public VehicleMake getVehicleMake() {
		return vehicleMake;
	}

	public void setVehicleMake(VehicleMake vehicleMake) {
		this.vehicleMake = vehicleMake;
	}

	public VehicleModel getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(VehicleModel vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	
	
	
	
	
	
		

}









