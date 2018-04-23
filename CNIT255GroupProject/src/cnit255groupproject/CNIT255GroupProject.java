/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cnit255groupproject;
import java.util.*;
import javax.swing.JOptionPane;


public class CNIT255GroupProject extends javax.swing.JFrame {

    // <editor-fold defaultstate="collapsed" desc="Classes">
    /**
    *
    * @author Andy
    */
    ArrayList<Message> MessageHistory = new ArrayList<>(1);
    ArrayList<User> AllUsers = new ArrayList<>(1);
    ArrayList<User> BannedUsers = new ArrayList<>(1);
    interface LoggedIn { //interface for the User list stuff
        void BanUser(String ID);
        void ShowUserList();
        void DisplayMessages();
    }
        
    public class Chatroom implements LoggedIn { //Chatroom class
        
        @Override
        public void BanUser(String Username){ //Ban a user
            for(int ctr = 0; ctr<AllUsers.size();ctr++) //loops through all users
            {
                if (Username.equals(AllUsers.get(ctr).getusername())) //checks if the supplied ID is the same as the User you want to ban. Might change it to not use ID
                {
                    AllUsers.get(ctr).setbannedStatus(false);//sets the user to banned
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
        String Content;
        
        public void setContent(String Message){
            Content = Message;
        }
        public String getContent(){
            return Content;
        }
    }
    
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
    public class Guest extends User{
        private String IDNumber;
    
        public String getIDNumber(){
            return IDNumber;
        }
        public void setIDNumber(String ID){
            IDNumber = ID;
        }
    }
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
    public class Admin extends Member{
        public void banUser(User del){
            del.setbannedStatus(true);
            Message banned = new Message();
            banned.setContent("User " + del.getusername() + " has been banned.");
            MessageHistory.add(banned);
        }
        public void unbanUser(User del){
            del.setbannedStatus(false);
            Message unbanned = new Message();
            unbanned.setContent("User " + del.getusername() + " has been unbanned.");
            MessageHistory.add(unbanned);
        }
        public void deleteMessage(Message bad){
            bad.setContent("Message has been deleted.");
            MessageHistory.add(bad);
        }
    }
    /**
 *
 * @author Will
 */
public class PersonalInfo {
    public class info {
	String email;
	String firstname;
	String lastname;
	String age;
	String streetAddress;
    	String streetAddress2;
    	String city;
    	String state;
    	String zipCode;
   	String country;

	
	public void infos(String first, String last, String em, String ag, String add1, String add2, String zip, String city1, String state1, String country1)
	{
		add1 = streetAddress;
        		add2 = streetAddress2;
        		city1 = city;
        		state1 = state;
        		zip =zipCode;
        		country1 = country;
		ag = age;
		em = email;
		first = firstname;
		last = lastname;
	}

	 public String getStreetAddress()
    	{
       		 return streetAddress;
    	}

   	 public void setStreetAddress(String add1)
   	 {
        	add1 = streetAddress;
   	 }
    	public String getStreetAddress2()
    	{
       	 return streetAddress2;
   	 }

   	 public void setStreetAddress2(String add2)
    	{
        	add2 = streetAddress2;
    	}
    	public String getCity()
    	{
      	  return city;
   	 }
    	public void setCity(String city1)
    	{
        	city1 = city;
  	  }
   	 public String getState()
    	{
       	 return state;
    	}
   	 public void setState(String state1)
    	{
        	state1 = state;
  	  }
    	public String getZipCode()
    	{
     	   return zipCode;
   	 }
    	public void setZipCode(String zip)
   	 {
        	zip = zipCode;
    	}
    	public String getCountry()
    	{
       	 return country;
  	  }
    	public void setCountry(String country1)
    	{
        	country1 = country;
    	}

	public String getLastName()
    	{
       	 return lastname;
    	}
    	public void setLastName(String last)
    	{
        	lastname = last;
    	}

    	public String getFirstName()
   	 {
        	return firstname;
   	 }
    	public void setFirstName(String first)
    	{
       	 firstname = first;
    	}
	public String getEmail()
	{
	return email;
	}
	public void setEmail(String em)
	{
	email = em;
	}
	
	public String getAge()
	{
	return age;
	}
	
	public void setAge(String ag)
	{
	age= ag;
	}
}
	

}

    // </editor-fold>
    //<editor-fold defaultstate="collapsed" desc="GUI">
/**
 *
 * @author Asa
 */
    public CNIT255GroupProject() {
        initComponents();
    }
    
    private void initComponents() {

        DExistingLogin = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LoginUsername = new javax.swing.JTextField();
        LoginPassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ExistingLogin = new javax.swing.JButton();
        ExistingCancel = new javax.swing.JButton();
        DGuestLogin = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        BGuestLogin = new javax.swing.JButton();
        GuestUsername = new javax.swing.JTextField();
        GuestCancel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        DNewUser = new javax.swing.JDialog();
        lblNewUsername = new javax.swing.JLabel();
        lblNewPassword = new javax.swing.JLabel();
        lblNewPasswordConfirm = new javax.swing.JLabel();
        NewUsername = new javax.swing.JTextField();
        NewPassword = new javax.swing.JTextField();
        NewConfirmPassword = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BCreate = new javax.swing.JButton();
        NewCancel = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        Age = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        WrongLogin = new javax.swing.JOptionPane();
        WrongInfo = new javax.swing.JOptionPane();
        Banned = new javax.swing.JOptionPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        Chatbox = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        Message = new javax.swing.JTextArea();
        Send = new javax.swing.JButton();
        LoginBar = new javax.swing.JMenuBar();
        Login = new javax.swing.JMenu();
        MenuMember = new javax.swing.JMenuItem();
        MenuGuest = new javax.swing.JMenuItem();
        MenuCreate = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Password");

        LoginUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginUsernameActionPerformed(evt);
            }
        });

        LoginPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginPasswordActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Login to get into chat!");

        ExistingLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ExistingLogin.setText("Login");
        ExistingLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExistingLoginActionPerformed(evt);
            }
        });

        ExistingCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ExistingCancel.setText("Cancel");
        ExistingCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExistingCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DExistingLoginLayout = new javax.swing.GroupLayout(DExistingLogin.getContentPane());
        DExistingLogin.getContentPane().setLayout(DExistingLoginLayout);
        DExistingLoginLayout.setHorizontalGroup(
            DExistingLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DExistingLoginLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(DExistingLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DExistingLoginLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DExistingLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(DExistingLoginLayout.createSequentialGroup()
                            .addComponent(ExistingLogin)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ExistingCancel))
                        .addGroup(DExistingLoginLayout.createSequentialGroup()
                            .addGroup(DExistingLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(DExistingLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LoginPassword)
                                .addComponent(LoginUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(38, 38, 38))
        );
        DExistingLoginLayout.setVerticalGroup(
            DExistingLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DExistingLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DExistingLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(DExistingLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(LoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DExistingLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExistingLogin)
                    .addComponent(ExistingCancel))
                .addGap(49, 49, 49))
        );

        DExistingLoginLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {LoginPassword, LoginUsername});

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Enter in a username ");

        BGuestLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BGuestLogin.setText("Guest Login");
        BGuestLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGuestLoginActionPerformed(evt);
            }
        });

        GuestUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        GuestCancel.setText("Cancel");
        GuestCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuestCancelActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("(with limited privileges)");

        javax.swing.GroupLayout DGuestLoginLayout = new javax.swing.GroupLayout(DGuestLogin.getContentPane());
        DGuestLogin.getContentPane().setLayout(DGuestLoginLayout);
        DGuestLoginLayout.setHorizontalGroup(
            DGuestLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DGuestLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DGuestLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(BGuestLogin)
                    .addComponent(GuestUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GuestCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DGuestLoginLayout.setVerticalGroup(
            DGuestLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DGuestLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(GuestUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BGuestLogin)
                .addGap(18, 18, 18)
                .addComponent(GuestCancel)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        lblNewUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNewUsername.setText("Username");

        lblNewPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNewPassword.setText("Password");

        lblNewPasswordConfirm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNewPasswordConfirm.setText("Confirm Password");

        NewUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewUsernameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Create your new account!");

        BCreate.setText("Create");
        BCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCreateActionPerformed(evt);
            }
        });

        NewCancel.setText("Cancel");
        NewCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewCancelActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblName.setText("Name");

        lblAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAddress.setText("Address");

        lblAge.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAge.setText("Age");

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEmail.setText("Email");

        javax.swing.GroupLayout DNewUserLayout = new javax.swing.GroupLayout(DNewUser.getContentPane());
        DNewUser.getContentPane().setLayout(DNewUserLayout);
        DNewUserLayout.setHorizontalGroup(
            DNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DNewUserLayout.createSequentialGroup()
                .addGroup(DNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DNewUserLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(DNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(DNewUserLayout.createSequentialGroup()
                                .addGroup(DNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNewPasswordConfirm)
                                    .addComponent(lblNewUsername)
                                    .addComponent(lblNewPassword)
                                    .addComponent(lblName)
                                    .addComponent(lblAddress)
                                    .addComponent(lblAge)
                                    .addComponent(lblEmail))
                                .addGap(18, 18, 18)
                                .addGroup(DNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NewPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                    .addComponent(NewConfirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(NewUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                    .addComponent(Name)
                                    .addComponent(Address)
                                    .addComponent(Age)
                                    .addComponent(Email, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(DNewUserLayout.createSequentialGroup()
                                .addComponent(BCreate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NewCancel))))
                    .addGroup(DNewUserLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel6)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        DNewUserLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {NewConfirmPassword, NewPassword, NewUsername});

        DNewUserLayout.setVerticalGroup(
            DNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DNewUserLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addGap(38, 38, 38)
                .addGroup(DNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNewUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(DNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNewPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(DNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BCreate)
                    .addComponent(NewCancel))
                .addGap(29, 29, 29))
        );

        DNewUserLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Address, Age, Email, Name, NewConfirmPassword, NewPassword, NewUsername});

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Chatbox.setEditable(false);
        Chatbox.setColumns(20);
        Chatbox.setLineWrap(true);
        Chatbox.setRows(5);
        jScrollPane1.setViewportView(Chatbox);

        Message.setColumns(20);
        Message.setRows(5);
        Message.setEnabled(false);
        jScrollPane4.setViewportView(Message);

        Send.setText("Send");
        Send.setEnabled(false);

        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        MenuMember.setText("Member Login");
        MenuMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMemberActionPerformed(evt);
            }
        });
        Login.add(MenuMember);

        MenuGuest.setText("Guest Login");
        MenuGuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuGuestActionPerformed(evt);
            }
        });
        Login.add(MenuGuest);

        MenuCreate.setText("Create Member");
        MenuCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCreateActionPerformed(evt);
            }
        });
        Login.add(MenuCreate);

        LoginBar.add(Login);

        jMenu2.setText("Logout");
        LoginBar.add(jMenu2);

        setJMenuBar(LoginBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addComponent(Send, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Send)
                .addGap(28, 28, 28))
        );

        pack();
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="GUI Variables">
    /**
 *
 * @author Asa
 */
    private javax.swing.JTextField Address;
    private javax.swing.JTextField Age;
    private javax.swing.JButton BCreate;
    private javax.swing.JButton BGuestLogin;
    private javax.swing.JOptionPane Banned;
    private javax.swing.JTextArea Chatbox;
    private javax.swing.JDialog DExistingLogin;
    private javax.swing.JDialog DGuestLogin;
    private javax.swing.JDialog DNewUser;
    private javax.swing.JTextField Email;
    private javax.swing.JButton ExistingCancel;
    private javax.swing.JButton ExistingLogin;
    private javax.swing.JButton GuestCancel;
    private javax.swing.JTextField GuestUsername;
    private javax.swing.JMenu Login;
    private javax.swing.JMenuBar LoginBar;
    private javax.swing.JTextField LoginPassword;
    private javax.swing.JTextField LoginUsername;
    private javax.swing.JMenuItem MenuCreate;
    private javax.swing.JMenuItem MenuGuest;
    private javax.swing.JMenuItem MenuMember;
    private javax.swing.JTextArea Message;
    private javax.swing.JTextField Name;
    private javax.swing.JButton NewCancel;
    private javax.swing.JTextField NewConfirmPassword;
    private javax.swing.JTextField NewPassword;
    private javax.swing.JTextField NewUsername;
    private javax.swing.JButton Send;
    private javax.swing.JOptionPane WrongInfo;
    private javax.swing.JOptionPane WrongLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNewPassword;
    private javax.swing.JLabel lblNewPasswordConfirm;
    private javax.swing.JLabel lblNewUsername;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="GUI Button Presses">
    /**
 *
 * @author Asa
 */
    private void LoginUsernameActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    
    private void LoginPasswordActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    
    private void ExistingCancelActionPerformed(java.awt.event.ActionEvent evt) {
        DExistingLogin.dispose();
    }
    
    private void BGuestLoginActionPerformed(java.awt.event.ActionEvent evt) {
        WrongInfo.showMessageDialog(this, "Enter In Real Errors later");
    }
    
    private void GuestCancelActionPerformed(java.awt.event.ActionEvent evt) {
        DGuestLogin.dispose();
    }
    
    private void ExistingLoginActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        WrongLogin.showMessageDialog(this,"Wrong Username or Password");
        
    }
    
    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {
        
    }
    
    private void MenuMemberActionPerformed(java.awt.event.ActionEvent evt) {
        DExistingLogin.pack();
        DExistingLogin.setSize(345,255);
        DExistingLogin.setVisible(true);
    }
    
    private void MenuGuestActionPerformed(java.awt.event.ActionEvent evt) {
        DGuestLogin.pack();
        DGuestLogin.setSize(215,255);
        DGuestLogin.setVisible(true);
    }
    
    private void NewUsernameActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    
    private void NewCancelActionPerformed(java.awt.event.ActionEvent evt) {
        DNewUser.dispose();
    }
    
    private void MenuCreateActionPerformed(java.awt.event.ActionEvent evt) {
        DNewUser.pack();
        DNewUser.setSize(355,500);
        DNewUser.setVisible(true);
    }
    
    private void BCreateActionPerformed(java.awt.event.ActionEvent evt) {
        WrongInfo.showMessageDialog(this, "Enter In Real Errors later");
    }
//</editor-fold>
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //main method. Should just run the GUI?
        
    }
    
}
