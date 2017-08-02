package pl.akademiakodu.demo.Dao;

import pl.akademiakodu.demo.model.Article;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 02.08.2017.
 */
public class ArticleDao {
    public static List<Article> table = new ArrayList<>();
    static {
        table.add(new Article("","",""));
        table.add(new Article("","",""));
        table.add(new Article("","",""));
        table.add(new Article("","",""));
        table.add(new Article("","",""));
    }
}
