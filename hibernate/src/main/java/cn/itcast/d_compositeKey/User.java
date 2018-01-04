package cn.itcast.d_compositeKey;

/**
 * @author cool
 * Date 2018-01-03 16:00
 */
public class User {
    private CompositeKey keys;
    private String msg;

    public CompositeKey getKeys() {
        return keys;
    }

    public void setKeys(CompositeKey keys) {
        this.keys = keys;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

