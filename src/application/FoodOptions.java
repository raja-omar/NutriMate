package application;
/**
 * FoodOptions Class
 * Instance Variables: Breakfast1-3 breakfastCalories lunch1-3 lunchCalories dinner1-3 dinnerCalories
 * Overall Description of the class: In this class we establish certain food choice the user chooses
 * and then sets the choices to their calories
 */
public class FoodOptions {

	public static String breakfast1;
	public static String breakfast2;
	public static String breakfast3;


	public static String lunch1;
	public static String lunch2;
	public static String lunch3;


	public static String dinner1;
	public static String dinner2;
	public static String dinner3;
	/*Method Name: FoodOptions
	*Inputs: typeOfFood
	*Functionality: The user choice will be given to them by this method   
	*Outputs/Sets: places the right foods for the user to choose from
	*/
	public static void setValues(String typeOfFood) {
		String regularFood = "Regular";
		String vegetarian = "Vegetarian";
		String vegan = "Vegan";

		if (typeOfFood.equals(regularFood)) {
			FoodOptions.breakfast1 = "Omelet with mac and cheese";
			FoodOptions.breakfast2 = "One bowl of cereal with 2 large bananas";
			FoodOptions.breakfast3 = "2 eggs 2 bacon 2 toast";
			FoodOptions.lunch1 = "Beef Nachos";
			FoodOptions.lunch2 = "Chicken Fried Rice with a side of pop";
			FoodOptions.lunch3 = "Hamburger with fries";
			FoodOptions.dinner1 = "Baked Salmon with Garlic and Dijon";
			FoodOptions.dinner2 = "Steak and rice";
			FoodOptions.dinner3 = "Spaghetti with tomato sauce and cooked ground beef";
		}
		if (typeOfFood.equals(vegetarian)) {
			FoodOptions.breakfast1 = "Baked Banana-Nut Oatmeal with a cup of yogurt";
			FoodOptions.breakfast2 = "Oatmeal, 2 boiled eggs";
			FoodOptions.breakfast3 = "Thai Curry Pizza & smoothie";
			FoodOptions.lunch1 = "Veggie Wrap";
			FoodOptions.lunch2 = "Hummus Bowls";
			FoodOptions.lunch3 = "2 Veggie Sandwich & salad";
			FoodOptions.dinner1 = "2 Vegetarian Tacos & smoothie";
			FoodOptions.dinner2 = "Curried Chickpea Stew & 2 Bread";
			FoodOptions.dinner3 = "Tikka Masala & 2 Peanut-Butter Energy Balls";
		}
		if (typeOfFood.equals(vegan)) {
			FoodOptions.breakfast1 = "Grain Toast with Vegan Peanut Butter & Banana";
			FoodOptions.breakfast2 = "Toast with avocado & Vegan Cheese";
			FoodOptions.breakfast3 = "3 pancakes with syrup";
			FoodOptions.lunch1 = "Vegan Superfood Buddha Bowls";
			FoodOptions.lunch2 = "Lentil Bean Salad & bag of chickpeas";
			FoodOptions.lunch3 = "Veggie Sandwich & 2 bananas & orange";
			FoodOptions.dinner1 = "Vegan Quinoa Salad";
			FoodOptions.dinner2 = "Chickpea Buddha Bowl";
			FoodOptions.dinner3 = "Vegan Coconut Chickpea Curry";
		}
	}


}
