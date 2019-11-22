package be.ifosup.info.poo.hellofresh.app;

import be.ifosup.info.poo.hellofresh.pojo.Ingredient;
import be.ifosup.info.poo.hellofresh.pojo.Recipe;

import java.util.HashSet;
import java.util.Set;

public class ConApp {
    public static void main(String[] args) {
        Set<Recipe> recipes = new HashSet<>();
        var rec1 = new Recipe.Builder()
                .putSubTitle("Bidule")
                .putTitle("Machin")
                .putTime(15)
                .build();
        recipes.add(rec1);
        recipes.add(new Recipe("Omelette"));
        recipes.add(new Recipe("Burger"));

        var r = new Recipe("test");
        r.addIngredient(new Ingredient("Ail",1, Ingredient.Unit.pc));
        r.addIngredient(new Ingredient("Ail",1, Ingredient.Unit.pc));

        r.getIngredients().forEach(System.out::println);

        recipes.forEach(System.out::println);
    }
}
