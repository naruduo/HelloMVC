/*
 * 所有用户共同且与pojo对象无关的操作
 * 交由此Controller处理
 */

package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import pojo.User;
import service.BaseService;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.net.URLEncoder;

@Controller
@Scope("prototype")
@RequestMapping("/user")
//存储用户信息到Session
@SessionAttributes(types = {User.class}, value = {"user"})
public class UserController {


    //
    @Autowired
    BaseService bs;


    //登录
    @RequestMapping("/login")
    public ModelAndView login(@RequestParam("id") Integer id,
                              @RequestParam("password") String pwd,
                              @RequestParam("role") String role) throws Exception{
        //创建视图对象
        ModelAndView mav = new ModelAndView();
        //登录操作
        User user = (User)bs.login(id, pwd, Class.forName("pojo." + role));
        if(user != null) {
            //登录成功 返回对应用户主界面
            mav.setViewName(role + "Index");
            mav.addObject("user", user);
        } else {
            //登录失败 返回登录界面，并打印错误信息
            mav.setViewName("logins");
            mav.addObject("loginError", "用户名不存在或密码错误");
        }
        //返回视图对象
        return mav;
    }


    //登出
    @RequestMapping("/logout")
    public ModelAndView logout(SessionStatus status) {
        //删除session中的所有用户信息
        status.setComplete();
        //返回登录页面
        return new ModelAndView("logins");
    }


    //测试
    @RequestMapping("/test")
    public ModelAndView test() {
        return new ModelAndView("test/uploadTest");
    }


    /*
     * 上传
     * 参数：上传的文件
     * 返回值：Json格式返回字符串 表示上传是否成功
     */
    @RequestMapping("/upload")
    public @ResponseBody String upload(MultipartFile uploadFile,
                  HttpSession httpSession) throws Exception {
        //是否选择了文件
        if(uploadFile.getSize() > 0) {
            //获取文件名
            String fileName = uploadFile.getOriginalFilename();
            //获取根目录
            String rootPath = httpSession.getServletContext().getRealPath("/");
            //新建文件
            File file = new File(rootPath, fileName);
            //存储文件
            uploadFile.transferTo(file);
            return "上传成功！";
        }
        //返回错误提示
        return "上传出现了一些问题哦！";
    }


    /*
     *下载
     * 参数：下载的文件名
     * 返回值：对应的文件
     */
    @RequestMapping("/download")
    public ResponseEntity<byte[]> download(String fileName) throws Exception {
        //获得文件路径+名称
        String rootPath = "";
        //File file = new File(rootPath, fileName);
        fileName = "百度网盘共享.txt";
        File file = new File("E:\\大三下\\JavaEE\\百度网盘共享.txt");
        //创建响应报头
        HttpHeaders headers = new HttpHeaders();
        //设置文件类型为 二进制流 可以传输任何文件
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        //设置响应方式
        headers.setContentDispositionFormData("attachment", URLEncoder.encode(fileName,"utf-8"));
        //返回字节流的响应报文
        return new ResponseEntity<byte[]> (FileCopyUtils.copyToByteArray(file),
                headers, HttpStatus.CREATED);
    }


}
