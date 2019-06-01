/*
 * Copyright (c) 2019.
 * created by lw
 */

package aop;

import exception.AuthorizeException;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpServletRequest;


@Aspect
@Component
public class AuthorizeAspect {

    @Pointcut("execution(* controller.*.*(..)) " +
            "&& !execution(* controller.UserController.log*(..))")
    public void verify() {}

    @Before("verify()")
    public void doVerify() {
        ServletRequestAttributes attr =
                (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest req = attr.getRequest();
        if(req.getSession().getAttribute("user") == null)
            throw new AuthorizeException();
    }

}
