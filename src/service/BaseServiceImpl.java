package service;

import dao.BaseDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.User;

import java.lang.reflect.Field;

@Service("baseService")
public class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    BaseDAOImpl<T> baseDAO;

    @Override
    public User login(int id, String pwd, Class clazz) throws Exception {
        //查询id对应用户
        Object userObj = baseDAO.get(clazz, id);
        if(userObj != null) {
            //获取用户id字段
            Field field = null;
            //获取id
            Integer userId = id;
            //获取密码
            field = clazz.getDeclaredField("password");
            field.setAccessible(true);
            String userPwd = field.get(userObj).toString();
            //密码错误 返回空
            if(!userPwd.equals(pwd))
                return null;
            //获取名字
            field = clazz.getDeclaredField("name");
            field.setAccessible(true);
            String userName = field.get(userObj).toString();
            //获取班级id
            field = clazz.getDeclaredField("classId");
            field.setAccessible(true);
            Integer userClassId = field.getInt(userObj);
            //返回对应user对象
            return new User(userId, userName, userClassId);
        }
        return null;
    }

}
