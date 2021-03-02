package application.controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {
    @FXML
    private Label labelResultado;

    @FXML
    private TextField labelEmail;

    @FXML
    private TextField labelSenha;

    @FXML
    void cadMatAction(ActionEvent event) {
    	if (this.labelEmail.getText().equals(email) && (this.labelSenha.getText().equals(senha))) {
    		Main.changeScreen("cadastroMaterial");
    }else {
    	System.out.println("Não está logado!");
    	this.labelResultado.setText("Login necessário!");
    }

    }

    @FXML
    void cadProdutoAction(ActionEvent event) {
    	if (this.labelEmail.getText().equals(email) && (this.labelSenha.getText().equals(senha))) {
    		Main.changeScreen("cadastroProduto");
    		
    }else {
    	System.out.println("Não está logado!");
    	this.labelResultado.setText("Login necessário!");
    }
 }	
    
    String email = "?";
	String senha = "?";
    @FXML
    void loginAction(ActionEvent event) {
    	if ((this.labelEmail.getText().equals("johnny")) && (this.labelSenha.getText().equals("123"))) {
    		System.out.println("Logado com sucesso!\n");
    		this.labelResultado.setText("Logado com sucesso!");
    		email = "johnny";
    		senha = "123";
		} else if (!this.labelEmail.getText().equals("johnny")){
			System.out.println("Email incorreto!\n");
			this.labelResultado.setText("Email incorreto!");
		} else if (!this.labelSenha.getText().equals("123")){
			System.out.println("Senha incorreta!\n");
			this.labelResultado.setText("Senha incorreta!");
		} else {
			System.out.println("Email e senha incorretos!\n");
		}
    	
    }
	public TextField getLabelEmail() {
		return labelEmail;
	}

	public void setLabelEmail(TextField labelEmail) {
		this.labelEmail = labelEmail;
	}

	public TextField getLabelSenha() {
		return labelSenha;
	}

	public void setLabelSenha(TextField labelSenha) {
		this.labelSenha = labelSenha;
	}

}
