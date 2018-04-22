/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lawrence Hiday
 */
public class Guest extends User{
    private String IDNumber;
    
    public String getIDNumber(){
        return IDNumber;
    }
    public void setIDNumber(String ID){
        IDNumber = ID;
    }
}
