
public class AllMeat  extends Pizza{
	public void display() {
		this.setPizzaName("All Meat Pizza");
		this.setPizzaDescription("Homemade thin crust pizza topped with lots of meat.");
		this.setPizzaPrice(180);
		this.setPizzaIngredients("Pizza Sauce, Cheese, Cooked Ham, Bacon, Pepperoni, Hot Sausage.");
		this.setPizzaDiscount(4);
		
		this.display(this.getPizzaName(), this.getPizzaDescription(), this.getPizzaPrice(),
				this.getPizzaIngredients(), this.getPizzaDiscount());
	}

}
