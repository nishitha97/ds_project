package com.distributedsystems.assignment2.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Domain class for Session object
 */
@Document(collection = "sessions")
public class Session {
    @Id
    private String id;

    private String username;

    private String password;

    private Date loggedIn=new Date();

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

    public Date getLoggedIn() {
        return loggedIn;
    }

}
