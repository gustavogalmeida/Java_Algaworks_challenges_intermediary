import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many products: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		Product[] products = new Product[n];
		
		for (int i=0;i < products.length; i++) {
			products[i] = new Product();
			System.out.print("Name: ");
			products[i].name = scanner.nextLine();
			System.out.print("Amount: ");
			products[i].amount = scanner.nextInt();
			scanner.nextLine();
		}
		
		Inventory inventory = new Inventory();
		inventory.listProducts(products);
	}
}
