package dad.javafx.geofx.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class ConnectionController implements Initializable {

	// view
	@FXML
	private GridPane view;

	@FXML
	private TextField txtIp;

	@FXML
	private Button btnIP;

	@FXML
	private TextField txtDireccionIP;

	@FXML
	private TextField txtTipo;

	@FXML
	private TextField txtNombreHost;

	@FXML
	private TextField txtASN;

	@FXML
	private TextField txtISP;
	
	public ConnectionController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ConnectionView.fxml"));
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
