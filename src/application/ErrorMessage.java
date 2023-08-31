package application;

/**
 * Error Class
 * Instance Variables: errorText changeScene
 * Overall Description of the class: In this class we set the certain messages that happen if 
 * the user inputs the answer wrong or invalid and sets the instance variable changeScene to the correct 
 * value. 
 */
public class ErrorMessage {
	private String errorText;
	private boolean changeScene=false;
	/*Method Name: ErrorMessage
	*Inputs: string1 to string8
	*Functionality: Presents the user the correct error message when the user inputs a wrong input.
	*
	*Outputs/Sets: a error message
	*/
	public ErrorMessage(String string1, String string2, String string3, String string4, String string5, String string6,
			String string7, String string8) {
		String errorMessage = "";
		if (string1 != null) {
			// The following code to check if String is numeric was derived from the given
			// citation.
			// Date Accessed July 29th, 2022
			// https://stackoverflow.com/questions/1102891/how-to-check-if-a-string-is-numeric-in-java?noredirect=1&lq=1
			if (string2 != "" && (string2.chars().allMatch(Character::isDigit))) {
				int userAge = Integer.parseInt(string2);
				if (userAge > 9) {
					if (userAge < 80) {
						if (string3 != "" && string3.chars().allMatch(Character::isDigit)) {
							int userHeight = Integer.parseInt(string3);
							if (userHeight > 55 && userHeight < 270) {
								if (string4 != "" && (string4.chars().allMatch(Character::isDigit))) {
									int userWeight = Integer.parseInt(string4);
									if (userWeight > 25 && userWeight < 450) {
										if (string5 != "" && (string5.chars().allMatch(Character::isDigit))) {
											int loseWeight = Integer.parseInt(string5);
											if (loseWeight < 0.5 * userWeight) {
												if (string6 != null) {
													if (string7 != null) {
														if (string8 != null) {
															setErrorText(errorMessage);
															setChangeScene(true);
														} else {
															setErrorText(
																	"Please pick the correct weight change option (loss/gain)");
														}
													} else {
														setErrorText(
																"Please pick one of the weekly weight loss/gain options.");
													}
												} else {
													setErrorText("Please pick your daily activity level");
												}
											} else {
												setErrorText("You're attempting to lose a lot of bodyweight,"
														+ " please rethink your target weight");
											}
										} else {
											setErrorText("Please enter the amount of weight you'd like to gain/lose.");
										}
									} else {
										setErrorText("Please enter a valid weight.");
									}
								} else {
									setErrorText("Please enter a valid weight.");
								}
							} else {
								setErrorText("Please enter a valid height.");
							}
						} else {
							setErrorText("Please enter a valid height.");
						}
					} else {
						setErrorText("You're too old to go for weight gain/loss");
					}
				} else {
					setErrorText("You're too young to go for weight gain/loss.");
				}
			} else {
				setErrorText("Please enter your age.");
			}
		} else {
			setErrorText("Please pick your gender.");
		}

	}

	
	/* Getter and Setter for ErrorText  
	 * 
	 */
	public String getErrorText() {
		return errorText;
	}

	/**
	 * @param errorText the errorText to set
	 */
	public void setErrorText(String errorText) {
		this.errorText = errorText;
	}

	/**
	 * @return the changeScene
	 */
	public boolean isChangeScene() {
		return changeScene;
	}

	/*Method Name: setChangeScene
	*Inputs: changeScene
	*Functionality: boolean value tells us to change scene or not
	*
	*Outputs/Sets: sets the instance variable to the correct statement 
	*/
	public void setChangeScene(boolean changeScene) {
		this.changeScene = changeScene;
	}
}
