
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author CodieBruh
 */
public class Sqyare {
    
    Sqyare(){
        JFrame f = new JFrame("Address");
        
        JLabel lblFirstnum = new JLabel("Enter a  Number : ");
        lblFirstnum.setBounds(10,10,150,20);
        f.add(lblFirstnum);
        
        JTextField txtFirstNumber = new JTextField("");
        txtFirstNumber.setBounds(120,10,150,20);
        f.add(txtFirstNumber);
        
        JButton button_sum =new JButton("Sqaure");
        button_sum.setBounds(120,35,150,20);
        f.add(button_sum);
        
        
        JLabel Field_result = new JLabel("");
        Field_result.setBounds(120,70,150,20);
        f.add(Field_result);
        
        f.setSize(400,500);;
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        button_sum.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae){
                int a = Integer.parseInt(txtFirstNumber.getText());
                int c=a*a;
                System.out.print(c);
                Field_result.setText(""+c);
            }
        }              
        );
                    
       
    }
    public static void main(String[] args){
        Sqyare n = new Sqyare();
    }
    
}