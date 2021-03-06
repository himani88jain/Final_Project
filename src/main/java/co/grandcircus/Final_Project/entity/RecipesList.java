package co.grandcircus.Final_Project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class RecipesList {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Double calories;
	private String carbs;
	private String fat;
	private String image;
	private String protein;
	private String title;

	private String recipeUrl;

	@OneToOne
	private Recipe recipe;

	@ManyToOne
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Double getCalories() {
		return calories;
	}

	public void setCalories(Double calories) {
		this.calories = calories;
	}

	public String getCarbs() {
		return carbs;
	}

	public String getRecipeUrl() {
		return recipeUrl;
	}

	public void setRecipeUrl(String recipeUrl) {
		this.recipeUrl = recipeUrl;
	}

	public void setCarbs(String carbs) {
		this.carbs = carbs;
	}

	public String getFat() {
		return fat;
	}

	public void setFat(String fat) {
		this.fat = fat;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getProtein() {
		return protein;
	}

	public void setProtein(String protein) {
		this.protein = protein;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	@Override
	public String toString() {
		return "RecipesList [id=" + id + ", calories=" + calories + ", carbs=" + carbs + ", fat=" + fat + ", image="
				+ image + ", protein=" + protein + ", title=" + title + ", recipeUrl=" + recipeUrl + ", recipe="
				+ recipe + "]";
	}


}
