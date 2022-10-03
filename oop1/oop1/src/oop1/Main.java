package oop1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mesaj = "Vade Oranı";
		
		Product product1 = new Product();
		
		//set value
		product1.name = "Delonghi Kahve Makinası";
		product1.unitPrice = 7500;
		product1.discount = 7;
		product1.unitsInStock = 3;
		product1.imageUrl = "kahve.jpg";
		
		//get 
		//System.out.println(product1.name);
		Product product2 = new Product();
		product2.name = "Smeg Kahve Makinası";
		product2.unitPrice = 6500;
		product2.discount = 8;
		product2.unitsInStock = 2;
		product2.imageUrl = "kahve2.jpg";
		
		
		Product product3 = new Product();
		product3.name = "Kitchen Aid Kahve Makinası";
		product3.unitPrice = 4500;
		product3.discount = 9;
		product3.unitsInStock = 4;
		product3.imageUrl = "kahve3.jpg";
		

	}

}
