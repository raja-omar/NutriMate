package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;

public class WelcomeController {

	@FXML
	private Label introductionLabel;

	@FXML
	public Label usersName;

	private Stage stage;
	private Scene scene;
	private Parent root;

	// Code used for switching scenes:
	// Date accessed Jul 28, 2022
	// https://www.youtube.com/watch?v=hcM-R-YOKkQ
	/*
	 * Method Name: switchToScene3
	 * Inputs: event
	 * Functionality: makes it so that after the user inputs from one window it
	 * switches to the other
	 */
	public void switchToScene3(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Info_Form.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
