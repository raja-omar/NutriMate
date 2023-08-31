package application;

import java.util.HashMap;

public class FoodData {
    /**
     * The data for the food and their nutrients are stored in this class.
     */
    public static HashMap<String,Nutrients> Regular;
    public static HashMap<String,Nutrients> Vegan;
    public static HashMap<String,Nutrients> Vegetarian;

    public static void init(){
        FoodData.Regular = new HashMap<>();
        FoodData.Vegan = new HashMap<>();
        FoodData.Vegetarian = new HashMap<>();
        FoodData.Regular.put("Omelet with mac and cheese",
                new Nutrients(651,12,1,15));
        FoodData.Regular.put("One bowl of cereal with 2 large bananas",
                new Nutrients(400,8,83,6));
        FoodData.Regular.put("2 eggs 2 bacon 2 toast",
                new Nutrients(740,27,85,31));
        FoodData.Regular.put("Beef Nachos",
                new Nutrients(651,21,20,25));
        FoodData.Regular.put("Chicken Fried Rice with a side of pop",
                new Nutrients(433,12,34,11));
        FoodData.Regular.put("Hamburger with fries",
                new Nutrients(900,8,69,19));
        FoodData.Regular.put("Baked Salmon with Garlic and Dijon",
                new Nutrients(314,24,3,15));
        FoodData.Regular.put("Steak and rice",
                new Nutrients(493,71,94,18));
        FoodData.Regular.put("Spaghetti with tomato sauce and cooked ground beef",
                new Nutrients(700,20,33,13));
        FoodData.Vegetarian.put("Baked Banana-Nut Oatmeal with a cup of yogurt",
                new Nutrients(365,22,55,11));
        FoodData.Vegetarian.put("Oatmeal, 2 boiled eggs",
                new Nutrients(480,11,27,8));
        FoodData.Vegetarian.put("Thai Curry Pizza & smoothie",
                new Nutrients(620,12,21,9));
        FoodData.Vegetarian.put("Veggie Wrap",
                new Nutrients(345,0,9,1));
        FoodData.Vegetarian.put("Hummus Bowls",
                new Nutrients(534,12,6,5));
        FoodData.Vegetarian.put("2 Veggie Sandwich & salad",
                new Nutrients(750,41,0,36));
        FoodData.Vegetarian.put("2 Vegetarian Tacos & smoothie",
                new Nutrients(397,11,66,16));
        FoodData.Vegetarian.put("Curried Chickpea Stew & 2 Bread",
                new Nutrients(561,30,70,10));
        FoodData.Vegetarian.put("Tikka Masala & 2 Peanut-Butter Energy Balls",
                new Nutrients(714,2,10,10));
        FoodData.Vegan.put("Grain Toast with Vegan Peanut Butter & Banana",
                new Nutrients(377,5,46,5));
        FoodData.Vegan.put("Toast with avocado & Vegan Cheese",
                new Nutrients(515,20,38,21));
        FoodData.Vegan.put("3 pancakes with syrup",
                new Nutrients(790,9,93,12));
        FoodData.Vegan.put("Vegan Superfood Buddha Bowls",
                new Nutrients(381,13,81,18));
        FoodData.Vegan.put("Lentil Bean Salad & bag of chickpeas",
                new Nutrients(804,7,15,10));
        FoodData.Vegan.put("Veggie Sandwich & 2 bananas & orange",
                new Nutrients(567,20,138,20));
        FoodData.Vegan.put("Vegan Quinoa Salad",
                new Nutrients(300,12,45,7));
        FoodData.Vegan.put("Chickpea Buddha Bowl",
                new Nutrients(481,20,67,25));
        FoodData.Vegan.put("Vegan Coconut Chickpea Curry",
                new Nutrients(733,20,57,6));
    }
}

