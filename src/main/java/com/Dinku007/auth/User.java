package com.Dinku007.auth;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Anand SN
 */

@Table(name = "USER")
@Entity
public class User {

    @Id
    @Column(name = "USER_ID")
    private long id;

    @Column(name = "USERNAME",nullable = false, unique = true)
    private String username;

    @Column(name = "PASSWORD",nullable = false)
    private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
