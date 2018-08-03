package com.microcars.stores;

import com.microcars.vehicle.VehicleMake;

public class Item {
	
	private long itemNumber;
	private long partNumber;
	private String itemDescription;
	private double itemCostPrice;
	private int itemProfitMargin;
	private double itemSellPrice;
	private int itemQty;
	private float itemWeight;
	private String itemPicture;
	private String itemInactivity;
	private String itemReoderLevel;
	private String itemRemarks;
	private VehicleMake vehicleMake;
	private ItemCategory itemCategory;
	
	public Item(long itemNumber, long partNumber, String itemDescription, double itemCostPrice, int itemProfitMargin,
			double itemSellPrice, int itemQty, float itemWeight, String itemPicture, String itemInactivity,
			String itemReoderLevel, String itemRemarks, VehicleMake vehicleMake, ItemCategory itemCategory) {
	
		this.itemNumber = itemNumber;
		this.partNumber = partNumber;
		this.itemDescription = itemDescription;
		this.itemCostPrice = itemCostPrice;
		this.itemProfitMargin = itemProfitMargin;
		this.itemSellPrice = itemSellPrice;
		this.itemQty = itemQty;
		this.itemWeight = itemWeight;
		this.itemPicture = itemPicture;
		this.itemInactivity = itemInactivity;
		this.itemReoderLevel = itemReoderLevel;
		this.itemRemarks = itemRemarks;
		this.vehicleMake = vehicleMake;
		this.itemCategory = itemCategory;
	}

	
	public long getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(long itemNumber) {
		this.itemNumber = itemNumber;
	}

	public long getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(long partNumber) {
		this.partNumber = partNumber;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public double getItemCostPrice() {
		return itemCostPrice;
	}

	public void setItemCostPrice(double itemCostPrice) {
		this.itemCostPrice = itemCostPrice;
	}

	public int getItemProfitMargin() {
		return itemProfitMargin;
	}

	public void setItemProfitMargin(int itemProfitMargin) {
		this.itemProfitMargin = itemProfitMargin;
	}

	public double getItemSellPrice() {
		return itemSellPrice;
	}

	public void setItemSellPrice(double itemSellPrice) {
		this.itemSellPrice = itemSellPrice;
	}

	public int getItemQty() {
		return itemQty;
	}

	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}

	public float getItemWeight() {
		return itemWeight;
	}

	public void setItemWeight(float itemWeight) {
		this.itemWeight = itemWeight;
	}

	public String getItemPicture() {
		return itemPicture;
	}

	public void setItemPicture(String itemPicture) {
		this.itemPicture = itemPicture;
	}

	public String getItemInactivity() {
		return itemInactivity;
	}

	public void setItemInactivity(String itemInactivity) {
		this.itemInactivity = itemInactivity;
	}

	public String getItemReoderLevel() {
		return itemReoderLevel;
	}

	public void setItemReoderLevel(String itemReoderLevel) {
		this.itemReoderLevel = itemReoderLevel;
	}

	public String getItemRemarks() {
		return itemRemarks;
	}

	public void setItemRemarks(String itemRemarks) {
		this.itemRemarks = itemRemarks;
	}

	public VehicleMake getVehicleMake() {
		return vehicleMake;
	}

	public void setVehicleMake(VehicleMake vehicleMake) {
		this.vehicleMake = vehicleMake;
	}

	public ItemCategory getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(ItemCategory itemCategory) {
		this.itemCategory = itemCategory;
	}
	
	
	
	
	
	
	

}




