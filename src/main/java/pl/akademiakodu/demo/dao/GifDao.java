package pl.akademiakodu.demo.dao;

import org.springframework.stereotype.Controller;
import pl.akademiakodu.demo.model.Category;
import pl.akademiakodu.demo.model.Images;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Agnieszka on 2017-08-02.
 */
public class GifDao {

    static List<Images> images = new ArrayList<>();

    static {
        images.add(new Images(true, "android-explosion", 1L));
        images.add(new Images(false, "ben-and-mike", 2L));
        images.add(new Images(false, "book-dominos", 3L));
        images.add(new Images(true, "compiler-bot", 4L));
        images.add(new Images(false, "cowboy-coder", 5L));
        images.add(new Images(true, "tenorme", 6L));
    }

    public List<Images> showAll() {
        return images;
    }

    public List<Images> showFavorites() {
        List<Images> favorites = new ArrayList<>();
        for (int i = 0; i < images.size(); i++) {
            if (images.get(i).isFavorite() == true)
                favorites.add(images.get(i));
        }
        return favorites;
    }

    public Images findName(String name) {
        Images search = null;
        for (Images image : images) {
            if (image.getName().equalsIgnoreCase(name)) {
                search = image;
            }
        }
        return search;

    }

    public Images findId(Long id) {
        Images display = null;
        for (Images image : images) {
            if (image.getId().longValue() == id.longValue()) {
                display = image;
            }

        }
        return display;
    }
}
