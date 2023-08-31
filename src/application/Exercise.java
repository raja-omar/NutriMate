package application;

public class Exercise {
    private String typeOfExercise;
    private int caloriesBurnt;

    public Exercise(String exerciseType, int timeSpent, int weight) {
        this.typeOfExercise = exerciseType;
        this.caloriesBurnt = calculateCaloriesBurnt(exerciseType, timeSpent, weight);
    }

    private int calculateCaloriesBurnt(String exerciseType, int timeSpent, int weightOfUser) {
        double metMultiplier = 0;

        switch (exerciseType) {
            case "Running":
                metMultiplier = 11.5;
                break;
            case "Boxing":
                metMultiplier = 9.5;
                break;
            case "Leisure bicycling":
                metMultiplier = 3.5;
                break;
            case "Swimming":
                metMultiplier = 6;
                break;
            case "Vigorous weight lifting":
                metMultiplier = 6.5;
                break;
            default:
                break;
        }

        return (int) (timeSpent * 3.5 * metMultiplier * weightOfUser / 200);
    }

    public int getCaloriesBurnt() {
        return caloriesBurnt;
    }
}
