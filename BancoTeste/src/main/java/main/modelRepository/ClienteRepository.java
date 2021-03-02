package main.modelRepository;

import main.model.Cliente;

public class ClienteRepository extends Conexao {
	// o objeto de trabalho da classe repository
	
	private Cliente cliente;
	
	public ClienteRepository() {
		
	}
	
	public ClienteRepository (Cliente cliente) {
		this.cliente = cliente;
		super.abreConexao();
	}
	
	public Boolean verificandoEntidade () {
		if (cliente != null)
			return true;
		return false;
	}
}
