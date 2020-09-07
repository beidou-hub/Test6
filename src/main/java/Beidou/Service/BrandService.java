package Beidou.Service;

import Beidou.Dao.BrandMapper;
import Beidou.Dao.shiguMapper;
import Beidou.Interface.BrandInterface;
import Beidou.Pojo.Brand;
import Beidou.Pojo.PageResult;
import Beidou.Pojo.UploadSHi;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BrandService implements BrandInterface {
    @Autowired
    private BrandMapper brandMapper;
    @Autowired
    private shiguMapper shiguMapper;


    @Override
    public PageResult<Brand> getBrand(Integer page, Integer rows, String name) { List<Brand> brands = new LinkedList<>();brands.add(new Brand(3,"请输入名字","请输入名字"));
            PageHelper.startPage(page, rows);
            List<Brand> brand = brandMapper.selectAll();
            List<Brand> collect = brand.stream().filter(str -> str.getBrand().equals(name)).collect(Collectors.toList());
            PageInfo<Brand> objectPageInfo = new PageInfo<>(collect);
            return new PageResult<>(objectPageInfo.getList(), objectPageInfo.getTotal());
            



    }

    @Override
    public void Insertshigu(UploadSHi uploadSHi) {
        int insert = shiguMapper.insert(uploadSHi);
        System.out.println(insert == 1 ? "成功" : "失败");

    }

    @Override
    public List<UploadSHi> select() {
        return shiguMapper.selectAll();
    }
}
