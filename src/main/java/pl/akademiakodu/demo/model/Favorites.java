package pl.akademiakodu.demo.model;

/**
 * Created by user on 02.08.2017.
 */
public class Favorites {
    private String name;
    private boolean favorites;

    public Favorites(){
    }

    public Favorites(String name, boolean favorites) {
        this.name = name;
        this.favorites = favorites;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFavorites() {
        return favorites;
    }

    public void setFavorites(boolean favorites) {
        this.favorites = favorites;
    }
}
