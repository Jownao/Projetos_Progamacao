 package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	private static Stage stage;
	private static Scene loginScene;
	private static Scene produtoScene;
	private static Scene materialScene;

	
	@Override
	public void start(Stage primaryStage) throws Exception{
		try {
			stage = primaryStage;
			primaryStage.setTitle("Arte Acessórios");
			
			Parent fxmlLogin = FXMLLoader.load((getClass().getResource("view/main.fxml")));
	        loginScene = new Scene(fxmlLogin,500,400);
	        
	        Parent fxmlProduto = FXMLLoader.load((getClass().getResource("view/produtoFxml.fxml")));
	        produtoScene = new Scene(fxmlProduto,600,400);
	        
	        Parent fxmlMaterial = FXMLLoader.load((getClass().getResource("view/material.fxml")));
	        materialScene = new Scene(fxmlMaterial,600,400);
	        

	        primaryStage.setScene(loginScene);
	        primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void changeScreen(String tela) {
		switch (tela) {
		case "cadastroProduto":
			stage.setScene(produtoScene);
			break;
		case "cadastroMaterial":
			stage.setScene(materialScene);
			break;
		case "main":
			stage.setScene(loginScene);
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
