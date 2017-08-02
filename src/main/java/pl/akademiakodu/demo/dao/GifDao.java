package pl.akademiakodu.demo.dao;

import org.springframework.stereotype.Controller;
import pl.akademiakodu.demo.model.Images;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Agnieszka on 2017-08-02.
 */
public class GifDao {

    static List<Images> images = new ArrayList<>();
    static {
        images.add(new Images(true, "android-explosion"));
        images.add(new Images(false, "ben-and-mike"));
        images.add(new Images(false, "book-dominos"));
        images.add(new Images(true, "compiler-bot"));
        images.add(new Images(false, "cowboy-coder"));
        images.add(new Images(true, "tenorme"));
    }
    public List<Images> showAll(){return images;}

    public List<Images> showFavorites() {
        List<Images> favorites = new ArrayList<>();
        for (int i=0; i<images.size(); i++){
        if (images.get(i).isFavorite()== true)
            favorites.add(images.get(i));
        }
        return favorites;
    }
}

