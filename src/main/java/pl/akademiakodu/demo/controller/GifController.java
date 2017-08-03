package pl.akademiakodu.demo.controller;
import org.springframework.ui.Model;
import pl.akademiakodu.demo.dao.GifDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.akademiakodu.demo.model.Category;
import pl.akademiakodu.demo.model.Images;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Agnieszka on 2017-08-02.
 */
@Controller
public class GifController {

    private GifDao gifDao = new GifDao();


    @GetMapping("/")
    public String showGifs(ModelMap modelMap) {
        modelMap.addAttribute("images", gifDao.showAll());
        return "home";
    }

    @GetMapping("/favorites")
    public String favorites(ModelMap modelMap) {
        modelMap.addAttribute("images", gifDao.showFavorites());
        return "favorites";
    }
    @GetMapping("/gifs/search")
    public String search(@RequestParam String q, ModelMap modelMap) {
        List<Images> images = new ArrayList<Images>();
        if (gifDao.findName(q)!=null)
        images.add(gifDao.findName(q));
        modelMap.addAttribute("images", images);
        return "home";
    }

    @GetMapping("/categories")
    public String categories(ModelMap modelMap){
        modelMap.addAttribute("categories", gifDao.showCate());
        return "categories";
    }
    @GetMapping("/category/{id}")
    public String category(@ModelAttribute Category cat, ModelMap modelMap){
        modelMap.addAttribute("categories", gifDao.showCate());
        modelMap.addAttribute("images", gifDao.findbyCate(cat.getId()));
        return "category";
    }

    @GetMapping("/categories/search")
    public String searchByCategory(@RequestParam String q, ModelMap modelMap){
        modelMap.addAttribute("images", gifDao.searchByCateName(q));
        return "categories";
    }

}
