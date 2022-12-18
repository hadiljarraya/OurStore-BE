package com.restaurant.management.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.management.model.Produit;
import com.restaurant.management.service.ProduitstService;

//mark class as Controller  


@RestController 
@CrossOrigin(origins = "*")
//@RequestMapping("/api")
public class ProduitsController {

	//Autowire the BooksService class  
	@Autowired  
	ProduitstService produitstservice;  
	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/produit")
	private List<Produit> getAllproduits()   
	{  
		return produitstservice.getAllproduits();  
	}  

	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/produit/{produittid}")  
	private Produit getproduits(@PathVariable("produittid") int produitid)   
	{  
		return produitstservice.getproduitsById(produitid);  
	}  


	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/produit/{produitid}")  
	private void deleteproduit(@PathVariable("produitid") int produitid)   
	{  
		produitstservice.delete(produitid);  
	} 

	@PostMapping("/produit")  
	private int saveProduit(@RequestBody Produit produit)   
	{  
		produitstservice.saveOrUpdate(produit);  
		return produit.getId();  
	} 

	//creating put mapping that updates the book detail
	//@CrossOrigin(origins = "*")
	@PutMapping("/produit")  
	private Produit update(@RequestBody  Produit produit)   
	{  
		produitstservice.saveOrUpdate(produit);  
		return produit;  
	}  
}
