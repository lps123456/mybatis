package frame_mybaris.dao;

import frame_mybaris.pojo.Student;
import frame_mybaris.pojo.Teacher;

import java.io.Serializable;

public interface TeacherMapper {
    /**
     * 根据学生编号查询 所有老师的信息
     */

    Student selectTeacherById(Serializable id);

    /**
     * 根据老师编号查询 所有学生的信息
     */
    Teacher selectStudentById(Serializable id);
}
