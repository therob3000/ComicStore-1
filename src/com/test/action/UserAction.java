package com.test.action;
/**
 * Created with IntelliJ IDEA.
 * User: kenchiang
 * Date: 2013/4/12
 * Time: 下午 4:08
 * To change this template use File | Settings | File Templates.
 */
public class UserAction {
   private String username;
    private String password;

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
    public String execute()
    {
        return "success";
    }
}