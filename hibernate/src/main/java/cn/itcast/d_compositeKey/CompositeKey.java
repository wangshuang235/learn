package cn.itcast.d_compositeKey;

import java.io.Serializable;

/**
 * @author cool
 * Date 2018-01-03 16:01
 */
public class CompositeKey implements Serializable {
    private String userName;
    private String address;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
