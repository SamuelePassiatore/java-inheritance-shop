package org.lessons.java.inheritance.shop;

import java.util.Arrays;
import java.util.Scanner;

public class Catalogo {
	  public static void main(String[] args) {
		  	Prodotto[] catalogo = new Prodotto[100];
		  	int posizione = 0; 
	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.println("Inserire un prodotto:");
	            System.out.println("1. Smartphone");
	            System.out.println("2. Televisore");
	            System.out.println("3. Cuffie");
	            System.out.println("4. Esci");
	            System.out.println("Scelta: ");
	            int scelta = scanner.nextInt();
	            
	            if (scelta < 1 || scelta > 4) {
	                System.out.println("Scelta non valida, riprova.");
	                continue;
	            }
	            
	            if (scelta == 4) {
	            	System.out.println("Sei uscito correttamente");
	                break;
	            }
	            
	            System.out.println("Codice: ");
	            int codice = scanner.nextInt();
	            System.out.println("Nome: ");
	            String nome = scanner.next();
	            System.out.println("Marca: ");
	            String marca = scanner.next();
	            System.out.println("Prezzo: ");
	            double prezzo = scanner.nextDouble();
	            System.out.println("IVA: ");
	            double iva = scanner.nextDouble();
	            
	            switch (scelta) {
	                case 1:
	                    System.out.println("IMEI: ");
	                    int imei = scanner.nextInt();
	                    System.out.println("Memoria: ");
	                    int memoria = scanner.nextInt();
	                    catalogo[posizione] = new Smartphone(codice, nome, marca, prezzo, iva, imei, memoria);
	                    System.out.println("Nuovo telefono inserito:");
	                    break;
	                case 2:
	                    System.out.println("Dimensioni: ");
	                    double dimensioni = scanner.nextDouble();
	                    System.out.println("Smart: ");
	                    boolean smart = scanner.nextBoolean();
	                    catalogo[posizione] = new Televisore(codice, nome, marca, prezzo, iva, dimensioni, smart);
	                    System.out.println("Nuovo televisore inserito:");
	                    break;
	                case 3:
	                    System.out.println("Colore: ");
	                    String colore = scanner.next();
	                    System.out.println("Wireless: ");
	                    boolean wireless = scanner.nextBoolean();
	                    catalogo[posizione] = new Cuffia(codice, nome, marca, prezzo, iva, colore, wireless);
	                    posizione++;
	                    System.out.println("Nuova cuffia inserita:");
	                    break;
	            }
	            
	            posizione++;
	        }
	        
	        System.out.println("Catalogo:");
	        for (int i = 0; i < catalogo.length; i++) {
	            Prodotto prodotto = catalogo[i];
	            if (prodotto != null) {
	                System.out.println(prodotto);
	            }
	        }
			
			scanner.close();
	       
	    }
}
