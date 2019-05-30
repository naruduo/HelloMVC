package dao;

import org.springframework.stereotype.Repository;
import pojo.Teacher;

@Repository("teacherDAO")
public class TeacherDAOImpl extends BaseDAOImpl<Teacher> implements TeacherDAO {
}
