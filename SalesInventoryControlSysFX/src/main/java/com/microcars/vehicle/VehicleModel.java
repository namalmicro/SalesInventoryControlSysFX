package com.microcars.vehicle;

public class VehicleModel {
	
	private int vehicleModelID;
	private String vehicleModelName;
	private VehicleMake vehicleMake;
	
	public VehicleModel(int vehicleModelID, String vehicleModelName, VehicleMake vehicleMake) {
		
		this.vehicleModelID = vehicleModelID;
		this.vehicleModelName = vehicleModelName;
		this.vehicleMake = vehicleMake;
	}

	
	public int getVehicleModelID() {
		return vehicleModelID;
	}

	public void setVehicleModelID(int vehicleModelID) {
		this.vehicleModelID = vehicleModelID;
	}

	public String getVehicleModelName() {
		return vehicleModelName;
	}

	public void setVehicleModelName(String vehicleModelName) {
		this.vehicleModelName = vehicleModelName;
	}

	public VehicleMake getVehicleMake() {
		return vehicleMake;
	}

	public void setVehicleMake(VehicleMake vehicleMake) {
		this.vehicleMake = vehicleMake;
	}
	
	
	

}


