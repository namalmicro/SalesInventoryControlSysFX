package com.microcars.procurement;

import java.util.Date;

public class PurchaseOrderHeader {
	
	private long purchaseOrderNo;
	private Supplier supplier;
	private Date purchaseOrderDate;
	private String purchaseNotes;
	private double purchaseSubTotal;
	private double purchaseVATAmount;
	private float purchaseNBTAmount;
	private double purchaseTotalAmount;
	
	public PurchaseOrderHeader(long purchaseOrderNo, Supplier supplier, Date purchaseOrderDate, String purchaseNotes,
			double purchaseSubTotal, double purchaseVATAmount, float purchaseNBTAmount, double purchaseTotalAmount) {
		
		this.purchaseOrderNo = purchaseOrderNo;
		this.supplier = supplier;
		this.purchaseOrderDate = purchaseOrderDate;
		this.purchaseNotes = purchaseNotes;
		this.purchaseSubTotal = purchaseSubTotal;
		this.purchaseVATAmount = purchaseVATAmount;
		this.purchaseNBTAmount = purchaseNBTAmount;
		this.purchaseTotalAmount = purchaseTotalAmount;
	}

	
	public long getPurchaseOrderNo() {
		return purchaseOrderNo;
	}

	public void setPurchaseOrderNo(long purchaseOrderNo) {
		this.purchaseOrderNo = purchaseOrderNo;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Date getPurchaseOrderDate() {
		return purchaseOrderDate;
	}

	public void setPurchaseOrderDate(Date purchaseOrderDate) {
		this.purchaseOrderDate = purchaseOrderDate;
	}

	public String getPurchaseNotes() {
		return purchaseNotes;
	}

	public void setPurchaseNotes(String purchaseNotes) {
		this.purchaseNotes = purchaseNotes;
	}

	public double getPurchaseSubTotal() {
		return purchaseSubTotal;
	}

	public void setPurchaseSubTotal(double purchaseSubTotal) {
		this.purchaseSubTotal = purchaseSubTotal;
	}

	public double getPurchaseVATAmount() {
		return purchaseVATAmount;
	}

	public void setPurchaseVATAmount(double purchaseVATAmount) {
		this.purchaseVATAmount = purchaseVATAmount;
	}

	public float getPurchaseNBTAmount() {
		return purchaseNBTAmount;
	}

	public void setPurchaseNBTAmount(float purchaseNBTAmount) {
		this.purchaseNBTAmount = purchaseNBTAmount;
	}

	public double getPurchaseTotalAmount() {
		return purchaseTotalAmount;
	}

	public void setPurchaseTotalAmount(double purchaseTotalAmount) {
		this.purchaseTotalAmount = purchaseTotalAmount;
	}
	
	
	
	
	
	
	
	
	
	

}

