package com.example.RecipeShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/recipes")
@CrossOrigin(origins = "*")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

   
    @GetMapping
    public List<RecipeEntity> getAllRecipes() {
        return recipeService.getAllRecipes();
    }

   
    @GetMapping("/search")
    public ResponseEntity<RecipeEntity> searchByName(@RequestParam String name) {
        RecipeEntity recipe = recipeService.getRecipeByName(name);
        if (recipe != null) {
            return ResponseEntity.ok(recipe);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

   @PostMapping
    public RecipeEntity createRecipe(@RequestBody RecipeEntity recipe) {
        return recipeService.saveRecipe(recipe);
    }

   @DeleteMapping("/all")
    public void deleteAllRecipes() {
        recipeService.deleteAllRecipes();
    }
}
