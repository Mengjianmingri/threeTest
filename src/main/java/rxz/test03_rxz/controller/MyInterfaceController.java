package rxz.test03_rxz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rxz.test03_rxz.pojo.MyInterface;
import rxz.test03_rxz.pojo.Result;
import rxz.test03_rxz.service.MyInterfaceService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/my")
@RestController
public class MyInterfaceController {
    @Autowired
    private MyInterfaceService myInterfaceService;
    @RequestMapping("/findAll")
    public Result findAll(){
        Map<String,Object> map = new HashMap<>();
        List<Map<String, Object>> list = myInterfaceService.findCallTimes();
        map.put("callTimes",list);
        List<String> interfaceNames = new ArrayList<>();
        for (Map<String, Object> maps : list) {
            String names = (String) maps.get("name");
            interfaceNames.add(names);
        }
        map.put("interfaceNames",interfaceNames);
        return new Result(true,"查询所有成功!",map);
    }
}
