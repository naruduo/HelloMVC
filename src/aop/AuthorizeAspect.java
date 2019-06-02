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
import util.HttpSessionUtils;


@Aspect
@Component
public class AuthorizeAspect {

    @Pointcut("execution(* controller.*.*(..)) " +
            "&& !execution(* controller.UserController.log*(..))")
    public void verify() {}

    @Before("verify()")
    public void doVerify() {
        if(HttpSessionUtils.getUser() == null)
            throw new AuthorizeException();
    }

}
