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
				"C�digo",
				"Quantidade",
				"Pre�o");
	}

	@FXML void btCadastrarUsuario(ActionEvent event) {
		Main.mudarTela("cadastrarUsuario");
		SalvarArquivo.criarArquivo(
				"usuarios",
				"Nome",
				"Endere�o",
				"Telefone",
				"E-mail");
	}

}
