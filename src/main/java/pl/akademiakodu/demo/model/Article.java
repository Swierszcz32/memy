package pl.akademiakodu.demo.model;

/**
 * Created by Agnieszka on 2017-08-02.
 */
public class Article {
    private String title;
    private String body;

    public Article(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public Article() {
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }


    public String toString(){
        return title+" "+body;
    }
}

