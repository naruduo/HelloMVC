/*
 * Copyright (c) 2019.
 * created by lw
 */

package exception;

public class AuthorizeException extends RuntimeException {

    private  static final String errMsg = "请先登录哦~~~";

    @Override
    public String getMessage() {
        return errMsg;
    }

}
