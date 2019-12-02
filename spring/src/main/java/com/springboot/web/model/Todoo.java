package com.springboot.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
//@Table(name = "Todoo")
public class Todoo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String user;
    private String descr;
    
    public Todoo() {}
    
    public Todoo(int id, String user, String descr, Date targetDate,
            boolean isDone) {
        super();
        this.id = id;
        this.user = user;
        this.descr = descr;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDesc() {
        return descr;
    }

    public void setDesc(String descr) {
        this.descr = descr;
    }


    @Override
    public String toString() {
        return String.format(
                "Todo [id=%s, user=%s, descr=%s]", id,
                user, descr);
    }

}