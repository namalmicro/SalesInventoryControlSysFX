package com.microcars.aftersales;

import com.microcars.stores.Item;

public class InvoiceDetail {
	
	private InvoiceHeader invoiceHeader;
	private Item invoiceItem;
	private int invoiceQty;
	private Double invoiceTotAmtPerItem;
	
	public InvoiceDetail(InvoiceHeader invoiceHeader, Item invoiceItem, int invoiceQty, Double invoiceTotAmtPerItem) {
		
		this.invoiceHeader = invoiceHeader;
		this.invoiceItem = invoiceItem;
		this.invoiceQty = invoiceQty;
		this.invoiceTotAmtPerItem = invoiceTotAmtPerItem;
	}

	
	public InvoiceHeader getInvoiceHeader() {
		return invoiceHeader;
	}

	public void setInvoiceHeader(InvoiceHeader invoiceHeader) {
		this.invoiceHeader = invoiceHeader;
	}

	public Item getInvoiceItem() {
		return invoiceItem;
	}

	public void setInvoiceItem(Item invoiceItem) {
		this.invoiceItem = invoiceItem;
	}

	public int getInvoiceQty() {
		return invoiceQty;
	}

	public void setInvoiceQty(int invoiceQty) {
		this.invoiceQty = invoiceQty;
	}

	public Double getInvoiceTotAmtPerItem() {
		return invoiceTotAmtPerItem;
	}

	public void setInvoiceTotAmtPerItem(Double invoiceTotAmtPerItem) {
		this.invoiceTotAmtPerItem = invoiceTotAmtPerItem;
	}
	
	
	
	
	
	

}
