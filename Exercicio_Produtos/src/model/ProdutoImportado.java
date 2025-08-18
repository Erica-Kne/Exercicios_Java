package model;

public class ProdutoImportado extends Produto{
	
	private double taxa;

	public ProdutoImportado(String nome, double preco, double taxa) {
		super(nome, preco);
		this.taxa = taxa;
	}
	
	public double getTaxa() {
		return taxa;
	}
	
	@Override
	public String etiqueta() {
		return String.format("%s R$ %.2f (taxa: %.2f)", getNome(), getPreco(), taxa);
	}
	
	public double precoTotal() {
		return getPreco() + taxa;
	}
	
	
	

}
