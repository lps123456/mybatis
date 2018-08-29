package frame_mybaris.pojo;

import java.util.Set;

public class Provincial {
    /**
     * 省会对应的实体类
     */
    private  Integer pId;    //省会编号
    private String pName;    //省会名称

    private Country country;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Provincial{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", country=" + country +
                '}';
    }
}
