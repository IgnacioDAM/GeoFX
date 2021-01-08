package dad.javafx.geofx.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class MainController implements Initializable {
	
	//controllers
	private LocationController locationController = new LocationController();
	private ConnectionController connectionController = new ConnectionController();
	private SecurityController securityController = new SecurityController();
	
	//view
	@FXML
	private TabPane view;

	@FXML
	private Tab tabLocation;

	@FXML
	private Tab tabConnection;

	@FXML
	private Tab tabSecurity;

	public MainController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		tabLocation.setContent(locationController.getView());
		tabConnection.setContent(connectionController.getView());
		tabSecurity.setContent(securityController.getView());
		
	}

	public TabPane getView() {
		return view;
	}

}
