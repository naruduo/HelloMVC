package dao;

import org.springframework.stereotype.Repository;
import pojo.Student;

@Repository("studentDAO")
public class StudentDAOImpl extends BaseDAOImpl<Student> implements StudentDAO {
}
