package com.microcars.stores;

import com.microcars.vehicle.VehicleModel;

public class ItemModel {
	
	private Item item;
	private VehicleModel vehicleModel;
	
	public ItemModel(Item item, VehicleModel vehicleModel) {
		
		this.item = item;
		this.vehicleModel = vehicleModel;
	}

	
	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public VehicleModel getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(VehicleModel vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	
	
	
	

}




