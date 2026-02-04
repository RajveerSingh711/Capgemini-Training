package Feb4;

/*Design a Personalized Meal Plan Generator where users can choose different meal categories like Vegetarian, Vegan, Keto, or High-Protein. The system should ensure only valid meal plans are generated.
Hints:
Define an interface MealPlan with subtypes (VegetarianMeal, VeganMeal, etc.).
Implement a generic class Meal<T extends MealPlan> to handle different meal plans.
Use a generic method to validate and generate a personalized meal plan dynamically.
*/

import java.util.*;

interface MealPlan{
    String getCategory();
    int getCalories();
    void showMeals();
}
class VegetarianMeal implements MealPlan{
    @Override
    public String getCategory(){
        return "Vegetarian";
    }
    @Override
    public int getCalories(){
        return 1800;
    }
    @Override
    public void showMeals(){
        System.out.println("Veg Meal: Dal, Rice, Paneer, Vegetables");
    }
}
class VeganMeal implements MealPlan{
    @Override
    public String getCategory(){
        return "Vegan";
    }
    @Override
    public int getCalories(){
        return 1700;
    }
    @Override
    public void showMeals(){
        System.out.println("Vegan Meal: Tofu, Quinoa, Fruits, Nuts");
    }
}
class KetoMeal implements MealPlan{
    @Override
    public String getCategory(){
        return "Keto";
    }
    @Override
    public int getCalories(){
        return 2000;
    }
    @Override
    public void showMeals(){
        System.out.println("Keto Meal: Eggs, Avocado, Cheese, Meat");
    }
}
class HighProteinMeal implements MealPlan{
    @Override
    public String getCategory(){
        return "High-Protein";
    }
    @Override
    public int getCalories(){
        return 2200;
    }
    @Override
    public void showMeals(){
        System.out.println("High Protein Meal: Chicken, Eggs, Lentils, Whey");
    }
}
class Meal<T extends MealPlan>{
    private String userName;
    private T mealPlan;
    public Meal(String userName,T mealPlan){
        this.userName=userName;
        this.mealPlan=mealPlan;
    }
    public void generateMealPlan(){
        System.out.println("User: "+userName);
        System.out.println("Category: "+mealPlan.getCategory());
        System.out.println("Calories: "+mealPlan.getCalories());
        mealPlan.showMeals();
        System.out.println();
    }
    public T getMealPlan(){
        return mealPlan;
    }
}
class MealPlanGenerator{
    public static <T extends MealPlan> void validateAndGenerate(T mealPlan){
        if(mealPlan.getCalories()<1500 || mealPlan.getCalories()>2500){
            System.out.println("Invalid meal plan: Calories out of range");
            return;
        }
        System.out.println("Valid Meal Plan Detected");
        mealPlan.showMeals();
        System.out.println();
    }
}
public class MealSystem {
    public static void main(String[] args){
        Meal<VegetarianMeal> user1=new Meal<>("Raj",new VegetarianMeal());
        Meal<KetoMeal> user2=new Meal<>("Ananya",new KetoMeal());
        Meal<VeganMeal> user3=new Meal<>("Aman",new VeganMeal());
        user1.generateMealPlan();
        user2.generateMealPlan();
        user3.generateMealPlan();
        MealPlanGenerator.validateAndGenerate(new HighProteinMeal());
    }
}
