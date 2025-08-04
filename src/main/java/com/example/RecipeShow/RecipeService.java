package com.example.RecipeShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

	@Service
	public class RecipeService {
		

	    @Autowired
	    private RecipeRepository recipeRepository;

	    public List<RecipeEntity> getAllRecipes() {
	        return recipeRepository.findAll();
	    }

	    public RecipeEntity getRecipeByName(String name) {
	        return recipeRepository.findByNameIgnoreCase(name);
	    }
	    public RecipeEntity saveRecipe(RecipeEntity recipe) {
	        return recipeRepository.save(recipe);
	    }
	    public void deleteAllRecipes() {
	        recipeRepository.deleteAll();
	    }


	}

