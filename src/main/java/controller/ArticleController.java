package controller;

import dao.ArticleDao;
import model.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

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
