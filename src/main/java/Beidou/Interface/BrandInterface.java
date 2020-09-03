package Beidou.Interface;

import Beidou.Pojo.Brand;
import Beidou.Pojo.PageResult;

import java.util.List;

public interface BrandInterface {
    public List<Brand> getBrand(String page);
}
