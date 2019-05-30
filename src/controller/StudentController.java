/*
 * 与学生有关的操作
 * 交由此Controller处理
 */

package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.StudentService;

@Controller
@Scope("prototype")
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

}
