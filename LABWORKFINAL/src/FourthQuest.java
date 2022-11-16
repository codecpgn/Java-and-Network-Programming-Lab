import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class FourthQuest
{
FourthQuest()
{
 JFrame f=new JFrame();
 
 JLabel lblRollno=new JLabel("Roll Number");
 lblRollno.setBounds(10, 10, 150, 20);
 f.add(lblRollno);
 
 JTextField txtRollno=new JTextField();
 txtRollno.setBounds(100, 10, 150, 20);
 f.add(txtRollno);
 
 JLabel lblName=new JLabel("Name");
 lblName.setBounds(10, 40, 150, 20);
 f.add(lblName);
 
 JTextField txtName=new JTextField();
 txtName.setBounds(100, 40, 150, 20);
 f.add(txtName);
 
 JLabel lblAddress=new JLabel("Address");
 lblAddress.setBounds(10, 70, 150, 20);
 f.add(lblAddress);
 
 JTextField txtAddress=new JTextField();
 txtAddress.setBounds(100, 70, 150, 20);
 f.add(txtAddress);
 
 JButton btnInsert=new JButton("Insert");
 btnInsert.setBounds(20, 110, 80, 20);
 f.add(btnInsert);

 JButton btnUpdate=new JButton("Update");
 btnUpdate.setBounds(110, 110, 80, 20);
 f.add(btnUpdate);
 
 JButton btnSearch=new JButton("Search");
 btnSearch.setBounds(290, 110, 80, 20);
 f.add(btnSearch);
 
JLabel lblMessage=new JLabel("Message");
lblMessage.setBounds(10, 150, 150, 20);
f.add(lblMessage);
 
 btnInsert.addActionListener(new ActionListener()
 {
 public void actionPerformed(ActionEvent e)
 {
    try
    {
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lab_work","root","");
       String sql="Insert into dbtest(ID,rollno,name,address) values(NULL,?,?,?)";
       PreparedStatement ptmt=conn.prepareStatement(sql);
       ptmt.setInt(1,Integer.parseInt(txtRollno.getText()));
       ptmt.setString(2, txtName.getText());
       ptmt.setString(3, txtAddress.getText());
       ptmt.executeUpdate();
       if(ptmt.getUpdateCount()>0){
        lblMessage.setText(""+"Data inserted");
       }
       conn.close();      
    }
    catch(Exception E)
    {
       lblMessage.setText(""+"Error");
    }
 }
 }
 );
 
 btnUpdate.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent e){
         
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://locakhost/lab_work","root","");
//            String sql = "update dbtest set rollno=?,name=?,address=? where rollno=?";
            String sql = "update dbtest set name=? where rollno=?";
            PreparedStatement ptmt=conn.prepareStatement(sql);
            ptmt.setString(1,"hello");
            ptmt.setInt(2,12);
            
//            ptmt.setInt(1,Integer.parseInt(txtRollno.getText()));
//            ptmt.setString(2, txtName.getText());
//            ptmt.setString(3, txtAddress.getText());
//            ptmt.setInt(4,Integer.parseInt(txtRollno.getText()));
            ptmt.executeUpdate();
//            if(ptmt.getUpdateCount()>0){
//             lblMessage.setText(""+"Data Updated");
//            }
            conn.close();
         }
         catch(Exception E){
             lblMessage.setText(""+"Error");
              JOptionPane.showMessageDialog(null, E);
         }
  
     }});
 
 f.setSize(400,500);
 f.setLayout(null);
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 f.setVisible(true);
}
public static void main(String args[])
{
 new FourthQuest();
}
}