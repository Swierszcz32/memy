package pl.akademiakodu.demo.model;

/**
 * Created by user on 02.08.2017.
 */
public class Article {
    private String title;
    private String body;
    private String value;

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Article(){}

    public Article(String title, String body, String value) {
        this.title = title;
        this.body = body;
        this.value = value;
    }
    @Override
    public String toString(){return title+" "+body+" "+value;}
}
