package leisure.pass.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Pass {
	
@Id
private String passId;
private Date date;
private int  passLength;
private String passCity;

@JoinColumn(name = "customerId")
@ManyToOne(fetch = FetchType.LAZY)
private Customer customer;

@JoinColumn(name = "vendorId")
@OneToOne(fetch = FetchType.LAZY)
private Vendor vendor;



public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public String getPassId() {
	return passId;
}
public void setPassId(String passId) {
	this.passId = passId;
}

public Vendor getVendor() {
	return vendor;
}
public void setVendor(Vendor vendor) {
	this.vendor = vendor;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public int getPassLength() {
	return passLength;
}
public void setPassLength(int passLength) {
	this.passLength = passLength;
}
public String getPassCity() {
	return passCity;
}
public void setPassCity(String passCity) {
	this.passCity = passCity;
}

@Override
public String toString() {
	return "Pass [passId=" + passId + ", date=" + date + ", passLength=" + passLength + ", passCity=" + passCity
			+ ", customer=" + customer + ", vendor=" + vendor + "]";
}








}
