import java.util.ArrayList;
public class CarrinhoDeCompras {
	
	private String nomeCliente;
	private ArrayList <ItemCarrinho> itens;
	
	public CarrinhoDeCompras(String nomeCliente) {
		this.nomeCliente = nomeCliente;
		itens = new ArrayList<>();
	}
	
	
	public void adicionarItem(Produto produto, int quantidade) {
		itens.add(new ItemCarrinho(produto, quantidade));
	}
	
	public double calcularTotalGeral() {
		double totalGeral = 0.0;
		for(ItemCarrinho item: itens) {
			totalGeral += item.calcularSubtotal();
		}
		return totalGeral;
	}
	
	public void exibirResumo() {
		
		System.out.println("=== RESUMO CARRINHO ===");
		System.out.println("Cliente: " + nomeCliente);
		System.out.println("========================");
		for(ItemCarrinho item: itens) {
			System.out.println("- " + item.getProduto().getNome() + " | Quantidade: " + item.getQuantidade() 
			+ " | Subtotal: R$ " + item.calcularSubtotal());
			}
		 System.out.println("--------------------------");
		 System.out.println("TOTAL GERAL A PAGAR: R$ " + calcularTotalGeral());
		}
}
