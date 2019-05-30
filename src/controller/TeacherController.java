/*
 * 与教师有关的操作
 * 交由此Controller处理
 */

package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.Teacher;
import service.TeacherService;

@Controller
@Scope("prototype")
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

}
