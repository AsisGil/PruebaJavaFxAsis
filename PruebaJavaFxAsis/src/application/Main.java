package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

import java.awt.Button;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;

/**
 * 
 * A <b>JavaFX</b> prueba de scene builder
 * @author Asis
 * @version 2.0
 * @see controlador
 */
public class Main extends Application {
	
	
	
		private AnchorPane rootLayout;
		/**
		 * my Stage is public
		 */
		public Stage primaryStage;
 
		/**
		 * sets the stage
		 */
		@Override
		public void start(Stage primaryStage) {
			try {

				this.primaryStage = primaryStage;
				this.primaryStage.setTitle("Profile");
				this.primaryStage.setX(200);
				this.primaryStage.setY(200);
				primaryStage.show();
				initRootLayout();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		/**
		 * loads the layout
		 */
		
		
         
       
		public void initRootLayout() {
			try {
 				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(Main.class.getResource("vista/Profile.fxml"));
				rootLayout = (AnchorPane) loader.load();

 				Scene scene = new Scene(rootLayout, 640, 480);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());


 				scene.getStylesheets().add("https://fonts.googleapis.com/css?family=HipsterishFontNormal");
				Font.loadFont(getClass().getResourceAsStream("../resources/HipsterishFontNormal.ttf"), 20);

				primaryStage.setScene(scene);

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		/**
		 * @param args
		 *            launching
		 */
		
		
		public static void main(String[] args) {
			launch(args);
		}
	}

	

