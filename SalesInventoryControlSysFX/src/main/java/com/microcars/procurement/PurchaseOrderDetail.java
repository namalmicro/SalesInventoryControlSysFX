package com.microcars.procurement;

import com.microcars.stores.Item;

public class PurchaseOrderDetail {
	
	private PurchaseOrderHeader purchaseOrderHeader;
	private Item purchaseItem;
	private int purchaseOrderQty;
	private Double poTotAmtPerItem;
	
	public PurchaseOrderDetail(PurchaseOrderHeader purchaseOrderHeader, Item purchaseItem, int purchaseOrderQty,
			Double poTotAmtPerItem) {
		this.purchaseOrderHeader = purchaseOrderHeader;
		this.purchaseItem = purchaseItem;
		this.purchaseOrderQty = purchaseOrderQty;
		this.poTotAmtPerItem = poTotAmtPerItem;
	}

	
	public PurchaseOrderHeader getPurchaseOrderHeader() {
		return purchaseOrderHeader;
	}

	public void setPurchaseOrderHeader(PurchaseOrderHeader purchaseOrderHeader) {
		this.purchaseOrderHeader = purchaseOrderHeader;
	}

	public Item getPurchaseItem() {
		return purchaseItem;
	}

	public void setPurchaseItem(Item purchaseItem) {
		this.purchaseItem = purchaseItem;
	}

	public int getPurchaseOrderQty() {
		return purchaseOrderQty;
	}

	public void setPurchaseOrderQty(int purchaseOrderQty) {
		this.purchaseOrderQty = purchaseOrderQty;
	}

	public Double getPoTotAmtPerItem() {
		return poTotAmtPerItem;
	}

	public void setPoTotAmtPerItem(Double poTotAmtPerItem) {
		this.poTotAmtPerItem = poTotAmtPerItem;
	}
	
	
	
	
	

}


