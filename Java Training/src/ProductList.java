import java.util.ArrayList;
import java.util.List;

public class ProductList {
	private List<Product> products;
	
	public ProductList() {
		products = new ArrayList<>();
		
		products.add(new Product("Apple",20.0,.02));
		products.add(new Product("Orange",50.0,.01));
		products.add(new Product("Avocado",60.0,.02));
		products.add(new Product("Melon",70.0,.03));
		products.add(new Product("Lemon",80.0,.02));
		products.add(new Product("Kiwi",80.0,.01));
		products.add(new Product("Banana",90.0,.02));
		products.add(new Product("Juice",150.0,.05));
		products.add(new Product("Coffee",250.0,.02));
		products.add(new Product("Shirt",350.0,.03));
	}
	
	public void displayProduct() {
		System.out.println("List of Products");
		String format = "%-2s %-10s %-5s %-5s%n";
		System.out.printf(format, "","Product","Price","Discount");
		int productID = 1;
		for (Product product:products) {
			System.out.printf(format,productID, product.getName(),product.getPrice(),String.valueOf(product.getDiscount()*100)+"%" );
			productID++;
		}
	}
	
	public Product getProduct(int productID) {
		if (productID >=1 && productID<= products.size()) {
			return products.get(productID-1);
		}
		return null;
	}

}
