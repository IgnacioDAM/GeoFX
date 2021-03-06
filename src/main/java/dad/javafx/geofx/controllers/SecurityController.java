package dad.javafx.geofx.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class SecurityController implements Initializable {

	// view
	@FXML
	private GridPane view;

	@FXML
	private TextField txtIp;

	@FXML
	private Button btnIP;

	@FXML
	private CheckBox proxyCheck;

	@FXML
	private CheckBox torCheck;

	@FXML
	private TextField txtNivelHilo;

	@FXML
	private CheckBox crawlerCheck;

	@FXML
	private TextField txtTiposHilosPosibles;
	
	public SecurityController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/SecurityView.fxml"));
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
