package application.model;

import application.view.Alerta;

public class Produto {

	private String codigo;
	private String nome;
	private String quantidade;
	private String preco;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}
	
	public void confirmarEntrada() {
		nome = ConfirmarEntrada.confirmarDado(nome, "Cadastro de Produto", "Nome");
		codigo = ConfirmarEntrada.confirmarDado(codigo, "Cadastro de Produto", "Código");
		quantidade = ConfirmarEntrada.confirmarDado(quantidade, "Cadastro de Produto", "Quantidade");
		preco = ConfirmarEntrada.confirmarDado(preco, "Cadastro de Produto", "Preço");
	}

	public void salvarProduto() {
		SalvarArquivo.salvarArquivo(
				"produtos",
				nome,
				codigo,
				quantidade,
				preco);
		Alerta.mensagemPopUp("Cadastro de Produto", "Cadastro realizado com sucesso!");
	}
	
	public void mostrarProduto() {
		System.out.println("Nome: " + nome);
		System.out.println("código: " + codigo);
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Preço: " + preco);
	}
}
