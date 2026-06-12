
public class ProdutoFisico extends Produto{
	
	private double peso;
	
	public ProdutoFisico(int id, String nome, double precoBase, double peso) {
		super(id, nome, precoBase);
		this.peso = peso;
	}
	
	@Override
	public double calcularPrecoFinal() {
		return super.getPrecoBase() + (peso * 5.00);
	}

}
