package rxz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rxz.dao.ExcelDao;
import rxz.pojo.Order;
import rxz.pojo.User;

import java.util.List;

@Service
public class ExcelService {
    @Autowired
    private ExcelDao excelDao;
    public List<User> export() {
        List<User> users = excelDao.export();
        for (User user : users) {
            List<Order> orders = excelDao.findOrdersByUid(user.getId());
            user.setOrderList(orders);
        }
        return users;
    }

    public boolean importExcel(List<User> users) {
        try {
            for (User user : users) {
                if (user.getUsername()!=null){
                    excelDao.importExcel(user);
                    List<Order> orderList = user.getOrderList();
                    for (Order order : orderList) {
                        order.setUid(user.getId());
                        excelDao.importOrder(order);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
