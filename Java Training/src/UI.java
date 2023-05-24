import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class UI {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ProductList list = new ProductList();

		List<Cart> cartItem = new ArrayList<>();
		
		int selectIndex;
		double total = 0.0;
		double amount;
		double priceDiscount;
		int cartID = 1;
		do {
			list.displayProduct();
			System.out.print("Select Product using number and 0 to checkout : ");
			selectIndex = scanner.nextInt();
			
			if (selectIndex >=1) {
				Product selectProduct = list.getProduct(selectIndex);
				if(selectProduct != null) {
					System.out.print("Enter Quantity : ");
					int quantity = scanner.nextInt();
					cartItem.add(new Cart(selectProduct,quantity));
				}else {
					System.out.println("Invalid selection!");
				}
			}
		}while (selectIndex !=0);
		
		if (cartItem.isEmpty()) {
			System.out.println("No products selected");
			scanner.close();
			return;
		}
		
		System.out.println("\n Shopping Cart");
		String format = "%-2s %-10s %-7s %-10s %-10s %-16s%n";
		System.out.printf(format,"","Product","Price","Discount","Quantity","Amount");
		
		for (Cart item:cartItem) {
			Product product = item.getProduct();
			int quantity = item.getQuantity();
			
			priceDiscount = (product.getPrice()*quantity)*product.getDiscount();
			amount = (product.getPrice()*quantity) - priceDiscount; 
			total += amount;
			

			System.out.printf(format,cartID,product.getName(),product.getPrice(),String.valueOf(product.getDiscount()*100)+"%",quantity,amount);
			cartID++;
		}
		System.out.printf(format,"","","","Total ","Amount",total);
		scanner.close();
		
	}
}
