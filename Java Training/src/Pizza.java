public class Pizza {
	 private String pizzaName;
	 private String pizzaDescription ;
	 private double pizzaPrice;
	 private String pizzaIngredients;
	 private double pizzaDiscount;
	 
	



	public String getPizzaName() {
		return pizzaName;
	}



	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}



	public String getPizzaDescription() {
		return pizzaDescription;
	}



	public void setPizzaDescription(String pizzaDescription) {
		this.pizzaDescription = pizzaDescription;
	}



	public double getPizzaPrice() {
		return pizzaPrice;
	}



	public void setPizzaPrice(double pizzaPrice) {
		this.pizzaPrice = pizzaPrice;
	}



	public String getPizzaIngredients() {
		return pizzaIngredients;
	}



	public void setPizzaIngredients(String pizzaIngredients) {
		this.pizzaIngredients = pizzaIngredients;
	}



	public double getPizzaDiscount() {
		return pizzaDiscount;
	}



	public void setPizzaDiscount(double pizzaDiscount) {
		this.pizzaDiscount = pizzaDiscount;
	}



	public void display(String name,String description,double price,String ingredients,double discount) {
		System.out.println("Name of Pizza : " + name);
 		System.out.println("Description : " + description);
 		System.out.println("Price : P" + price);
 		System.out.println("Ingredients : " + ingredients);
 		System.out.println("Discount : " + discount+"%");
 		System.out.println("==================================================");
	}
}
