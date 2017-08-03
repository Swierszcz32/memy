package pl.akademiakodu.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.akademiakodu.demo.dao.CatDao;
import pl.akademiakodu.demo.model.Category;

import java.util.List;

/**
 * Created by user on 03.08.2017.
 */
@RestController
public class CategoryApiController {
    @GetMapping("/api/categories")
    public List<Category> listCategories(){
        CatDao catDao = new CatDao();
        return catDao.showCate();
    }
}
