package cn.ws.test.exception;

import org.junit.Test;

/*
 * @Author: cool
 * @Date: 2018/8/2 14:47
 */
public class TestException {
    @Test
    public void test() {
        Do aDo = new Do();
        try {
            aDo.doDo();
        } catch (Exception e) {
            ExceptionUtil.getException(e);
        }
    }
    @Test
    public void test2() {
        String sb = "FH03";
        int i = Integer.parseInt(sb.substring(2, 3));
        System.out.println(sb.substring(0, 1));
    }
}

class ExceptionUtil{
    public static String getException(Throwable t) {
        if ("BusinessException".equals(t.getClass().getSimpleName())) {
            System.out.println("BusinessException");
        }
        return "haha";
    }
}

class Do {

    public void doDo() {
        if (true) {
            throw new BusinessException("异常了");
        }

    }
}
class BusinessException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public BusinessException(String message) {
        super(message);
    }
}
class SystemException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public SystemException(String message) {
        super(message);
    }
}
