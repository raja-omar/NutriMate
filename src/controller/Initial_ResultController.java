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

public class Initial_ResultController {

	@FXML
	public Label obesityLabelNew;

	@FXML
	public Label requiredDays;

	@FXML
	public Label targetStuff;

	@FXML
	public ChoiceBox<String> dietType;

	@FXML
	public Label sceneFourErrorLabel;

	@FXML
	public Label bmrLabelNew;

	@FXML
	public Label bmiLabelNew;

	private Stage stage;
	private Scene scene;
	private Parent root;

	@FXML
	/*
	 * Method Name: switchToScene5 Inputs: event Functionality: makes it so that
	 * after the user inputs from one window it switches to the other and gives out
	 * the correct error message
	 */
	public void switchToScene5(ActionEvent event) throws IOException {
		// Code used for switching scenes:
		// Date accessed Jul 28, 2022
		// https://www.youtube.com/watch?v=hcM-R-YOKkQ
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Food_Selection.fxml"));
		root = loader.load();
		// Code used for switching controller:
		// https://www.youtube.com/watch?v=wxhGKR3PQpo
		// Date accessed: August 3rd, 2022
		Food_SelectionController s5c = loader.getController();

		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		if (dietType.getValue() != null) {
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			addFoodOptions(s5c);
		} else {

			sceneFourErrorLabel.setText("Please pick a diet type to proceed.");
		}
	}

	/*
	 * Method Name: addFoodOptions Inputs: s5c Functionality: sets the choicebox of
	 * the breakfast,lunch and dinners to the user and adds all the correct food
	 * choices
	 */
	void addFoodOptions(Food_SelectionController s5c) {
		FoodOptions.setValues(dietType.getValue());
		if (dietType.getValue().equals("Regular")) {
			Exercise_InfoController.food = new Regular();
		} else if (dietType.getValue().equals("Vegetarian")) {
			Exercise_InfoController.food = new Vegetarian();
		} else if (dietType.getValue().equals("Vegan")) {
			Exercise_InfoController.food = new Vegan();
		}

		s5c.breakfastChoicebox.getItems().addAll(FoodOptions.breakfast1, FoodOptions.breakfast2,
				FoodOptions.breakfast3);
		s5c.lunchChoicebox.getItems().addAll(FoodOptions.lunch1, FoodOptions.lunch2, FoodOptions.lunch3);
		s5c.dinnerChoicebox.getItems().addAll(FoodOptions.dinner1, FoodOptions.dinner2, FoodOptions.dinner3);
	}
}