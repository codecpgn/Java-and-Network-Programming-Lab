import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class CRUD_QUEST
{
CRUD_QUEST()
{
 JFrame f=new JFrame();
 
 JLabel lblemployeeid=new JLabel("Employee Id");
 lblemployeeid.setBounds(10, 10, 150, 20);
 f.add(lblemployeeid);
 
 JTextField txtemployeeid=new JTextField();
 txtemployeeid.setBounds(100, 10, 150, 20);
 f.add(txtemployeeid);
 
 JLabel lblName=new JLabel("Name");
 lblName.setBounds(10, 40, 150, 20);
 f.add(lblName);
 
 JTextField txtName=new JTextField();
 txtName.setBounds(100, 40, 150, 20);
 f.add(txtName);
 
 JLabel lblsalary=new JLabel("Salary");
 lblsalary.setBounds(10, 70, 150, 20);
 f.add(lblsalary);
 
 JTextField txtsalary=new JTextField();
 txtsalary.setBounds(100, 70, 150, 20);
 f.add(txtsalary);
 
 JButton btnInsert=new JButton("Insert");
 btnInsert.setBounds(20, 110, 80, 20);
 f.add(btnInsert);

JButton btnupdate =new JButton("Update");
btnupdate.setBounds(110, 110, 80, 20);
f.add(btnupdate);

JButton btndelete =new JButton("Delete");
btndelete.setBounds(200, 110, 80, 20);
f.add(btndelete);

JButton btnsearch =new JButton("Search");
btnsearch.setBounds(290, 110, 80, 20);
f.add(btnsearch);

JButton btnCancel=new JButton("Cancel");
btnCancel.setBounds(15,140, 80, 20);
f.add(btnCancel);
btnCancel.addActionListener(new ActionListener()
    {
     public void actionPerformed(ActionEvent ce) 
     {
         txtemployeeid.setText("");
         txtName.setText("");
         txtsalary.setText("");
         f.dispose();//refreshing
         f.setVisible(true);
     }
    }
    );
JLabel Message = new JLabel("");
Message.setBounds(20,230,200,20);
f.add(Message);
JLabel s1 = new JLabel("Searched Data");
s1.setBounds(20,210,200,20);
f.add(s1);
JLabel r1 = new JLabel("");
r1.setBounds(20,230,200,20);
f.add(r1);
JLabel r2 = new JLabel("");
r2.setBounds(20,250,200,20);
f.add(r2);
JLabel r3 = new JLabel("");
r3.setBounds(20,270,200,20);
f.add(r3);
 btnInsert.addActionListener(new ActionListener()
 {
    public void actionPerformed(ActionEvent e)
    {
        try
        {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lab_work","root","");
           String sql="Insert into employee(id,employee_id,name,salary) values(NULL,?,?,?)";
           PreparedStatement ptmt=conn.prepareStatement(sql);
           ptmt.setInt(1,Integer.parseInt(txtemployeeid.getText()));
           ptmt.setString(2, txtName.getText());
           ptmt.setInt(3,Integer.parseInt(txtsalary.getText()));
           ptmt.executeUpdate();
           if(ptmt.getUpdateCount()>0){
            JOptionPane.showMessageDialog(null,"Data inserted Successfully");
           }
        String err = "Data Inserted";
        Message.setText(""+err);
        conn.close();
        }
        catch(Exception E)
        {
            String err = "Something went wrong";
            Message.setText(""+err);
//            JOptionPane.showMessageDialog(null, e);
        }
        }
        }
    );
  btnsearch.addActionListener(new ActionListener()
 {
    public void actionPerformed(ActionEvent e)
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab_work","root","");
            String sql="select * from employee where employee_id=?";
            PreparedStatement ptmt=conn.prepareStatement(sql);
            ptmt.setInt(1,Integer.parseInt(txtemployeeid.getText()));
            ResultSet result_data = ptmt.executeQuery();
            if(result_data.next()){
                r1.setText("Employee Id : "+result_data.getInt("employee_id"));
                r2.setText("Name : "+result_data.getString("name"));
                r3.setText("Salary : "+result_data.getInt("salary"));
            }
        }catch(Exception errs)
        {
            JOptionPane.showMessageDialog(null, errs);
            String err = "Something went wrong";
            Message.setText(""+err);
        }
        
    }
    }
);

 btndelete.addActionListener(new ActionListener()
 {
    public void actionPerformed(ActionEvent e)
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab_work","root","");
            String sql="delete from employee where employee_id=?";
            PreparedStatement ptmt=conn.prepareStatement(sql);
            ptmt.setInt(1,Integer.parseInt(txtemployeeid.getText()));
            ptmt.executeUpdate();
            String err = "Data Deleted";
            Message.setText(""+err);
        }catch(Exception errs)
        {
//            JOptionPane.showMessageDialog(null, errs);
            String err = "Something went wrong";
            Message.setText(""+err);
        }
        
    }
    }
);

 btnupdate.addActionListener(new ActionListener()
 {
    public void actionPerformed(ActionEvent e)
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab_work","root","");
            String sql="update employee set name=?,salary=? where employee_id=?";
            PreparedStatement ptmt=conn.prepareStatement(sql);
            ptmt.setString(1,txtName.getText());
            ptmt.setInt(2,Integer.parseInt(txtsalary.getText()));
            ptmt.setInt(3,Integer.parseInt(txtemployeeid.getText()));
            ptmt.executeUpdate();
            String err = "Data Updated";
            Message.setText(""+err);
        }catch(Exception errs)
        {
            JOptionPane.showMessageDialog(null, errs);
            String err = "Something went wrong";
            Message.setText(""+err);
        }
        
    }
    }
);
 f.setSize(400,500);
 f.setLayout(null);
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 f.setVisible(true);
}
public static void main(String args[])
{
 new CRUD_QUEST();
}
}