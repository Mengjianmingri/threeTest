package rxz.test03_rxz.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import rxz.test03_rxz.pojo.MyInterface;


import java.util.List;

@Component
@Mapper
public interface MyInterfaceMapper {
    public List<MyInterface> findAll();
}
