//1. Write a program to display a login form containing user id, password, account type
//and OK button. Account type must be admin or user.

import javax.swing.*;
import java.awt.event.*;

public class FirstQues {
    FirstQues(){
        
        JFrame f=new JFrame("Login Form");
        
        JLabel lbluserid =new JLabel("user id : ");
        lbluserid.setBounds(10,10,150,20);
        f.add(lbluserid);
        
        JTextField fielduserid = new JTextField("");
        fielduserid.setBounds(100,10,150,20);
        f.add(fielduserid);
        
        JLabel lblPass =new JLabel("password : ");
        lblPass.setBounds(10,40,150,20);
        f.add(lblPass);
        
        JTextField fieldpass = new JTextField("");
        fieldpass.setBounds(100,40,150,20);
        f.add(fieldpass);
        
        String[] account_type = { "Admin", "user"};
        JComboBox account_type_list = new JComboBox(account_type);
        account_type_list.setBounds(10,70,150,20);
        f.add(account_type_list);
        
        JButton btnsubmit = new JButton("OK");
        btnsubmit.setBounds(10,100,150,20);
        f.add(btnsubmit);
        
        f.setSize(400,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
    
      public static void main(String args[]){
        new FirstQues();
    }
    
}
