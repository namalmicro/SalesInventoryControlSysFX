package com.microcars.procurement;

public class Supplier {
	
	private double supplierID;
	private String supplierName;
	private String supplierContactNumber;
	private String supplierEmail;
	private String supplierStreetAddress;
	private String supplierCity;
	private String supplierPostalCode;
	private String supplierAddrState;
	private String supplierCountry;
	
	public Supplier(double supplierID, String supplierName, String supplierContactNumber, String supplierEmail,
			String supplierStreetAddress, String supplierCity, String supplierPostalCode, String supplierAddrState,
			String supplierCountry) {
	
		this.supplierID = supplierID;
		this.supplierName = supplierName;
		this.supplierContactNumber = supplierContactNumber;
		this.supplierEmail = supplierEmail;
		this.supplierStreetAddress = supplierStreetAddress;
		this.supplierCity = supplierCity;
		this.supplierPostalCode = supplierPostalCode;
		this.supplierAddrState = supplierAddrState;
		this.supplierCountry = supplierCountry;
	}

	
	public double getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(double supplierID) {
		this.supplierID = supplierID;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierContactNumber() {
		return supplierContactNumber;
	}

	public void setSupplierContactNumber(String supplierContactNumber) {
		this.supplierContactNumber = supplierContactNumber;
	}

	public String getSupplierEmail() {
		return supplierEmail;
	}

	public void setSupplierEmail(String supplierEmail) {
		this.supplierEmail = supplierEmail;
	}

	public String getSupplierStreetAddress() {
		return supplierStreetAddress;
	}

	public void setSupplierStreetAddress(String supplierStreetAddress) {
		this.supplierStreetAddress = supplierStreetAddress;
	}

	public String getSupplierCity() {
		return supplierCity;
	}

	public void setSupplierCity(String supplierCity) {
		this.supplierCity = supplierCity;
	}

	public String getSupplierPostalCode() {
		return supplierPostalCode;
	}

	public void setSupplierPostalCode(String supplierPostalCode) {
		this.supplierPostalCode = supplierPostalCode;
	}

	public String getSupplierAddrState() {
		return supplierAddrState;
	}

	public void setSupplierAddrState(String supplierAddrState) {
		this.supplierAddrState = supplierAddrState;
	}

	public String getSupplierCountry() {
		return supplierCountry;
	}

	public void setSupplierCountry(String supplierCountry) {
		this.supplierCountry = supplierCountry;
	}
	
	
	
	
	
	

}



