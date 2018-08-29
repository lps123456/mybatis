package frame_mybaris.dao;

import frame_mybaris.pojo.Student;

import java.util.List;

public interface CacheMapper {

    Student selectStudentFandAll(int Student);

    void cacheSecondAdd(Student student);

    void firstCacheAdd(Student student);
    List<Student> pagehelper();

    /**
     *调用存储过程
     */
     void selectnameByProcedure(Student stu);
}
