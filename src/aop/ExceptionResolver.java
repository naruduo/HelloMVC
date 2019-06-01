/*
 * Copyright (c) 2019.
 * created by lw
 */

package aop;


import exception.AuthorizeException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class ExceptionResolver implements HandlerExceptionResolver {

    @ExceptionHandler(value = AuthorizeException.class)
    public ModelAndView resolveException(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2,
                                         Exception arg3) {
        return new ModelAndView("logins");
    }

}
