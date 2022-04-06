package com;

import javax.persistence.*;

@Entity
@Table(name="details")
public class UserDetails {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String userName;
	
	//connection between user and vehicle class
	@OneToOne
	@JoinColumn(name="Vehicle") //rename table column
	private Vehicle vehicle;
	
	
	public Vehicle getVehicle() { 
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public int getUserId() {
		return id;
	}
	public void setUserId(int userId) {
		this.id = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", userName=" + userName + "]";
	}
	
	
	public UserDetails() {
		super();
	}
	public UserDetails(String userName) {
		super();
		this.userName = userName;
	}
	
	
}
