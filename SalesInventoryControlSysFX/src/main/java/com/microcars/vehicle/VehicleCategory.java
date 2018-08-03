package com.microcars.vehicle;

public class VehicleCategory {
	
	private int vehicleCategoryID;
	private String vehicleCategoryName;
	
	public VehicleCategory(int vehicleCategoryID, String vehicleCategoryName) {
		
		this.vehicleCategoryID = vehicleCategoryID;
		this.vehicleCategoryName = vehicleCategoryName;
	}

	
	public int getVehicleCategoryID() {
		return vehicleCategoryID;
	}

	public void setVehicleCategoryID(int vehicleCategoryID) {
		this.vehicleCategoryID = vehicleCategoryID;
	}

	public String getVehicleCategoryName() {
		return vehicleCategoryName;
	}

	public void setVehicleCategoryName(String vehicleCategoryName) {
		this.vehicleCategoryName = vehicleCategoryName;
	}
	
	
	
	
	

}


