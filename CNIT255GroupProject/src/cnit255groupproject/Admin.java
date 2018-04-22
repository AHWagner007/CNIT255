/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lawrence Hiday
 */
public class Admin extends Member{
    public void banUser(User del){
        del.setbannedStatus(true);
        Message banned = new Message();
        banned.setcontent("User " + del.getusername() + " has been banned.");
    }
    public void unbanUser(User del){
        del.setbannedStatus(false);
        Message unbanned = new Message();
        unbanned.setcontent("User " + del.getusername() + " has been unbanned.");
    }
    public void deleteMessage(Message bad){
        bad.setcontent("Message has been deleted.");
    }
}
