package application;

public class Breakfast extends Meal {
    String mealName;
    int calories;

    @Override
    String getMealName() {
        return this.mealName;
    }

    @Override
    void setMealName(String meal_name) {
        this.mealName = meal_name;
    }

    @Override
    int getCalories() {
        return 0;
    }

    @Override
    void setCalories(int calories) {
       this.calories = calories;
    }
}
