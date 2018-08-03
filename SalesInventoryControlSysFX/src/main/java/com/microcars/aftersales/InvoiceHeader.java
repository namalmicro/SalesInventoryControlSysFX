package com.microcars.aftersales;

import java.util.Date;

import com.microcars.vehicle.VehicleOwner;

public class InvoiceHeader {
	
	private long invoiceNumber;
	private Date invoiceDate;
	private String invoiceNotes;
	private Double invoiceSubTotal;
	private Double invoiceVATAmount;
	private Double invoiceTotalAmount;
	private VehicleOwner vehicleOwner;
	
	public InvoiceHeader(long invoiceNumber, Date invoiceDate, String invoiceNotes, Double invoiceSubTotal,
			Double invoiceVATAmount, Double invoiceTotalAmount, VehicleOwner vehicleOwner) {
	
		this.invoiceNumber = invoiceNumber;
		this.invoiceDate = invoiceDate;
		this.invoiceNotes = invoiceNotes;
		this.invoiceSubTotal = invoiceSubTotal;
		this.invoiceVATAmount = invoiceVATAmount;
		this.invoiceTotalAmount = invoiceTotalAmount;
		this.vehicleOwner = vehicleOwner;
	}

	
	public long getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(long invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getInvoiceNotes() {
		return invoiceNotes;
	}

	public void setInvoiceNotes(String invoiceNotes) {
		this.invoiceNotes = invoiceNotes;
	}

	public Double getInvoiceSubTotal() {
		return invoiceSubTotal;
	}

	public void setInvoiceSubTotal(Double invoiceSubTotal) {
		this.invoiceSubTotal = invoiceSubTotal;
	}

	public Double getInvoiceVATAmount() {
		return invoiceVATAmount;
	}

	public void setInvoiceVATAmount(Double invoiceVATAmount) {
		this.invoiceVATAmount = invoiceVATAmount;
	}

	public Double getInvoiceTotalAmount() {
		return invoiceTotalAmount;
	}

	public void setInvoiceTotalAmount(Double invoiceTotalAmount) {
		this.invoiceTotalAmount = invoiceTotalAmount;
	}

	public VehicleOwner getVehicleOwner() {
		return vehicleOwner;
	}

	public void setVehicleOwner(VehicleOwner vehicleOwner) {
		this.vehicleOwner = vehicleOwner;
	}
	
	
	
	
	
	

}

