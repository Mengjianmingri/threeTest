package rxz.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.excel.entity.result.ExcelImportResult;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import rxz.pojo.Result;
import rxz.pojo.User;
import rxz.service.ExcelService;

import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

@Controller
@RequestMapping("excel")
public class ExcelController {
    @Autowired
    private ExcelService excelService;
    @RequestMapping("/export")
    public void export(HttpServletResponse response) throws IOException {
        List<User> users = excelService.export();
        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("用户和订单信息", "sheet1"), User.class, users);
        response.setContentType("application/ms-excel");
        String filename = "ordersetting_template.xls";
        response.setHeader("Content-Disposition", "attachment;filename*= UTF-8''"+ URLEncoder.encode(filename,"UTF-8"));
        ServletOutputStream so = response.getOutputStream();
        workbook.write(so);
        so.close();
    }
    @RequestMapping("/import")
    @ResponseBody
    public Result importController(MultipartFile excelFile) throws Exception {
        ImportParams params = new ImportParams();
        params.setTitleRows(1);
        params.setHeadRows(1);
        ExcelImportResult<User> result = ExcelImportUtil.importExcelMore(excelFile.getInputStream(), User.class, params);
        List<User> users = result.getList();
        boolean flag = excelService.importExcel(users);
        if (flag){
            return new Result(true,"导入成功!");
        }else {
            return new Result(false,"导入失败!");
        }
    }
}
