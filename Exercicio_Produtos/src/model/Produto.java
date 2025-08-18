package model;

public class Produto {
	
	private String nome;
	private double preco;
	
	public Produto ( String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public String etiqueta() {
		
		return String.format("%s + R$ %.2f", nome, preco);
	}

}
