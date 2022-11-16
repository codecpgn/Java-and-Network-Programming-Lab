import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EligibleForVote {
   
    EligibleForVote(){
        JFrame f = new JFrame("Vote Age Test");
        
        JLabel lblFirstnum = new JLabel("Enter age : ");
        lblFirstnum.setBounds(10,10,150,20);
        f.add(lblFirstnum);
        
        JTextField txtFirstNumber = new JTextField("");
        txtFirstNumber.setBounds(120,10,150,20);
        f.add(txtFirstNumber);
        
        JButton button_sum =new JButton("Check");
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
                int age = Integer.parseInt(txtFirstNumber.getText());
                if(age < 18 )
                    Field_result.setText(""+"Not elligible");
                else
                    Field_result.setText(""+"elligible for Vote");
            }
        }              
        );
                    
       
    }
    public static void main(String[] args){
        EligibleForVote n = new EligibleForVote();
    }
    

}
