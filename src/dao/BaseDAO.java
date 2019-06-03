package dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDAO<T> {

    public T get(Class<T> entityClazz, Serializable id);

    public List<T> list(Class<T> entityClazz);

    public Serializable save(T entity);

    public void update(T entity);

}
