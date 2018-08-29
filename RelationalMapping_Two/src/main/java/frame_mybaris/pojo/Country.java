package frame_mybaris.pojo;

import java.util.Set;

public class Country {
    private Integer id;    //国家编号
    private String cname;
    //一个国家对应N个省会
    private Set<Provincial> provincials;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
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
                ", cname='" + cname + '\'' +
                ", provincials=" + provincials +
                '}';
    }
}

