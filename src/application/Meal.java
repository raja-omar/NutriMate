package application;

public abstract class Meal {
    /**
     * Abstract class for Breakfast,Lunch and Dinner
     */
    abstract String getMealName();
    abstract void setMealName(String meal_name);
    abstract int getCalories();
    abstract void setCalories(int calories);
}
