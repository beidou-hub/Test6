package Beidou.Interface;

import Beidou.Pojo.Brand;
import Beidou.Pojo.PageResult;
import Beidou.Pojo.UploadSHi;

import java.util.List;

public interface BrandInterface {
    public PageResult<Brand> getBrand(Integer page,Integer rows,String name);
    public void Insertshigu(UploadSHi uploadSHi);

    List<UploadSHi> select();
}
