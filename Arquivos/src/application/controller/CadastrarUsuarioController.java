package application.controller;

import application.Main;
import application.model.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CadastrarUsuarioController {

	@FXML private TextField txtNome;

	@FXML private TextField txtEndereco;

	@FXML private TextField txtTelefone;

	@FXML private TextField txtEmail;

	private Usuario usuario = new Usuario();

	@FXML void btCadastrar(ActionEvent event) {
		usuario.setNome(this.txtNome.getText());
		usuario.setEndereco(this.txtEndereco.getText());
		usuario.setTelefone(this.txtTelefone.getText());
		usuario.setEmail(this.txtEmail.getText());
		
		usuario.confirmarEntrada();
		usuario.salvarUsuario();
		usuario.mostarUsuario();

		txtNome.setText("");
		txtEndereco.setText("");
		txtTelefone.setText("");
		txtEmail.setText("");
	}

	@FXML void btVoltar(ActionEvent event) {
		Main.mudarTela("main");
	}
}
