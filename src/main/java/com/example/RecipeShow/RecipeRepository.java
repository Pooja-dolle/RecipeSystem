package com.example.RecipeShow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<RecipeEntity, Long> 
{
	    RecipeEntity findByNameIgnoreCase(String name);  
}



