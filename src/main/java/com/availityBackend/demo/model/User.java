package com.availityBackend.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@SequenceGenerator(name="usersequence", initialValue=100)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="usersequence")
	private long userId;
	@Column(name = "firstname", nullable = false)
	private String firstname;
	@Column(name = "lastname", nullable = false)
	private String lastname;
	@Column(name = "npinumber", nullable = false)
	private String npiNumber;
	@Column(name = "phonenumber", nullable = false)
	private String phonenumber;
	@Column(name = "emailid", nullable = false)
	private String email;
	@Column(name = "addressline1", nullable = false)
	private String line1;
	@Column(name = "city", nullable = false)
	private String city;
	@Column(name = "state", nullable = false)
	private String state;
	@Column(name = "zipcode", nullable = false)
	private String zipcode;
	@Column(name = "status", nullable = false)
	private int deleted;	
	
	
	public User() {
		super();
	}
	public User(String firstname, String lastname, String npiNumber, String phonenumber, String email, String line1,
			String city, String state, String zipcode, int deleted) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.npiNumber = npiNumber;
		this.phonenumber = phonenumber;
		this.email = email;
		this.line1 = line1;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.deleted = deleted;
	}
	public User(long userId, String firstname, String lastname, String npiNumber, String phonenumber, String email,
			String line1, String city, String state, String zipcode, int deleted) {
		super();
		this.userId = userId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.npiNumber = npiNumber;
		this.phonenumber = phonenumber;
		this.email = email;
		this.line1 = line1;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.deleted = deleted;
	}
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getNpiNumber() {
		return npiNumber;
	}
	public void setNpiNumber(String npiNumber) {
		this.npiNumber = npiNumber;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
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
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getDeleted() {
		return zipcode;
	}
	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}
	
	
	
	
	

}
