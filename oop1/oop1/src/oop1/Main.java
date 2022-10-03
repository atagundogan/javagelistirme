package oop1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mesaj = "Vade Oranı";
		
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinası");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("kahve1.jpg");
		
		
		Product product2 = new Product();
		product2.setName("Delonghi Kahve Makinası");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("kahve2.jpg");
		
		Product product3 = new Product();
		product3.setName("Delonghi Kahve Makinası");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("kahve1.jpg");
		//get 
		//System.out.println(product1.name);
	
		
		Product[] products = {product1, product2, product3};		
		
		System.out.println("<ul>");
		for	(Product product : products)
		{ 
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		
		

	}

}
