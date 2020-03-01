package rxz.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import rxz.pojo.Order;
import rxz.pojo.User;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class TestController {
//    @RequestMapping("/export")
//    public void test01(HttpServletResponse response) throws IOException {
//        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
//        Order order = new Order(1, new Date(), 5000);
//        Order order1 = new Order(2, new Date(), 800);
//        Order order2 = new Order(3, new Date(), 600);
//        List<Order> orderList =new ArrayList<>();
//        orderList.add(order);
//        orderList.add(order1);
//        orderList.add(order2);
//        User user = new User(1, "任宪章", "再见", new Date(), orderList);
//        User user2 = new User(2, "清河", "你好", new Date(), orderList);
//        ArrayList<User> users = new ArrayList<>();
//        users.add(user);
//        users.add(user2);
//        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("456", "用户和订单信息"), User.class, users);
//        response.setContentType("application/ms-excel");
//        String filename = "ordersetting_template.xls";
//        response.setHeader("Content-Disposition", "attachment;filename*= UTF-8''"+ URLEncoder.encode(filename,"UTF-8"));
//        ServletOutputStream so = response.getOutputStream();
//        workbook.write(so);
//        so.close();
//    }
}
