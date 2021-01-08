package dad.javafx.geofx;

import dad.javafx.geofx.controllers.MainController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {
	
	private MainController controller;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		controller = new MainController();
		
		Scene escena = new Scene(controller.getView());
		
		primaryStage.setScene(escena);
		primaryStage.setTitle("GeoFX");
		primaryStage.getIcons().add(new Image("/images/64x42/ES.png"));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
