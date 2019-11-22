package be.ifosup.info.poo.hellofresh.pojo;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class RecipeManager {
    /*
    Set recipe

    addRecipe()
    removeRecipe()
    updateRecipe()
    containsRecipe()
    getRecipes()
    filterByTags()
    filterByTitle()
    filterByCategory()
    filterByDifficulty()
    filterByTime()
    filterBy...

     */
    private Set<Recipe> recipes = new HashSet<>();

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public boolean addRecipe(Recipe recipe){
        return recipes.add(recipe);
    }

//    public Set<Recipe> filterByTags(String tag,
//                                    Category category,
//                                    Difficulty difficulty,
//                                    int time){
//        //TODO
//        if (!tag.isEmpty()){
//            var tags = tag.split(" ");
//            for (var t : tags){
//                recipes.parallelStream().filter(Objects::nonNull).collect(Collectors.toSet());
//
//            }
//        }
//
//    }
}
