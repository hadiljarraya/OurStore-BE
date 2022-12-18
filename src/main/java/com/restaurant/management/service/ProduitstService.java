package com.restaurant.management.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.restaurant.management.model.Produit;
import com.restaurant.management.repository.ProduitsRepository;

//defining the business logic  
@Service 

public class ProduitstService {

	@Autowired  
	ProduitsRepository produitsRepository;  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Produit> getAllproduits()   
	{  
		List<Produit> produits = new ArrayList<Produit>();  
		produitsRepository.findAll().forEach(produit1 -> produits.add(produit1));  
		return produits;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Produit getproduitsById(int id)   
	{  
		return produitsRepository.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Produit produits)   
	{  
		produitsRepository.save(produits);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		produitsRepository.deleteById(id);  
	} 


}


