package spring_mvc.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/*
 * @Author: cool
 * @Date: 2018/6/12 12:58
 */
@Entity
@Table(name = "sys_user",schema = "sys")
public class User implements Serializable {
    @Id
    private Long id;
    private String name;

    public User() {

    }

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

