package org.lessons.java.inheritance.shop;

public class Prodotto {
	private int codice;
    private String nome;
    private String marca;
    private double prezzo;
    private double iva;
    
    public Prodotto(int codice, String nome, String marca, double prezzo, double iva) {
    	this.codice = codice;
    	setNome(nome);
    	setMarca(marca);
    	setPrezzo(prezzo);
    	setIva(iva);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public int getCodice() {
		return codice;
	}
	
	public double getPrezzoBase() {
		return prezzo;
	}
	
	public String getPrezzoConIva() {
		return String.format("%.2f", prezzo + (prezzo*iva)/100);
	}
	
	@Override
    public String toString() {
        return "Codice: " + codice + ", Nome: " + nome + ", Marca: " + marca +
                ", Prezzo: " + prezzo + ", IVA: " + iva + "%";
    }
        
}


