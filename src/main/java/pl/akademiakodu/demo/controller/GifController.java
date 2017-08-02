package pl.akademiakodu.demo.controller;

import pl.akademiakodu.demo.dao.GifDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Agnieszka on 2017-08-02.
 */
@Controller
public class GifController {

    @GetMapping("/")
    public String showGifs(ModelMap modelMap){
        modelMap.addAttribute("images", GifDao.show());
        return "home";
    }
}
