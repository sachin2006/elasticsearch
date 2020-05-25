package com.fusionincr.elasticsearch.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "apartments", type = "apartment")
public class Apartment {
    @Id
    private String apartmentName;
    private String email;
    private String contactNumber;
    private String imageUrl;

    public Apartment() {
    }

    public Apartment(String apartmentName, String email, String contactNumber) {
        this.apartmentName = apartmentName;
        this.email = email;
        this.contactNumber = contactNumber;
    }

    public void setApartmentName(String apartmentName) {
        this.apartmentName = apartmentName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getApartmentName() {
        return apartmentName;
    }

    public String getEmail() {
        return email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@Override
	public String toString() {
		return "Apartment [apartmentName=" + apartmentName + ", email=" + email + ", contactNumber=" + contactNumber
				+ ", imageUrl=" + imageUrl + "]";
	}
}
