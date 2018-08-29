package frame_mybaris.pojo;

import java.io.Serializable;

public class User implements Serializable{
    private  int id;
    private  String userName;
    private  String passWords;

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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWords='" + passWords + '\'' +
                '}';
    }
    
}
