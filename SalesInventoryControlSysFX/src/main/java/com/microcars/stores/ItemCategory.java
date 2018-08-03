package com.microcars.stores;

public class ItemCategory {
	
	private int itemCategoryID;
	private String itemCategoryName;
	
	public ItemCategory(int itemCategoryID, String itemCategoryName) {
		
		this.itemCategoryID = itemCategoryID;
		this.itemCategoryName = itemCategoryName;
	}

	
	public int getItemCategoryID() {
		return itemCategoryID;
	}

	public void setItemCategoryID(int itemCategoryID) {
		this.itemCategoryID = itemCategoryID;
	}

	public String getItemCategoryName() {
		return itemCategoryName;
	}

	public void setItemCategoryName(String itemCategoryName) {
		this.itemCategoryName = itemCategoryName;
	}
	
	
	
	
	
	

}


