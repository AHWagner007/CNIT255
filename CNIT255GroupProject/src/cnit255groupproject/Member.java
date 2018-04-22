/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lawrence Hiday
 */
public class Member extends User{
    protected String password;
    protected boolean logged;
    
    public String getpassword(){
        return password;
    }
    public boolean getlogged(){
        return logged;
    }
    public void setpassword(String pass){
        password = pass;
    }
    public void setlogged(boolean log){
        logged = log;
    }    
}
