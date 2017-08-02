package pl.akademiakodu.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticleController {
    @GetMapping("/articles")
        public String artilces(ModelMap modelMap){
        modelMap.addAttribute("","")
        return "articles";
    }
    }
