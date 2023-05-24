
public class Hawaiian extends Pizza{
	
	
	
	
	public void display() {
		this.setPizzaName("Hawaiian Pizza");
		this.setPizzaDescription("Salty,sweet, cheesy and undeniably delicious");
		this.setPizzaPrice(180);
		this.setPizzaIngredients("Pizza Sauce, Cheese, Cooked Ham, Pineapple.");
		this.setPizzaDiscount(2);
		
		this.display(this.getPizzaName(), this.getPizzaDescription(), this.getPizzaPrice(),
				this.getPizzaIngredients(), this.getPizzaDiscount());

	}
}
