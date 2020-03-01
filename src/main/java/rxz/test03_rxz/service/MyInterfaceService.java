package rxz.test03_rxz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import rxz.test03_rxz.pojo.MyInterface;
import rxz.test03_rxz.quartz.job.MyInterfaceJob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MyInterfaceService {
    @Autowired
    private MyInterfaceJob myInterfaceJob;

    public List<MyInterface> findAll(){
        return myInterfaceJob.getMyInterfaces();
    }

    public List<Map<String, Object>> findCallTimes() {
        List<MyInterface> myInterfaceList = myInterfaceJob.getMyInterfaces();
        List<Map<String, Object>> list = new ArrayList<>();
        for (MyInterface myInterface : myInterfaceList) {
            HashMap<String, Object> map = new HashMap<>();
            Long callTimes = myInterface.getCallTimes();
            String name = myInterface.getName();
            map.put("name",name);
            map.put("value",callTimes);
            list.add(map);
        }
        return list;
    }
}
