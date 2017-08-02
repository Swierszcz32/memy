package pl.akademiakodu.demo.Dao;

import pl.akademiakodu.demo.model.Favorites;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 02.08.2017.
 */
public class FavoritesDaoImpl implements FavoritesDao{
    private  static List<Favorites> gifList = new ArrayList<>();
    static {
        gifList.add(new Favorites("android-explosion",true));
        gifList.add(new Favorites("ben-and-mike",false));
        gifList.add(new Favorites("book-dominos",false));
        gifList.add(new Favorites("compiler-bot",true));
        gifList.add(new Favorites("cowboy-coder",false));
        gifList.add(new Favorites("infinite-andrew",false));

    }
    public List<Favorites> favorites(){
        return gifList;
    }

    @Override
    public List<Favorites> gifList() {
        return null;
    }
}
