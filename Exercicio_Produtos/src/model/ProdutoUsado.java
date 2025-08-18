package model;
import java.time.LocalDate;


public class ProdutoUsado extends Produto {
	
	private LocalDate dataFabricacao;
	String dataFormatada;
	
	public ProdutoUsado(String nome, double preco) {
		super(nome, preco);
		dataFabricacao = LocalDate.now();
		dataFormatada = dataFabricacao.toString(); 
	}
	
	public LocalDate getDataFabricacao() {
		return dataFabricacao;
		
	}
	
	@Override
	public String etiqueta() {
		return String.format("%s R$ %.2f (data de fabricacao %s)", getNome(), getPreco(), dataFormatada);
	}
}
