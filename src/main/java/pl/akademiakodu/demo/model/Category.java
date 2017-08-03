package pl.akademiakodu.demo.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Agnieszka on 2017-08-02.
 */
public class Category {
    private String name;
    private long id;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Category(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Category() {
    }

    public Category(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
