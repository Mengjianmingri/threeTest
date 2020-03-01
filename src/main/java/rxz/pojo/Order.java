package rxz.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
    private Integer uid;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Excel(name = "订单号")
    private Integer oid;
    @Excel(name = "下单时间", databaseFormat = "yyyy-MM-dd",format = "yyyy-MM-dd")
    private Date ordertime;
    @Excel(name = "商品数量")
    private long total;

    public Order() {
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Order(Integer uid, Integer oid, Date ordertime, long total) {
        this.uid = uid;
        this.oid = oid;
        this.ordertime = ordertime;
        this.total = total;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
