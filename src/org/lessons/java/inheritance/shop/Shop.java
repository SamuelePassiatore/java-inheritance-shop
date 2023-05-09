package org.lessons.java.inheritance.shop;

public class Shop {
	 public static void main(String[] args) {
		 Prodotto prodotto1 = new Prodotto(1, "Prodotto generico", "Marca generica", 100, 22);
		 System.out.println(prodotto1);
		 System.out.println("Prezzo base: " + prodotto1.getPrezzoBase());
		 System.out.println("Prezzo ivato: " + prodotto1.getPrezzoConIva());
		 
		 System.out.println("--------------------------------");
		 
		 Smartphone smartphone1 = new Smartphone(2, "Iphone 14", "Apple", 800, 22, 1234567890, 128);
		 System.out.println(smartphone1);
		 
		 System.out.println("--------------------------------");
		 
		 Televisore televisore1 = new Televisore(3, "Smart TV", "Samsung", 699, 22, 50, true);
	     System.out.println(televisore1);
	     
		 System.out.println("--------------------------------");
		 
		 Cuffia cuffia1 = new Cuffia(4, "Cuffie bluetooth", "Sony", 89, 22, "Nero", true);
	     System.out.println(cuffia1);
	 }
}
