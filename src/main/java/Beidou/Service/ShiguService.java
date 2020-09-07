package Beidou.Service;

import Beidou.Dao.shiguMapper;
import Beidou.Pojo.UploadSHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShiguService {
    @Autowired
    private shiguMapper shiguMapper;
    public void upload(UploadSHi uploadSHi){
        shiguMapper.insert(uploadSHi);


    }
}
