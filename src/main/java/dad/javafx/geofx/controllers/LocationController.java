package dad.javafx.geofx.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class LocationController implements Initializable {

	// view
	@FXML
	private GridPane view;

	@FXML
	private TextField txtIp;

	@FXML
	private Button btnIP;

	@FXML
	private TextField txtLatitud;

	@FXML
	private TextField txtLongitud;

	@FXML
	private TextField txtCiudad;

	@FXML
	private TextField txtIdioma;

	@FXML
	private TextField txtNumeroPrefijo;

	@FXML
	private TextField txtMoneda;

	@FXML
	private TextField txtZonaHoraria;

	@FXML
	private TextField txtCodigoPostal;

	@FXML
	private TextField txtLocation;

	@FXML
	private ImageView imageBandera;

	public LocationController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/LocationView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

	public GridPane getView() {
		return view;
	}

}
