package pl.akademiakodu.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.akademiakodu.demo.Dao.ArticleDao;

@Controller
public class ArticleController {
    @GetMapping("/articles")
        public String artilces(ModelMap modelMap){
        modelMap.addAttribute("articles", ArticleDao.table());
        return "articles";
    }
    }
