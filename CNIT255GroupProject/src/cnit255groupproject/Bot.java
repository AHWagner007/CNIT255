/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lawrence Hiday
 */
public class Bot extends User{
    protected String name;
    protected String function;
    
    public String getname(){
        return name;
    }
    public void setname(String botname){
        name = botname;
    }
    public String getfunction(){
        return function;
    }
    public void setfunction(String whatdo){
        function = whatdo;
    }
}
