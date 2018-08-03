package com.microcars.vehicle;

import java.util.Date;

public class VehicleDeliveryRecord {
	
	private VehicleOwner vehicleOwner;
	private Vehicle vehicle;
	private Date diliverdDate;
	
	public VehicleDeliveryRecord(VehicleOwner vehicleOwner, Vehicle vehicle, Date diliverdDate) {
	
		this.vehicleOwner = vehicleOwner;
		this.vehicle = vehicle;
		this.diliverdDate = diliverdDate;
	}

	
	public VehicleOwner getVehicleOwner() {
		return vehicleOwner;
	}

	public void setVehicleOwner(VehicleOwner vehicleOwner) {
		this.vehicleOwner = vehicleOwner;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Date getDiliverdDate() {
		return diliverdDate;
	}

	public void setDiliverdDate(Date diliverdDate) {
		this.diliverdDate = diliverdDate;
	}
	
	
	
	
	
	
	
	

	
	
	
	

}



