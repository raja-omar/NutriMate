package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;

public class Info_FormController {

	@FXML
	public TextField currentweightTextField;

	@FXML
	private TextField weightToChange;

	@FXML
	private ChoiceBox<String> weightChange;

	@FXML
	private ChoiceBox<String> genderChoiceBox;

	@FXML
	private ChoiceBox<String> weeklyWeightChange;

	@FXML
	private TextField heightTextField;

	@FXML
	private Label sceneThreeErrorLabel;

	@FXML
	private ChoiceBox<String> activityLevelChoiceBox;

	@FXML
	private TextField ageTextField;
	@FXML
	private double bmiValue;

	private Stage stage;
	private Scene scene;
	private Parent root;

	/*
	 * Method Name: switchToScene4
	 * Inputs: event
	 * Functionality: makes it so that after the user inputs from one window it
	 * switches to the other
	 * and sets the error message to the corresponding field. It also sets the user
	 * inputs to the
	 * person class.
	 */
	public void switchToScene4(ActionEvent event) throws IOException {
		// Code used for switching scenes:
		// Date accessed Jul 28, 2022
		// https://www.youtube.com/watch?v=hcM-R-YOKkQ
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Initial_Result.fxml"));
		root = loader.load();
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		sceneThreeErrorLabel.setTextFill(Color.color(1, 0, 0));

		ErrorMessage error = new ErrorMessage(genderChoiceBox.getValue(), ageTextField.getText(),
				heightTextField.getText(), currentweightTextField.getText(), weightToChange.getText(),
				activityLevelChoiceBox.getValue(), weeklyWeightChange.getValue(), weightChange.getValue());

		sceneThreeErrorLabel.setText(error.getErrorText());

		if (error.isChangeScene()) {

			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();

			Person user = new Person(genderChoiceBox.getValue(), Integer.parseInt(ageTextField.getText()),
					Integer.parseInt(heightTextField.getText()), Integer.parseInt(currentweightTextField.getText()),
					Double.parseDouble(weeklyWeightChange.getValue()), weightChange.getValue(),
					Integer.parseInt(weightToChange.getText()), activityLevelChoiceBox.getValue(), bmiValue);
			Exercise_InfoController.weight = Integer.parseInt(currentweightTextField.getText());
			// Code used for switching controller:
			// https://www.youtube.com/watch?v=wxhGKR3PQpo
			// Date accessed: August 3rd, 2022
			Initial_ResultController s4c = loader.getController();
			setLabelText(user, s4c);

		}
	}

	/*
	 * sets the labeltext for the obesity ,bmi, dailyintake, and daysneeded to the
	 * users.
	 * 
	 */
	void setLabelText(Person theUser, Initial_ResultController s4c) {

		Person usersBmi = new Person(genderChoiceBox.getValue(), Integer.parseInt(ageTextField.getText()),
				Integer.parseInt(heightTextField.getText()), Integer.parseInt(currentweightTextField.getText()),
				Double.parseDouble(weeklyWeightChange.getValue()), weightChange.getValue(),
				Integer.parseInt(weightToChange.getText()), activityLevelChoiceBox.getValue(), bmiValue);

		s4c.bmiLabelNew.setText(String.format("%.1f", usersBmi.getBmiValue()));
		s4c.obesityLabelNew.setText(usersBmi.obesityLabelText(usersBmi.getBmiValue()));

		s4c.bmrLabelNew.setText(theUser.getBmr() + "");

		s4c.targetStuff.setText(theUser.getDailyIntake() + "");
		Exercise_InfoController.recommendedIntake = theUser.getDailyIntake();

		s4c.requiredDays.setText(theUser.getDaysNeeded() + "");

	}
}
