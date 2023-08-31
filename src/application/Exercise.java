package application;
/**
 * Exercise Class
 * Instance Variables: typeOfExercise and caloriesBurnt
 * Overall Description of the class: In this class we calculate the calories burnt based 
 * on the user choice. 
 */
public class Exercise {
	private String typeOfExercise;
	private int caloriesBurnt = 0;
	/*Method Name: Exercise 
	*Inputs: excerciseType, timeSpent,weight
	*Functionality: takes in the correct exercise type and sets our instance variable to it 
	*and then sets the exercise type to the setter for Caloriesburnt  
	*Outputs/Sets: It then sets the parameters for the next following method setCaloriesBurnt
	*/
	public Exercise(String exerciseType, int timeSpent, int weight) {
		typeOfExercise = exerciseType;
		setCaloriesBurnt(exerciseType, timeSpent, weight);
	}
	/*Method Name: setCaloriesBurnt (Setter)
	*Inputs: typeOfExercise,timeSpent,weightOfUser
	*Functionality: Calculates the calories burnt based on the type of excerise they have chosen.
	*Formula has been gotten from here:
	*Accessed By:
	*Outputs/Sets: sets the caloriesburnt to the instance variable. 
	*/
	void setCaloriesBurnt(String typeOfExericse, int timeSpent, int weightOfUser) {
		// (3.5 times the metabolic equivalent or MET multiplied by your body weight in
		// kilograms)/200.
		
		String option1="Running";
		String option2="Boxing";
		String option3="Leisure bicycling";
		String option4="Swimming";
		String option5="Vigorous weight lifting";
		//
		if (typeOfExercise.equals(option1)) {
			this.caloriesBurnt = (int) (timeSpent * (3.5) * (11.5) * (weightOfUser) / 200);
		}
		if (typeOfExercise.equals(option2)) {
			this.caloriesBurnt = (int) (timeSpent * (3.5) * (9.5) * (weightOfUser) / 200);
		}
		if (typeOfExercise.equals(option3)) {
			this.caloriesBurnt = (int) (timeSpent * (3.5) * (3.5) * (weightOfUser) / 200);
		}
		if (typeOfExercise.equals(option4)) {
			this.caloriesBurnt = (int) (timeSpent * (3.5) * (6) * (weightOfUser) / 200);
		}
		if (typeOfExercise.equals(option5)) {
			this.caloriesBurnt = (int) (timeSpent * (3.5) * (6.5) * (weightOfUser) / 200);
		}

	}
	/* Getter for CaloriesBurnt
	 */
	int getCaloriesBurnt() {
		return this.caloriesBurnt;
	}

}
