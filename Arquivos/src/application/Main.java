package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {

	private static Stage stage;

	private static Scene mainView;
	private static Scene cadastrarProdutoView;
	private static Scene cadastrarUsuarioView;

	@Override
	public void start(Stage primaryStage) {
		try {
			stage = primaryStage;

			primaryStage.setTitle("Exercicio 06");

			Parent fxmlMain = FXMLLoader.load(getClass().getResource("view/MainView.fxml"));
			mainView = new Scene(fxmlMain, 600, 400);

			Parent fxmlCadastroProduto = FXMLLoader.load(getClass().getResource("view/CadastrarProdutoView.fxml"));
			cadastrarProdutoView = new Scene(fxmlCadastroProduto, 400, 400);

			Parent fxmlCadastroUsuario = FXMLLoader.load(getClass().getResource("view/CadastrarUsuarioView.fxml"));
			cadastrarUsuarioView = new Scene(fxmlCadastroUsuario, 400, 400);

			primaryStage.setScene(mainView);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

	public static void mudarTela(String tela) {

		switch (tela) {
		case "main":
			stage.setScene(mainView);
			break;
		case "cadastrarProduto":
			stage.setScene(cadastrarProdutoView);
			break;
		case "cadastrarUsuario":
			stage.setScene(cadastrarUsuarioView);
			break;

		}
	}
}
