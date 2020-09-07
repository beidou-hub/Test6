package Beidou.Controller;

import Beidou.Interface.BrandInterface;
import Beidou.Pojo.Brand;
import Beidou.Pojo.PageResult;
import Beidou.Pojo.UploadSHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("ip")
public class Controller {
    @Autowired
    private BrandInterface brandService;

    @RequestMapping("route")
    public PageResult<Brand> getString(@RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
                                       @RequestParam(value = "rows", required = false, defaultValue = "2") Integer rows,
                                       @RequestParam(value = "name", required = false) String name
    ) {
        return brandService.getBrand(page, rows, name);
    }

    @RequestMapping("upload")
    public List<UploadSHi> uploadShigu(UploadSHi uploadSHi) {
        List<UploadSHi> select = brandService.select();
        return select;


    }

    @RequestMapping("select")
    public List<UploadSHi> select() {
        return brandService.select();


    }

    @GetMapping("test")
    public List<Brand> getBrand(@RequestParam(value = "page") String page) {

            LinkedList<Brand> brands = new LinkedList<>();
            brands.add(new Brand(1, "酷派", "绿色"));
            brands.add(new Brand(2, "敌敌畏", "红色"));
            brands.add(new Brand(3, "酷", "绿"));
            brands.add(new Brand(4, "粉红色", "o"));
            if(page.equals("升"))return brands.stream().sorted(Comparator.comparing(Brand::getId)).collect(Collectors.toList());else return brands.stream().sorted(Comparator.comparing(Brand::getId).reversed()).collect(Collectors.toList());




        }
    }

