package application.controller;

import application.Main;
import application.model.Material;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class materialController {
	
	private Material opcoesMat = new Material(); 

    @FXML private ComboBox<String> matCombo;
    ObservableList<String> material = FXCollections.observableArrayList("Fitas","Apliques","Presilhas","Tiaras");
    @FXML private ComboBox<String> medCombo;
    ObservableList<String> medida = FXCollections.observableArrayList("20 cm - P","50 cm - M","60 cm - G");
    @FXML private ComboBox<String> tamCombo;
    ObservableList<String> tamanho = FXCollections.observableArrayList("Fina","Média","Grossa");
    
    @FXML void cadButton(ActionEvent event) {
    	opcoesMat.setMaterial(this.matCombo.getSelectionModel().getSelectedItem());
    	opcoesMat.setMedida(this.medCombo.getSelectionModel().getSelectedItem());
    	opcoesMat.setTamanho(this.tamCombo.getSelectionModel().getSelectedItem());
    	opcoesMat.mostrarProduto();
    }

    @FXML void voltarButton(ActionEvent event) {
    	Main.changeScreen("main");
    }
    @FXML public void initialize() {
        matCombo.setItems(material);
        medCombo.setItems(medida);
        tamCombo.setItems(tamanho); 
    }
}
