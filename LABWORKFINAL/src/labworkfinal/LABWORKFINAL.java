
package labworkfinal;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class LABWORKFINAL {
    LABWORKFINAL(){
        JFrame f=new JFrame("Databae Operation");
        
        JLabel lblRollno =new JLabel("Rollno");
        lblRollno.setBounds(10,10,150,20);
        f.add(lblRollno);
        
        JTextField txtRollno = new JTextField();
        txtRollno.setBounds(150,10,150,20);
        f.add(txtRollno);
        
        JButton btnInsert = new JButton("Insert");
        btnInsert.setBounds(10,40,150,20);
        f.add(btnInsert);
        

        JLabel Message = new JLabel("");
        Message.setBounds(120,70,150,20);
        f.add(Message);
        
        f.setSize(400,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);

        
        btnInsert.addActionListener(new ActionListener()
        {
            public  void actionPerformed(ActionEvent e)
            {
                try{
                     Class.forName( "com.mysql.cj.jdbc.Driver" ); // do this in init
                     Connection conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/lab_work", "root","");
                        String sql = "insert into student(roll_no,name,address) values(?,?,?)";
                        PreparedStatement ptmt = conn.prepareStatement(sql);
                        ptmt.setInt(1,Integer.parseInt(txtRollno.getText()));
                        String name = "Roshan";
                        String add = "kawasoti";
                        ptmt.setString(2,name);
                        ptmt.setString(3,add);
                        ptmt.executeUpdate();
                        String err = "Data Inserted";
                        Message.setText(""+err);
                }catch(Exception ex){
                    String err = "Error in operation";
                    Message.setText(""+err);
                    JOptionPane.showMessageDialog(null, ex);
                }

            }
        });
    }
    
    
    public static void main(String args[]){
        new LABWORKFINAL();
    }
    
}
