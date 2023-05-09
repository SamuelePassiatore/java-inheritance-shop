package org.lessons.java.inheritance.shop;

public class Smartphone extends Prodotto { 
	
	private int imei;
    private int memoria;
    
    public Smartphone(int codice, String nome, String marca, double prezzo, double iva, int imei, int memoria) {
    	super(codice, nome, marca, prezzo, iva);
    	setImei(imei);
    	setMemoria(memoria);
    }

	public int getImei() {
		return imei;
	}

	public void setImei(int imei) {
		this.imei = imei;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	 @Override
	    public String toString() {
	        return super.toString() + ", IMEI: " + imei + ", Memoria: " + memoria + "GB";
	    }
}
