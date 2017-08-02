package pl.akademiakodu.demo.dao;

import pl.akademiakodu.demo.model.Images;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Agnieszka on 2017-08-02.
 */
public class GifDao {

    public static List<Images> show(){
        List<Images> images = new ArrayList<>();
        images.add(new Images(true, "android-explosion"));
        images.add(new Images(false, "ben-and-mike"));
        images.add(new Images(false, "book-dominos"));
        images.add(new Images(true, "compiler-bot"));
        images.add(new Images(false, "cowboy-coder"));
        images.add(new Images(false, "infinite-andrew"));
        return images;
    }

}
