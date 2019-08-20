package com.frs.springmvc.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="REGISTER")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotEmpty
	@Column(name = "USERID", unique=true, nullable = false)
	private String userId;
	
	@Size(min=3, max=20)
	@Column(name = "FIRSTNAME", nullable = false)
	private String firstName;
	
	@Size(min=1, max=20)
	@Column(name = "LASTNAME", nullable = false)
	private String lastName;
	
	@DateTimeFormat(pattern="dd/MM/yyyy") 
	@Column(name="DOB", nullable = false)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	private LocalDate dob;
	
	@Column(name = "GENDER", nullable = false)
	private String gender;
	
	@Size(max=30)
	@Column(name = "STREET", nullable = false)
	private String street;
	
	@Size(max=20)
	@Column(name = "LOCATION", nullable = false)
	private String location;
	
	@Size(max=20)
	@Column(name = "CITY", nullable = false)
	private String city;
	
	@Size(max=20)
	@Column(name = "STATE", nullable = false)
	private String state;
	
	@Size(max=20)
	@Column(name = "PINCODE", nullable = false)
	private String pincode;
	
	@Size(min=10, max=10)
	@Column(name = "PHNO", nullable = false)
	private String phNo;
	
	@Size(min=5, max=30)
	@Column(name = "EMAILID", nullable = false)
	private String emailId;
	
	@Size(min=3, max=20)
	@Column(name = "PASSWORD", nullable = false)
	private String password;
	
	@Size(max=10)
	@Column(name = "USERTYPE", nullable = false)
	private String userType;

	

	@Override
	public String toString() {
		return "User [id=" + id + ", userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dob=" + dob + ", gender=" + gender + ", street=" + street + ", location=" + location + ", city="
				+ city + ", state=" + state + ", pincode=" + pincode + ", phNo=" + phNo + ", emailId=" + emailId
				+ ", password=" + password + ", userType=" + userType + "]";
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	

	

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	
}
