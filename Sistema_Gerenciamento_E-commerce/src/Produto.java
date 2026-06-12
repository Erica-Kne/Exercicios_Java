 public abstract class Produto {
	 
	 private int id;
	 private String nome;
	 private double precoBase;
	 
	 public Produto(int id, String nome, double precoBase) {
		 this.id = id;
		 this.nome = nome;
		 this.precoBase = precoBase;
	 }
	 
	 public int getId() {
		 return id;
	 }
	 
	 public String getNome() {
		 return nome;
	 }
	 
	 public double getPrecoBase(){
		 return precoBase;
		 
	 }
	 
	 public double calcularPrecoFinal() {
		 return precoBase;
	 }

}
