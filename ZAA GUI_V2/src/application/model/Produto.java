package application.model;

public class Produto {
	
	private String laco;
	private String tamanho;
	private String quantidade;
	
	public String getLaco() {
		return laco;
	}

	public void setLaco(String laco) {
		this.laco = laco;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public void mostrarProduto() {
		System.out.println("Laço cadastrado:");
		System.out.println("Tipo de laço: "+this.laco);
		System.out.println("Tamanho: "+this.tamanho);
		System.out.println("Quantidade: " + this.quantidade);
	}
}
