package application;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class controlador {

	public void github() throws IOException, URISyntaxException{
		Desktop.getDesktop().browse(new URI("https://github.com/AsisGil/PruebaJavaFxAsis.git"));

	}
	public void closeStage() {
		System.exit(0);
	}

	public void sendStage() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("vista/Send.fxml"));
			AnchorPane page = (AnchorPane) loader.load();
			Stage sendStage = new Stage();
			sendStage.setTitle("Send");
			Scene scene = new Scene(page);
			sendStage.setScene(scene);

			sendStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
