package pl.akademiakodu.demo.dao;

import pl.akademiakodu.demo.model.Category;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Agnieszka on 2017-08-02.
 */
public class CatDao {
    public static List<Category> categories = new ArrayList<>();
    static {
        Category people = new Category("Ludzie", 1);
        Category animals = new Category("Zwierzęta", 2);
        Category things = new Category("Rzeczy", 3);
        categories.add(people);
        categories.add(animals);
        categories.add(things);
    }
    public List<Category> showCate(){
        return categories;
    }

}
