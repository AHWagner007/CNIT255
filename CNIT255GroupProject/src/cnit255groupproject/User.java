/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lawrence Hiday
 */
public class User {
    protected String username;
    protected boolean bannedStatus = false;
    protected boolean privateMessageAccess = false;
    
    //User(String name){
    //    username = name;
    //}
    
    public String getusername(){
        return username;
    }
    public boolean getbannedStatus(){
        return bannedStatus;
    }
    public boolean getprivateMessageAccess(){
        return privateMessageAccess;
    }
    public void setusername(String name){
        username = name;
    }
    public void setbannedStatus(boolean ban){
        bannedStatus = ban;
    }
    public void setprivateMessageAccess(boolean pm){
        privateMessageAccess = pm;
    }
}
