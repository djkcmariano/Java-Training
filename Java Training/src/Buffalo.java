
public class Buffalo extends Pizza{
	public void display() {
		this.setPizzaName("Buffalo Pizza");
		this.setPizzaDescription("Slim and non existent crust coast line with ingredients.");
		this.setPizzaPrice(220);
		this.setPizzaIngredients("Pizza Sauce, Chiken, Buffalo Sauce, Provolone, Blue Cheese.");
		this.setPizzaDiscount(1);
		
		this.display(this.getPizzaName(), this.getPizzaDescription(), this.getPizzaPrice(),
				this.getPizzaIngredients(), this.getPizzaDiscount());
	}

}
