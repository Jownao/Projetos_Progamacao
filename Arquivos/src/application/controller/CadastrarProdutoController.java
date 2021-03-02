package application.controller;

import application.Main;
import application.model.Produto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CadastrarProdutoController {

	@FXML private TextField txtNome;

	@FXML private TextField txtCodigo;

	@FXML private TextField txtQuantidade;

	@FXML private TextField txtPreco;

	private Produto produto = new Produto();

	@FXML void btCadastrar(ActionEvent event) {
		produto.setNome(this.txtNome.getText());
		produto.setCodigo(this.txtCodigo.getText());
		produto.setQuantidade(this.txtQuantidade.getText());
		produto.setPreco(this.txtPreco.getText());
		
		produto.confirmarEntrada();
		produto.salvarProduto();
		produto.mostrarProduto();

		txtNome.setText("");
		txtCodigo.setText("");
		txtQuantidade.setText("");
		txtPreco.setText("");
	}

	@FXML void btVoltar(ActionEvent event) {
		Main.mudarTela("main");
	}
}
