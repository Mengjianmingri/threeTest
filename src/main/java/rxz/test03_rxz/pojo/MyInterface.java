package rxz.test03_rxz.pojo;

import org.springframework.stereotype.Component;
import java.util.Date;
@Component

public class MyInterface {

    private Integer id;
    private String name;
    private Long callTimes;
    private Date initTime;
    private Integer health;

    @Override
    public String toString() {
        return "MyInterface{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", callTimes=" + callTimes +
                ", initTime=" + initTime +
                ", health=" + health +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCallTimes() {
        return callTimes;
    }

    public void setCallTimes(Long callTimes) {
        this.callTimes = callTimes;
    }

    public Date getInitTime() {
        return initTime;
    }

    public void setInitTime(Date initTime) {
        this.initTime = initTime;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }
}
