package application;

public class Vegan extends Food{
    /**
     * extends Food class and stores the data of Vegan foods from food data
     */
    Vegan(){
        this.foodNutrients = FoodData.Vegan;
    }
    @Override
    int[] calculateCalories(Breakfast breakfast, Lunch lunch,Dinner dinner) {
        Nutrients breakfastNutrient = this.foodNutrients.get(breakfast.mealName);
        Nutrients lunchNutrient = this.foodNutrients.get(lunch.mealName);
        Nutrients dinnerNutrient = this.foodNutrients.get(dinner.mealName);
        int totalCalories = breakfastNutrient.totalCalories+
                lunchNutrient.totalCalories+dinnerNutrient.totalCalories;
        int totalProteins = breakfastNutrient.proteins+
                lunchNutrient.proteins+dinnerNutrient.proteins;
        int totalCarbs = breakfastNutrient.carbohydrates+
                lunchNutrient.carbohydrates+dinnerNutrient.carbohydrates;
        int totalFats = breakfastNutrient.fats+
                lunchNutrient.fats+dinnerNutrient.fats;
        return new int[]{totalCalories,totalProteins,totalCarbs,totalFats};
    }
}
