package rxz.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import rxz.pojo.Order;
import rxz.pojo.User;

import java.util.List;

@Repository
@Mapper
public interface ExcelDao {
    List<User> export();
    List<Order> findOrdersByUid(Integer uid);

    void importExcel(User user);

    void importOrder(Order order);
}
