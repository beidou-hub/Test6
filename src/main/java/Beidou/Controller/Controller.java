package Beidou.Controller;

import Beidou.Interface.BrandInterface;
import Beidou.Pojo.Brand;
import Beidou.Pojo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("ip")
public class Controller{
    @Autowired
    private BrandInterface brandService ;
    @RequestMapping("route")
    public List<Brand> getString(@RequestParam(value = "cre") String page)
                                 {
        return brandService.getBrand(page);
    }
}
