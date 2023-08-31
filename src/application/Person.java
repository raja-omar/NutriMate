package application;
/**
 * Person Class
 * Instance Variables: gender,age,height,weight,weeklyWeightChange,gainOrLoss
 * amountOfWeightToChange.personsActivityLevel,dailyIntake,bmr,daysNeeded,currentDailyIntake
 * Overall Description of the class: In this class we set all the person attributes and does all the calculation
 * like bmr,dailyIntake,daysNeeded
 */
public class Person {
	private String gender;
	private int age;
	private int height;
	private int weight;
	private double weeklyWeightChange;
	private String gainOrLoss;
	private int amountOfWeightToChange;
	private String personsActivityLevel;
	private int dailyIntake;
	private int bmr;
	private int daysNeeded;
	private int currentDailyIntake;
	private double bmiValue;



		/*Method Name: obesityLabelText
		*Inputs: bmival 
		*Functionality: gets the bmi value from above and calculates if the user obesity level  
		*Outputs/Sets: the obesity level they are in
		*/
		String obesityLabelText(double bmiVal) {
			String obesityLevel = "";
			if (bmiVal < 18.5) {

				obesityLevel = "Underweight";

			} else if (bmiVal > 18.5 && bmiVal < 24.9) {

				obesityLevel = "Healthy weight";
			} else if (bmiVal > 25.0 && bmiVal < 29.9) {

				obesityLevel = "Overweight";

			} else if (bmiVal > 30.0) {

				obesityLevel = "Obese";

			}
			return obesityLevel;
		}
	public Person(String gender, int age, int height, int weight, double weeklyWeightChange, String gainOrLoss,
		int amountOfWeightToChange, String personsActivityLevel, double bmiValue) {
		this.setGender(gender);
		this.setAge(age);
		this.setHeight(height);
		this.setWeight(weight);
		this.setWeeklyWeightChange(weeklyWeightChange);
		this.setGainOrLoss(gainOrLoss);
		this.setAmountOfWeightToChange(amountOfWeightToChange);
		this.setPersonsActivityLevel(personsActivityLevel);
		String option1 = "Sedentary (little to no exercise + work a desk job)";
		String option2 = "Lightly Active (light exercise 1-3 days / week)";
		String option3 = "Moderately Active (moderate exercise 3-5 days / week)";
		String option4 = "Very Active (heavy exercise 6-7 days / week)";
		String option5 = "Extremely Active (strenuous training 2x / day)";
		String male_selected = "male";
		String female_selected = "female";

		if (this.getGender().equals(male_selected)) {
			this.setBmr((int) (88.362 + (13.397 * this.getWeight()) + (4.799 * this.getHeight())
					- (5.677 * this.getAge())));
		}
		if (this.getGender().equals(female_selected)) {
			this.setBmr((int) (66.47 + (13.75 * this.getWeight()) + (5.003 * this.getHeight())
					- (6.755 * this.getAge())));
		}
		
		
		if (this.getGender().equals(male_selected) && this.personsActivityLevel.equals(option1)) {
			this.setCurrentDailyIntake((int) ((int) (1.2)
					* (88.362 + (13.397 * this.getWeight()) + (4.799 * this.getHeight()) - (5.677 * this.getAge()))));
		}
		if (this.getGender().equals(male_selected) && this.personsActivityLevel.equals(option2)) {
			this.setCurrentDailyIntake((int) ((int) (1.375)
					* (88.362 + (13.397 * this.getWeight()) + (4.799 * this.getHeight()) - (5.677 * this.getAge()))));
		}
		if (this.getGender().equals(male_selected) && this.personsActivityLevel.equals(option3)) {
			this.setCurrentDailyIntake((int) ((int) (1.55)
					* (88.362 + (13.397 * this.getWeight()) + (4.799 * this.getHeight()) - (5.677 * this.getAge()))));
		}
		if (this.getGender().equals(male_selected) && this.personsActivityLevel.equals(option4)) {
			this.setCurrentDailyIntake((int) ((int) (1.725)
					* (88.362 + (13.397 * this.getWeight()) + (4.799 * this.getHeight()) - (5.677 * this.getAge()))));
		}
		if (this.getGender().equals(male_selected) && this.personsActivityLevel.equals(option5)) {
			this.setCurrentDailyIntake((int) ((int) (1.9)
					* (88.362 + (13.397 * this.getWeight()) + (4.799 * this.getHeight()) - (5.677 * this.getAge()))));
		}

		
		
		if (this.getGender().equals(female_selected) && this.personsActivityLevel.equals(option1)) {
			this.setCurrentDailyIntake((int) ((int) (1.2) * 447.593 + (9.247 * this.getWeight())
					+ (3.098 * this.getHeight()) - (4.330 * this.getAge())));
		}
		if (this.getGender().equals(female_selected) && this.personsActivityLevel.equals(option2)) {
			this.setCurrentDailyIntake((int) ((int) (1.375) * 447.593 + (9.247 * this.getWeight())
					+ (3.098 * this.getHeight()) - (4.330 * this.getAge())));
		}
		if (this.getGender().equals(female_selected) && this.personsActivityLevel.equals(option3)) {
			this.setCurrentDailyIntake((int) ((int) (1.55) * 447.593 + (9.247 * this.getWeight())
					+ (3.098 * this.getHeight()) - (4.330 * this.getAge())));
		}
		if (this.getGender().equals(female_selected) && this.personsActivityLevel.equals(option4)) {
			this.setCurrentDailyIntake((int) ((int) (1.725) * 447.593 + (9.247 * this.getWeight())
					+ (3.098 * this.getHeight()) - (4.330 * this.getAge())));
		}
		if (this.getGender().equals(female_selected) && this.personsActivityLevel.equals(option5)) {
			this.setCurrentDailyIntake((int) ((int) (1.9) * 447.593 + (9.247 * this.getWeight())
					+ (3.098 * this.getHeight()) - (4.330 * this.getAge())));
		}

		String weightLoss = "lose";
		String weightGain = "gain";

		if (this.weeklyWeightChange == 0.25 && this.gainOrLoss.equals(weightLoss))
			this.dailyIntake = this.currentDailyIntake - 250;
		if (this.weeklyWeightChange == 0.5 && this.gainOrLoss.equals(weightLoss))
			this.dailyIntake = this.currentDailyIntake - 500;
		if (this.weeklyWeightChange == 1 && this.gainOrLoss.equals(weightLoss))
			this.dailyIntake = this.currentDailyIntake - 1000;


		if (this.weeklyWeightChange == 0.25 && this.gainOrLoss.equals(weightGain))
			this.dailyIntake = this.currentDailyIntake + 250;
		if (this.weeklyWeightChange == 0.5 && this.gainOrLoss.equals(weightGain))
			this.dailyIntake = this.currentDailyIntake + 500;
		if (this.weeklyWeightChange == 1 && this.gainOrLoss.equals(weightGain))
			this.dailyIntake = this.currentDailyIntake + 1000;

		this.daysNeeded = (int) (this.amountOfWeightToChange / this.weeklyWeightChange);

		double denom =  ((height+0.0) * (height+0.0)) / 10000.0;
		double numer = weight + 0.0;
		setBmiValue(numer / denom);

	}

	/* Getters/Setters of Age,Height,Weight,GainOrLoss,WeeklyWeightChange
	 * AmountOfWeightToChange,DaysNeeded,PersonsActivityLevel,DailyIntake
	 * ,Gender,Bmr,CurrentDailyIntake
	*/
	/**
	 * getter and setter
	 * gets the BMI value
	 * @return the bmiValue
	 */
	public double getBmiValue() {
		return bmiValue;
	}

	/**
	 * @param bmiValue the bmiValue to set
	 */
	public void setBmiValue(double bmiValue) {
		this.bmiValue = bmiValue;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setWeeklyWeightChange(double weeklyWeightChange) {
		this.weeklyWeightChange = weeklyWeightChange;
	}

	public void setGainOrLoss(String gainOrLoss) {
		this.gainOrLoss = gainOrLoss;
	}

	public void setAmountOfWeightToChange(int amountOfWeightToChange) {
		this.amountOfWeightToChange = amountOfWeightToChange;
	}

	public void setPersonsActivityLevel(String personsActivityLevel) {
		this.personsActivityLevel = personsActivityLevel;
	}

	public int getDailyIntake() {
		return dailyIntake;
	}

	public int getDaysNeeded() {
		return daysNeeded;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the bmr
	 */
	public int getBmr() {
		return bmr;
	}

	/**
	 * @param bmr the bmr to set
	 */
	public void setBmr(int bmr) {
		this.bmr = bmr;
	}

	/**
	 * @param currentDailyIntake the currentDailyIntake to set
	 */
	public void setCurrentDailyIntake(int currentDailyIntake) {
		this.currentDailyIntake = currentDailyIntake;
	}

	

}