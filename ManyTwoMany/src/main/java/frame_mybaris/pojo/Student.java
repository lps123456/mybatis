package frame_mybaris.pojo;

import java.util.Set;

public class Student {
  private Integer id;
  private  String sName;
  //一个学生对应多个老师
    private Set<Teacher> teachers;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", sName='" + sName + '\'' +
                ", teachers=" + teachers +
                '}';
    }
}
