package Builder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuiler mealBuiler=new MealBuiler();

        Meal vegMeal=mealBuiler.preparVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();

        System.out.println("Total Cost"+  vegMeal.getCost());
    }
}
