/*
 * Copyright (c) 2019.
 * created by lw
 */

package service;

import org.springframework.web.multipart.MultipartFile;
import pojo.User;

import java.io.IOException;

public interface UserService extends BaseService<User> {

    public void changePwd(String newPwd);

    public void saveFile(MultipartFile uploadFile) throws IOException;

}
