package application.model;

import java.util.Optional;

import javafx.scene.control.TextInputDialog;

public class ConfirmarEntrada {
	
	static String entrada;
	
	public static String confirmarDado(
		String dado,
		String titulo,
		String campo) {
		
		if (dado.isEmpty()) {
			TextInputDialog dialog = new TextInputDialog();
			dialog.setTitle(titulo);
			dialog.setHeaderText("O campo "+campo+" não foi preenchido!");
			dialog.setContentText(campo+": ");
			
			Optional<String> result = dialog.showAndWait();
			if (result.isPresent()){
				entrada = result.get();
			}
		} else {
			entrada = dado;
		}
		if (entrada.isEmpty()) {
			confirmarDado(dado, titulo, campo);
		}
		return entrada;
	}
}
