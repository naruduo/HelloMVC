package service;

import pojo.User;

public interface BaseService<T> {

    public User login(int id, String pwd, Class clazz) throws Exception;

}
