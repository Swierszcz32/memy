package pl.akademiakodu.demo.controller;

import pl.akademiakodu.demo.dao.ArticleDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Agnieszka on 2017-08-02.
 */
@Controller
public class ArticleController {

    @GetMapping("/articles")
    public String show( ModelMap modelMap){
        modelMap.addAttribute("articles", ArticleDao.show());
        return "articles";
    }
}
