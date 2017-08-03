package pl.akademiakodu.demo.model;

import sun.util.resources.cldr.tg.CalendarData_tg_Cyrl_TJ;

/**
 * Created by Agnieszka on 2017-08-02.
 */
public class Images {


    private boolean isFavorite = false;
    private String name;

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

    public Images(boolean isFavorite, String name) {
        this.isFavorite = isFavorite;
        this.name = name;

    }

}






