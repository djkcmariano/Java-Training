
public class Pepperoni extends Pizza{
	public void display() {
		this.setPizzaName("Pepperoni Pizza");
		this.setPizzaDescription("Classic pizza option and one of the most well-loved pizza");
		this.setPizzaPrice(190);
		this.setPizzaIngredients("Pizza Sauce, Pepperoni, Mozzarella Cheese, Black Pepper.");
		this.setPizzaDiscount(3);
		
		this.display(this.getPizzaName(), this.getPizzaDescription(), this.getPizzaPrice(),
				this.getPizzaIngredients(), this.getPizzaDiscount());
	}

}
