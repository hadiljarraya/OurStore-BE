package com.restaurant.management.repository;
import org.springframework.data.repository.CrudRepository;

import com.restaurant.management.model.Produit;

//repository that extends CrudRepository  
public interface ProduitsRepository extends CrudRepository<Produit, Integer>  
{  
}  
