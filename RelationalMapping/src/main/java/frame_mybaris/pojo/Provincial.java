package frame_mybaris.pojo;

public class Provincial {
    /**
     * 省会对应的实体类
     */
    private  Integer pId;    //省会编号
    private String pName;    //省会名称4

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

    @Override
    public String toString() {
        return "Provincial{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                '}';
    }
}
