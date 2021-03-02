package application.controller;

import application.Main;
import application.model.Produto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class produtoController {
    @FXML private TextField fieldQuant;
    @FXML private Label labelCadastrar;
    
    Produto produto = new Produto();
    
    //ComboBOX
    @FXML private ComboBox<String> la�oBox;
    ObservableList<String> la�o = FXCollections.observableArrayList("La�o","Arco","Faixinha","Hair Clip","Presilha");
    @FXML private ComboBox<String> tamanhoBox;
    ObservableList<String> tamanho = FXCollections.observableArrayList("PP","P","M","G");
    
    @FXML void cadButton(ActionEvent event) {
    	this.labelCadastrar.setText("La�o Cadastrado!");    	
    	produto.setLaco(this.la�oBox.getSelectionModel().getSelectedItem());
    	produto.setTamanho(this.tamanhoBox.getSelectionModel().getSelectedItem());
    	produto.setQuantidade(this.fieldQuant.getText());
    	produto.mostrarProduto();
	}
	@FXML void voltarButton(ActionEvent event) {
		Main.changeScreen("main");
    }
    @FXML public void initialize() {
        la�oBox.setItems(la�o);
        tamanhoBox.setItems(tamanho);
    }
}
