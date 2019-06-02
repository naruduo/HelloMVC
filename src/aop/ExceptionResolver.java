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
import java.io.IOException;

@Component
public class ExceptionResolver implements HandlerExceptionResolver {

    @ExceptionHandler
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse,
                                         Object obj, Exception ex) {
        ModelAndView view = new ModelAndView();
        if(ex instanceof AuthorizeException)
            view.setViewName("logins");
        else if(ex instanceof IOException)
            view.setViewName("/test/errors");
        ex.printStackTrace();
        view.addObject("errMsg", ex.getMessage());
        return view;
    }

}
