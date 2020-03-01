package rxz.test03_rxz.quartz.configuration;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rxz.test03_rxz.quartz.job.MyInterfaceJob;

@Configuration
public class TestQuartzConfiguration {
    @Bean
    public JobDetail test01(){
        return JobBuilder.newJob(MyInterfaceJob.class).withIdentity("myJob").storeDurably().build();
    }
    @Bean
    public Trigger testQuartzTrigger(){
        return TriggerBuilder.newTrigger().forJob(test01())
                .withIdentity("myTrigger")
                .withSchedule(CronScheduleBuilder.cronSchedule("*/10 * * * * ?")).build();
    }
}
