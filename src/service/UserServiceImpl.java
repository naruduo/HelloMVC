/*
 * Copyright (c) 2019.
 * created by lw
 */

package service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import pojo.User;
import util.HttpSessionUtils;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    public void saveFile(MultipartFile uploadFile) throws IOException {
        HttpSession session = HttpSessionUtils.getHttpSession();
        //获取文件名
        String fileName = uploadFile.getOriginalFilename();
        //获取根目录
        String rootPath = session.getServletContext().getRealPath("/");
        //获取User的id作为子目录
        String dirName = ((User)session.getAttribute("user")).getId().toString();
        //该目录是否存在
        File dir = new File(rootPath + dirName);
        //不存在 则创建
        if(!dir.exists())
            dir.mkdir();
        //新建文件
        File file = new File(dir, fileName);
        //存储文件
        uploadFile.transferTo(file);
        HttpSessionUtils.getRequest().setAttribute("fileName", fileName);
    }

}
