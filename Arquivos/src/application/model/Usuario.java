package application.model;

import application.view.Alerta;

public class Usuario {

	private String nome;
	private String endereco;
	private String telefone;
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void confirmarEntrada() {
		nome = ConfirmarEntrada.confirmarDado(nome, "Cadastro de Usu�rio", "Nome");
		endereco = ConfirmarEntrada.confirmarDado(endereco, "Cadastro de Usu�rio", "Endere�o");
		telefone = ConfirmarEntrada.confirmarDado(telefone, "Cadastro de Usu�rio", "Telefone");
		email = ConfirmarEntrada.confirmarDado(email, "Cadastro de Usu�rio", "E-mail");
	}

	public void salvarUsuario() {
		SalvarArquivo.salvarArquivo(
				"usuarios",
				nome,
				endereco,
				telefone,
				email);
		Alerta.mensagemPopUp("Cadastro de Usu�rio", "Cadastro realizado com sucesso!");
	}
	
	public void mostarUsuario() {
		System.out.println("Nome: " + nome);
		System.out.println("Endere�o: " + endereco);
		System.out.println("Telefone: " + telefone);
		System.out.println("E-mail: " + email);
	}
}
