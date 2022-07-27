public class Inventory {
	
	void listProducts (Product[] products) {
		
		System.out.println("\n========== Estoque ===========");
		
		for (int i = 0; i < products.length; i++) {
			products[i].productInfo();
		}
		
		System.out.println("==============================");
	}
}
