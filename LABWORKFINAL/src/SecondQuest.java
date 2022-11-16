//2. Write a program with three text boxes First Number, Second Number, and Result and
//Four buttons add, subtract, multiply and divide. Handle the events to perform the
//required operation and display result.

import javax.swing.*;
import java.awt.event.*;

public class SecondQuest {
    SecondQuest(){
        JFrame frameobj = new JFrame("Add/Sub/multi/div");
        
        JLabel lblfirstno =new JLabel("First Number : ");
        lblfirstno.setBounds(10,10,150,20);
        frameobj.add(lblfirstno);

        JTextField txtfirstno =new JTextField("");
        txtfirstno.setBounds(150,10,150,20);
        frameobj.add(txtfirstno);
        
        JLabel lblsecondno =new JLabel("Second Number : ");
        lblsecondno.setBounds(10,40,150,20);
        frameobj.add(lblsecondno);

        JTextField txtsecondno =new JTextField("");
        txtsecondno.setBounds(150,40,150,20);
        frameobj.add(txtsecondno);
        
        JButton btnAdd = new JButton("Add");
        btnAdd.setBounds(10,70,150,20);
        btnAdd.setSize(70, 30);
        frameobj.add(btnAdd);
        
        
        JButton btnSub = new JButton("Sub");
        btnSub.setBounds(100,70,150,20);
        btnSub.setSize(70, 30);
        frameobj.add(btnSub);
        
        JButton btnMul = new JButton("Multiply");
        btnMul.setBounds(180,70,150,20);
        btnMul.setSize(100, 30);
        frameobj.add(btnMul);
        
        JButton btnDiv = new JButton("Divide");
        btnDiv.setBounds(300,70,150,20);
        btnDiv.setSize(70, 30);
        frameobj.add(btnDiv);
        
        JLabel lblRslt =new JLabel("Result : ");
        lblRslt.setBounds(10,110,150,20);
        frameobj.add(lblRslt);

        JLabel txtfinalresult =new JLabel("");
        txtfinalresult.setBounds(80,110,150,20);
        frameobj.add(txtfinalresult);
        
       
        frameobj.setSize(500,500);
        frameobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameobj.setLayout(null);
        frameobj.setVisible(true);
        
        btnAdd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int FirstNo = Integer.parseInt(txtfirstno.getText());
                int SecondNo = Integer.parseInt(txtsecondno.getText());
                int rslt = FirstNo+SecondNo;
                txtfinalresult.setText(""+rslt);
            }
        });
        btnSub.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int FirstNo = Integer.parseInt(txtfirstno.getText());
                int SecondNo = Integer.parseInt(txtsecondno.getText());
                int rslt = FirstNo-SecondNo;
                txtfinalresult.setText(""+rslt);
            }
        });
        
        btnMul.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int FirstNo = Integer.parseInt(txtfirstno.getText());
                int SecondNo = Integer.parseInt(txtsecondno.getText());
                int rslt = FirstNo*SecondNo;
                txtfinalresult.setText(""+rslt);
            }
        });
        btnDiv.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int FirstNo = Integer.parseInt(txtfirstno.getText());
                int SecondNo = Integer.parseInt(txtsecondno.getText());
                int rslt = FirstNo/SecondNo;
                txtfinalresult.setText(""+rslt);
            }
        });
    }
    
    public static void main(String args[]){
        new SecondQuest();
    }
}
