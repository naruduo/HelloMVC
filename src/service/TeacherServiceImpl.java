package service;

import dao.TeacherDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Teacher;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherDAO teacherDAO;

}
