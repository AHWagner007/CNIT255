/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cnit255groupproject;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Andy
 */
public class CNIT255GroupProject {

    // <editor-fold defaultstate="collapsed" desc="Classes">
    interface LoggedIn { //interface for the User list stuff
        void BanUser(String ID);
        void ShowUserList();
        void DisplayMessages();
    }
        
    public class Chatroom implements LoggedIn { //Chatroom class
        ArrayList<Message> MessageHistory = new ArrayList<>(1);
        ArrayList<User> AllUsers = new ArrayList<>(1);
        ArrayList<User> BannedUsers = new ArrayList<>(1);
        
        @Override
        public void BanUser(String ID){ //Ban a user
            for(int ctr = 0; ctr<AllUsers.size();ctr++) //loops through all users
            {
                if (ID.equals(AllUsers.get(ctr).getID())) //checks if the supplied ID is the same as the User you want to ban. Might change it to not use ID
                {
                    BannedUsers.add(AllUsers.get(ctr)); //Adds banned dude to ban list
                    AllUsers.remove(AllUsers.get(ctr)); //Removes banned dude from user list. Might nix this line later.
                    JOptionPane.showMessageDialog(null, "User Successfully Banned.", "Got Him.", JOptionPane.WARNING_MESSAGE); //informs of a successful ban.
                    return; //ends method
                }
            }
            JOptionPane.showMessageDialog(null, "No User Found.", "Nope.", JOptionPane.WARNING_MESSAGE); //informs there was no user found.
        }
        @Override
        public void ShowUserList(){ //runs a loop to show the user list
            for (int ctr = 0; ctr<AllUsers.size(); ctr++)
            {
                //Once there's a GUI I'll add code to just show all the users
            }
        }
        @Override
        public void DisplayMessages(){
            for (int ctr = 0; ctr<MessageHistory.size();ctr++)
            {
                //will also get code. Will do pretty much what ShowUserList does, just showing Messages/Who sent it
            }
        }
        
    }
        
    public class Message { //empty (for now) message class. need the shell at least for the MessageHistory Array List
        
    }
    
    public class User{
        protected String ID; // a temporary ID
        
        public void setID(String NewID){
            ID = NewID;
        }
        public String getID(){
            return ID;
        }
    }
    // </editor-fold>
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //main method. Should just run the GUI?
        
    }
    
}
