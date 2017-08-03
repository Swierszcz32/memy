package pl.akademiakodu.demo.model;

import sun.util.resources.cldr.tg.CalendarData_tg_Cyrl_TJ;

/**
 * Created by Agnieszka on 2017-08-02.
 */
public class Images {
    public Long id;

    private boolean isFavorite = false;
    private String name;

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Images() {
    }


    public Images(boolean isFavorite, String name, Long id) {
        this.isFavorite = isFavorite;
        this.name = name;
        this.id = id;
    }

}






