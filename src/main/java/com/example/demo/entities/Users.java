package com.example.demo.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String username;
	String email;
	String password;
	String gender;
	String address;
	String role;
	boolean isPremium;
	public Users() {
		super();
	}
	public Users(int id, String username, String email, String password, String gender, String address, String role,
			boolean isPremium) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.address = address;
		this.role = role;
		this.isPremium = isPremium;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isPremium() {
		return isPremium;
	}
	public void setPremium(boolean isPremium) {
		this.isPremium = isPremium;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", gender=" + gender + ", address=" + address + ", role=" + role + ", isPremium=" + isPremium
				+ ", getId()=" + getId() + ", getUsername()=" + getUsername() + ", getEmail()=" + getEmail()
				+ ", getPassword()=" + getPassword() + ", getGender()=" + getGender() + ", getAddress()=" + getAddress()
				+ ", getRole()=" + getRole() + ", isPremium()=" + isPremium() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

	
	

}
