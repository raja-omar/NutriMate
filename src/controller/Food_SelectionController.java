package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;

public class Food_SelectionController {

	@FXML
	private Label sceneFiveErrorLabel;

	@FXML
	public ChoiceBox<String> breakfastChoicebox;

	@FXML
	public ChoiceBox<String> lunchChoicebox;

	@FXML
	public ChoiceBox<String> dinnerChoicebox;

	@FXML
	/*
	 * Method Name: switchToScene6
	 * Inputs: event
	 * Functionality: makes it so that after the user inputs from one window it
	 * switches to the other
	 * and gives out the correct error message
	 */
	public void switchToScene6(ActionEvent event) throws IOException {
		// Code used for switching scenes:
		// Date accessed Jul 28, 2022
		// https://www.youtube.com/watch?v=hcM-R-YOKkQ
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Exercise_Info.fxml"));
		Parent root = loader.load();
		Stage stage;
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

		if (breakfastChoicebox.getValue() != null && lunchChoicebox.getValue() != null
				&& dinnerChoicebox.getValue() != null) {
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			// Code used for switching controller:
			// https://www.youtube.com/watch?v=wxhGKR3PQpo
			// Date accessed: August 3rd, 2022
			Exercise_InfoController.breakfast.setMealName(breakfastChoicebox.getValue());
			Exercise_InfoController.lunch.setMealName(lunchChoicebox.getValue());
			Exercise_InfoController.dinner.setMealName(dinnerChoicebox.getValue());
		} else {
			sceneFiveErrorLabel.setText("Please pick a diet type to proceed.");
		}

	}
}
