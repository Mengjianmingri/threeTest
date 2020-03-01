package rxz.test03_rxz.quartz.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;
import rxz.test03_rxz.mapper.MyInterfaceMapper;
import rxz.test03_rxz.pojo.MyInterface;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Component
public class MyInterfaceJob extends QuartzJobBean {
    private static List<MyInterface> myInterfaces;
    @Autowired
    private MyInterfaceMapper myInterfaceMapper;

    public List<MyInterface> getMyInterfaces(){
        return this.myInterfaces;
    }
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("TestQuartz01----" + sdf.format(new Date()));
        this.myInterfaces = myInterfaceMapper.findAll();
    }
}
