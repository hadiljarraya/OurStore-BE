package com.restaurant.management.model;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
  
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table 
//Defining book id as primary key 
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // @GeneratedValue Provides for the specification of generation strategies for the values of primary keys.
	@Column  
	private int idClient;  
	@Column  
	private String name;  
	@Column  
	private String email;  
	@Column  
	private String  phone;
	@Column  
	private String  adresse;
	
	@OneToMany(cascade = CascadeType.ALL) //  This annotation represents that a collection of objects are direct children of the current entity 
	@JoinColumn(name = "fk_client_id", referencedColumnName="idClient")
   
	
	
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", adresse=" + adresse + "]";
	}

	
	
	
	

}
