package dao;

import model.Article;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Agnieszka on 2017-08-02.
 */
public class ArticleDao {

    public static List<Article> show() {
        List<Article> articles = new ArrayList<>();
        articles.add(new Article("Dupa", "jkvcsdjkg"));
        articles.add(new Article("asfsdgddf", "fcvegvfdf"));
        articles.add(new Article("Artykuł 3", "blabla"));
        articles.add(new Article("Artykuł 4", "blabla"));
        articles.add(new Article("Artykuł 5", "blabla"));
        return articles;
    }

}
