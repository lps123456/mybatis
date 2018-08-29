package frame_mybaris.pojo;

import java.io.Serializable;

public class User implements Serializable{
    private  int id;
    private  String userName;
    private String passWords;

    public User(int i) {
        this.id=i;
    }
public User(){

}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWords() {
        return passWords;
    }

    public void setPassWords(String passWords) {
        this.passWords = passWords;
    }




}
