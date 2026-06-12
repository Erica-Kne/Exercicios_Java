
public class ProdutoDigital extends Produto {
	
	private String linkDownload;
	private double tamanhoMB;
	
	public ProdutoDigital(int id, String nome, double precoBase, String linkDownload, double tamanhoMB) {
		super(id, nome, precoBase);
		this.linkDownload = linkDownload;
		this.tamanhoMB = tamanhoMB;
	}
	
	@Override
	public double calcularPrecoFinal() {
		return super.getPrecoBase();
	}
}
