package application.controller;

import application.Main;
import application.model.SalvarArquivo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainController {

	@FXML void btCadastrarProduto(ActionEvent event) {
		Main.mudarTela("cadastrarProduto");
		SalvarArquivo.criarArquivo(
				"produtos",
				"Nome",
				"Código",
				"Quantidade",
				"Preço");
	}

	@FXML void btCadastrarUsuario(ActionEvent event) {
		Main.mudarTela("cadastrarUsuario");
		SalvarArquivo.criarArquivo(
				"usuarios",
				"Nome",
				"Endereço",
				"Telefone",
				"E-mail");
	}

}
