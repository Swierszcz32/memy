package pl.akademiakodu.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.akademiakodu.demo.Dao.FavoritesDao;
import pl.akademiakodu.demo.Dao.FavoritesDaoImpl;

import java.util.List;

/**
 * Created by user on 02.08.2017.
 */
@Controller
public class FavoritesController {
    @GetMapping("/favorites")
    public String favorites(ModelMap modelMap){
        FavoritesDaoImpl favoritesDao=new FavoritesDaoImpl();
        modelMap.addAttribute("gifs", favoritesDao.gifList());

        return "favorites";
    }
}
