/**
 * 
 */
package com.fusionincr.elasticsearch.data;

/**
 * @author sachin
 * Apartment data from the http request
 */
public class ApartmentData {

	 private String apartmentName;
    private String email;
    private String contactNumber;
    private String imageUrl;
	public String getApartmentName() {
		return apartmentName;
	}
	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
}
