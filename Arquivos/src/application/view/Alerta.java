package application.view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Alerta {

	public static void mensagemPopUp(String titulo, String mensagem) {

		Stage popUp = new Stage();
		Label txtMensagem = new Label();
		Button btOk = new Button("Ok");
		VBox layout = new VBox();

		popUp.initModality(Modality.APPLICATION_MODAL);
		popUp.setTitle(titulo);
		popUp.setMinWidth(300);
		popUp.setMinHeight(100);

		txtMensagem.setText(mensagem);

		btOk.setOnAction(e -> popUp.close());

		layout.getChildren().addAll(txtMensagem, btOk);
		layout.setAlignment(Pos.CENTER);

		Scene scene = new Scene(layout);
		popUp.setScene(scene);
		popUp.showAndWait();

	}

}
