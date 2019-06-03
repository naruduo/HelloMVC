/*
 * Copyright (c) 2019.
 * created by lw
 */

package aop;

import dao.OpDetailDAO;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import pojo.OpDetail;
import pojo.User;
import util.HttpSessionUtils;

@Aspect
@Component
@Transactional
public class OperationLogAspect {

    @Autowired
    private OpDetailDAO opDetailDAO;

    @Pointcut("execution(* controller.*.*load(..))")
    public void oplog() {}

    @AfterReturning("oplog()")
    @Transactional
    public void writeOpLog() {
        System.out.println(1);
        User user = HttpSessionUtils.getUser();
        OpDetail od = new OpDetail();
        od.setStuId(user.getId());
        od.setStuName(user.getName());
        od.setOpDetail(HttpSessionUtils.getRequest().getAttribute("fileName").toString());
        opDetailDAO.save(od);
    }

}
