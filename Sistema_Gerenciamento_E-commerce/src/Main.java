
public class Main {

	public static void main(String[] args) {
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras("Érica");
		Produto produtoFisico = new ProdutoFisico(01, "Cadeira", 450.00, 10.00);
		Produto produtoDigital = new ProdutoDigital (05, "Curso de Programação", 150.00, "https://donwloadcurso.com", 5.0);
		
		carrinhoDeCompras.adicionarItem(produtoFisico, 2);
		carrinhoDeCompras.adicionarItem(produtoDigital, 1);
		
		
		carrinhoDeCompras.exibirResumo();
	
	}

}
