package application;

public class ErrorMessage {
    private String errorText;
    private boolean changeScene = false;

    public ErrorMessage(String gender, String ageStr, String heightStr, String weightStr,
                        String weeklyWeightChangeStr, String activityLevel, String gainOrLoss, String amountOfWeightStr) {
        if (gender == null) {
            setErrorText("Please pick your gender.");
            return;
        }

        if (!isNumeric(ageStr)) {
            setErrorText("Please enter your age.");
            return;
        }

        int userAge = Integer.parseInt(ageStr);
        if (userAge <= 9) {
            setErrorText("You're too young to go for weight gain/loss.");
            return;
        } else if (userAge >= 80) {
            setErrorText("You're too old to go for weight gain/loss");
            return;
        }

        if (!isNumeric(heightStr)) {
            setErrorText("Please enter a valid height.");
            return;
        }

        int userHeight = Integer.parseInt(heightStr);
        if (userHeight <= 55 || userHeight >= 270) {
            setErrorText("Please enter a valid height.");
            return;
        }

        if (!isNumeric(weightStr)) {
            setErrorText("Please enter a valid weight.");
            return;
        }

        int userWeight = Integer.parseInt(weightStr);
        if (userWeight <= 25 || userWeight >= 450) {
            setErrorText("Please enter a valid weight.");
            return;
        }

        if (!isNumeric(weeklyWeightChangeStr)) {
            setErrorText("Please enter the amount of weight you'd like to gain/lose.");
            return;
        }

        int loseWeight = Integer.parseInt(weeklyWeightChangeStr);
        if (loseWeight >= 0.5 * userWeight) {
            setErrorText("You're attempting to lose a lot of bodyweight, please rethink your target weight");
            return;
        }

        if (activityLevel == null) {
            setErrorText("Please pick your daily activity level");
            return;
        }

        if (gainOrLoss == null) {
            setErrorText("Please pick the correct weight change option (loss/gain)");
            return;
        }

        if (amountOfWeightStr == null) {
            setErrorText("Please pick one of the weekly weight loss/gain options.");
            return;
        }

        setErrorText("All input data is valid.");
        setChangeScene(true);
    }

    private boolean isNumeric(String str) {
        return str != null && str.chars().allMatch(Character::isDigit);
    }

    public String getErrorText() {
        return errorText;
    }

    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }

    public boolean isChangeScene() {
        return changeScene;
    }

    public void setChangeScene(boolean changeScene) {
        this.changeScene = changeScene;
    }
}
