package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;

public class IntroductionController {

	@FXML
	private Label validName;

	@FXML
	private TextField nameTextField;

	private Stage stage;
	private Scene scene;
	private Parent root;

	/*
	 * Method Name: switchToScene3
	 * Inputs: event
	 * Functionality: makes it so that after the user inputs from one window it
	 * switches to the other
	 * and takes the their name.
	 */
	public void switchToScene2(ActionEvent event) throws IOException {
		// Code used for switching scenes:
		// Date accessed Jul 28, 2022
		// https://www.youtube.com/watch?v=hcM-R-YOKkQ
		validName.setText("");
		String name = nameTextField.getText();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Welcome.fxml"));
		root = loader.load();

		// Code used for switching controller:
		// https://www.youtube.com/watch?v=wxhGKR3PQpo
		// Date accessed: August 3rd, 2022
		WelcomeController s2c = loader.getController();
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

		if (name != "" && name.matches("[a-zA-Z]+")) {
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			s2c.usersName.setText(name);
		} else {
			validName.setText("Please enter a valid name");
		}

	}
}
