package Builder;

public class MealBuiler {
    public  Meal preparVegMeal(){
        Meal meal=new Meal();
        meal.add(new VegBurger());
        meal.add(new Coke());
        return meal;
    }

    public Meal preapreNonVegMeal(){
        Meal meal=new Meal();
        meal.add(new ChickenBurger());
        meal.add(new Coke());
        return  meal;
    }
}
