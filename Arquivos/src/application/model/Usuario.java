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
		nome = ConfirmarEntrada.confirmarDado(nome, "Cadastro de Usuário", "Nome");
		endereco = ConfirmarEntrada.confirmarDado(endereco, "Cadastro de Usuário", "Endereço");
		telefone = ConfirmarEntrada.confirmarDado(telefone, "Cadastro de Usuário", "Telefone");
		email = ConfirmarEntrada.confirmarDado(email, "Cadastro de Usuário", "E-mail");
	}

	public void salvarUsuario() {
		SalvarArquivo.salvarArquivo(
				"usuarios",
				nome,
				endereco,
				telefone,
				email);
		Alerta.mensagemPopUp("Cadastro de Usuário", "Cadastro realizado com sucesso!");
	}
	
	public void mostarUsuario() {
		System.out.println("Nome: " + nome);
		System.out.println("Endereço: " + endereco);
		System.out.println("Telefone: " + telefone);
		System.out.println("E-mail: " + email);
	}
}
