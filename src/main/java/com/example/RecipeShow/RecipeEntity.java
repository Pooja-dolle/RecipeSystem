package com.example.RecipeShow;
import jakarta.persistence.*;

	@Entity
	public class RecipeEntity{

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;
	    private String ingredients;
	    private String instruction;


	    public Long getId() { return id; }
	    public void setId(Long id) { this.id = id; }

	    public String getName() { return name; }
	    public void setName(String name) { this.name = name; }

	    public String getIngredients() { return ingredients; }
	    public void setIngredients(String ingredients) { this.ingredients = ingredients; }

	    public String getInstruction() { return instruction; }
	    public void setInstruction(String instruction) { this.instruction = instruction;}
	    }

	



