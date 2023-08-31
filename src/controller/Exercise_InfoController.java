package controller;

import java.io.IOException;

import application.Breakfast;
import application.Dinner;
import application.Food;
import application.Lunch;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;

public class Exercise_InfoController {

	@FXML
	private ChoiceBox<String> timeSpentExercising;

	@FXML
	private ChoiceBox<String> exerciseChoiceBox;

	@FXML
	private Label sceneSixErrorLabel;

	public static int weight;
	public static Food food;
	public static Breakfast breakfast = new Breakfast();
	public static Lunch lunch = new Lunch();
	public static Dinner dinner = new Dinner();
	public static int recommendedIntake;

	private Stage stage;
	private Scene scene;
	private Parent root;

	@FXML
	public void switchToScene7(ActionEvent event) throws IOException {
		// Code used for switching scenes:
		// Date accessed Jul 28, 2022
		// https://www.youtube.com/watch?v=hcM-R-YOKkQ
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Final_Result.fxml"));
		root = loader.load();

		Final_Result_Controller s7c = loader.getController();

		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		if (timeSpentExercising.getValue() != null && exerciseChoiceBox.getValue() != null) {
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			setCalorieLabels(s7c);
			setRecommendedMacrosLabels(s7c);
			setCurrentMacrosLabels(s7c);
		} else {
			sceneSixErrorLabel.setText("Please pick both of the options before pressing Next.");
		}
	}

	void setCalorieLabels(Final_Result_Controller s7c) {
		Exercise usersExercise = new Exercise(exerciseChoiceBox.getValue(),
				Integer.parseInt(timeSpentExercising.getValue()), weight);
		usersExercise.getCaloriesBurnt();

		int netCalories = food.calculateCalories(breakfast, lunch, dinner)[0] - usersExercise.getCaloriesBurnt();
		// Code used for switching controller:
		// https://www.youtube.com/watch?v=wxhGKR3PQpo
		// Date accessed: August 3rd, 2022
		s7c.netCaloricIntake.setText(netCalories + "");
		if (recommendedIntake < netCalories) {
			s7c.caloricDiff.setText("more");
			s7c.caloricDiff.setFont(Font.font("System", FontWeight.BOLD, 14));
		}
		if (recommendedIntake > netCalories) {
			s7c.caloricDiff.setText("less");
			s7c.caloricDiff.setFont(Font.font("System", FontWeight.BOLD, 14));
		} else
			s7c.caloricDiff.setText("equal");

	}

	void setCurrentMacrosLabels(Final_Result_Controller s7c) {

		s7c.dailyProtein.setText(String.format(food.calculateCalories(breakfast, lunch, dinner)[1] + " grams"));
		s7c.dailyCarbs.setText(String.format(food.calculateCalories(breakfast, lunch, dinner)[2] + " grams"));
		s7c.dailyFats.setText(String.format(food.calculateCalories(breakfast, lunch, dinner)[3] + " grams"));

	}

	void setRecommendedMacrosLabels(Final_Result_Controller s7c) {

		s7c.proteinLabel.setText(String.format("%.1f", (recommendedIntake * 0.4) / 4) + " grams");
		s7c.carbsLabel.setText(String.format("%.1f", (recommendedIntake * 0.3) / 4) + " grams");
		s7c.fatsLabel.setText(String.format("%.1f", (recommendedIntake * 0.4) / 9) + " grams");

	}

}
