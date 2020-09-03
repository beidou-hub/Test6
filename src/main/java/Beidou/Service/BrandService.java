package Beidou.Service;

import Beidou.Dao.BrandMapper;
import Beidou.Interface.BrandInterface;
import Beidou.Pojo.Brand;
import Beidou.Pojo.PageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
@Service
public class BrandService implements BrandInterface {
    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> getBrand(String page) {
        Example example = new Example(Brand.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andLike("brand","%"+page+"%");
        List<Brand> brands = brandMapper.selectByExample(example);

        return brands;
    }
}
