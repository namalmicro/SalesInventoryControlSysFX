package com.microcars.vehicle;

public class VehicleOwner {
	
	private long ownerID;
	private VehicleOwnerTitle ownerTitle;
	private String ownerFullName;
	private String ownerContactNumber;
	private String ownerEmail;
	private String ownerNationalID;
	private String ownerStreetAddress;
	private String ownerCity;
	private String ownerPostalCode;
	
	public VehicleOwner(long ownerID, VehicleOwnerTitle ownerTitle, String ownerFullName, String ownerContactNumber,
			String ownerEmail, String ownerNationalID, String ownerStreetAddress, String ownerCity,
			String ownerPostalCode) {
		
		this.ownerID = ownerID;
		this.ownerTitle = ownerTitle;
		this.ownerFullName = ownerFullName;
		this.ownerContactNumber = ownerContactNumber;
		this.ownerEmail = ownerEmail;
		this.ownerNationalID = ownerNationalID;
		this.ownerStreetAddress = ownerStreetAddress;
		this.ownerCity = ownerCity;
		this.ownerPostalCode = ownerPostalCode;
	}
	

	public long getOwnerID() {
		return ownerID;
	}

	public void setOwnerID(long ownerID) {
		this.ownerID = ownerID;
	}

	public VehicleOwnerTitle getOwnerTitle() {
		return ownerTitle;
	}

	public void setOwnerTitle(VehicleOwnerTitle ownerTitle) {
		this.ownerTitle = ownerTitle;
	}

	public String getOwnerFullName() {
		return ownerFullName;
	}

	public void setOwnerFullName(String ownerFullName) {
		this.ownerFullName = ownerFullName;
	}

	public String getOwnerContactNumber() {
		return ownerContactNumber;
	}

	public void setOwnerContactNumber(String ownerContactNumber) {
		this.ownerContactNumber = ownerContactNumber;
	}

	public String getOwnerEmail() {
		return ownerEmail;
	}

	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}

	public String getOwnerNationalID() {
		return ownerNationalID;
	}

	public void setOwnerNationalID(String ownerNationalID) {
		this.ownerNationalID = ownerNationalID;
	}

	public String getOwnerStreetAddress() {
		return ownerStreetAddress;
	}

	public void setOwnerStreetAddress(String ownerStreetAddress) {
		this.ownerStreetAddress = ownerStreetAddress;
	}

	public String getOwnerCity() {
		return ownerCity;
	}

	public void setOwnerCity(String ownerCity) {
		this.ownerCity = ownerCity;
	}

	public String getOwnerPostalCode() {
		return ownerPostalCode;
	}

	public void setOwnerPostalCode(String ownerPostalCode) {
		this.ownerPostalCode = ownerPostalCode;
	}
	
	
	
	
	
	
	

}


