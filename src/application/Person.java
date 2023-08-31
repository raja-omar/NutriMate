package application;

public class Person {
    private String gender;
    private int age;
    private int height;
    private int weight;
    private double weeklyWeightChange;
    private String gainOrLoss;
    private int amountOfWeightToChange;
    private String activityLevel;
    private int dailyIntake;
    private int bmr;
    private int daysNeeded;
    private double bmiValue;

    public Person(String gender, int age, int height, int weight, double weeklyWeightChange, String gainOrLoss,
                  int amountOfWeightToChange, String activityLevel, double bmiValue) {
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.weeklyWeightChange = weeklyWeightChange;
        this.gainOrLoss = gainOrLoss;
        this.amountOfWeightToChange = amountOfWeightToChange;
        this.activityLevel = activityLevel;

        calculateBMR();
        calculateDailyIntake();
        adjustDailyIntakeForWeightChange();
        calculateDaysNeededForWeightChange();
        calculateBMIValue();
    }

    public String getObesityLevel() {
        if (bmiValue < 18.5) {
            return "Underweight";
        } else if (bmiValue < 24.9) {
            return "Healthy weight";
        } else if (bmiValue < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    private void calculateBMR() {
        if ("male".equals(gender)) {
            bmr = (int) (88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age));
        } else if ("female".equals(gender)) {
            bmr = (int) (66.47 + (13.75 * weight) + (5.003 * height) - (6.755 * age));
        }
    }

    private void calculateDailyIntake() {
        double baseBMR = ("male".equals(gender)) ? bmr : bmr;

        double activityMultiplier;
        switch (activityLevel) {
            case "Sedentary":
                activityMultiplier = 1.2;
                break;
            case "Lightly Active":
                activityMultiplier = 1.375;
                break;
            case "Moderately Active":
                activityMultiplier = 1.55;
                break;
            case "Very Active":
                activityMultiplier = 1.725;
                break;
            case "Extremely Active":
                activityMultiplier = 1.9;
                break;
            default:
                activityMultiplier = 1.2;
        }

        dailyIntake = (int) (baseBMR * activityMultiplier);
    }

    private void adjustDailyIntakeForWeightChange() {
        int weightChange = (gainOrLoss.equals("gain")) ? 1 : -1;
        dailyIntake += weightChange * (int) (weeklyWeightChange * 250);
    }

    private void calculateDaysNeededForWeightChange() {
        daysNeeded = (int) (amountOfWeightToChange / weeklyWeightChange);
    }

    private void calculateBMIValue() {
        double heightInMeters = height / 100.0;
        bmiValue = weight / (heightInMeters * heightInMeters);
    }

    // Getters and setters
    // ...

    // You can also add other utility methods specific to the Person class here.
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