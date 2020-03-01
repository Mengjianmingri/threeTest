package rxz.pojo;



import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class User implements Serializable {
    private Integer id;
    @Excel(name = "用户名",needMerge = true)
    private String username;
    @Excel(name = "密码",needMerge = true)
    private String password;
    @Excel(name = "生日",needMerge = true,databaseFormat = "yyyy-MM-dd",format = "yyyy-MM-dd")
    private Date birthday;
    @ExcelCollection(name = "订单")
    private List<Order> orderList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", orderList=" + orderList +
                '}';
    }

    public User() {
    }

    public User(Integer id, String username, String password, Date birthday, List<Order> orderList) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.birthday = birthday;
        this.orderList = orderList;
    }
}
