package frame_mybaris.pojo;

import java.util.Set;

public class Country {
    private Integer id;    //国家编号
    private String cName;   //国家名称
    //一个国家对应N个省会
    private Set<Provincial> provincials;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Set<Provincial> getProvincials() {
        return provincials;
    }

    public void setProvincials(Set<Provincial> provincials) {
        this.provincials = provincials;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", cName='" + cName + '\'' +
                ", provincials=" + provincials +
                '}';
    }
}
