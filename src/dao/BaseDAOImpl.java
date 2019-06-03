package dao;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import util.HibernateUtil;

import java.io.Serializable;
import java.util.List;

@Repository("baseDAO")
public class BaseDAOImpl<T> implements BaseDAO<T> {

    @Override
    public T get(Class<T> entityClazz, Serializable id) {
        return HibernateUtil.getSession().get(entityClazz, id);
    }

    @Override
    public List<T> list(Class<T> entityClazz) {
        String hql = "FROM " + entityClazz.getSimpleName();
        Query query = HibernateUtil.getSession().createQuery(hql);
        return (List<T>)query.list();
    }

    @Override
    public Serializable save(T entity) {
        return HibernateUtil.getSession().save(entity);
    }

    @Override
    public void update(T entity) {
        HibernateUtil.getSession().saveOrUpdate(entity);
    }

}
