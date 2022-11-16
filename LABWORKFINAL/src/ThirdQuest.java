import javax.swing.*;
import java.awt.*;

public class ThirdQuest {
    ThirdQuest(){
        JFrame fobj= new JFrame("Form");
        
        JLabel lblName =new JLabel("Name : ");
        lblName.setBounds(10,10,150,20);
        fobj.add(lblName);

        JTextField txtName =new JTextField("");
        txtName.setBounds(80,10,150,20);
        fobj.add(txtName);
        
        JLabel lblAdd =new JLabel("Address : ");
        lblAdd.setBounds(10,40,150,20);
        fobj.add(lblAdd);

        JTextArea txtAdd =new JTextArea("");
        txtAdd.setBounds(80,40,150,100);
        fobj.add(txtAdd);        
        
        JLabel lblSub =new JLabel("Subject ");
        lblSub.setBounds(10,150,60,40);
        fobj.add(lblSub);
        
        CheckboxGroup gc = new CheckboxGroup();  
        Checkbox MP = new Checkbox("Mobile Programming",gc,false);    
        Checkbox AJ = new Checkbox("Advance Java",gc,false);
        Checkbox NP = new Checkbox("Network Programming",gc,false);
        Checkbox AE = new Checkbox("Applied Economics",gc,false);
        Checkbox DS = new Checkbox("Distributed System",gc,false);
        
        MP.setBounds(80,150,160,20);
        AJ.setBounds(80,180,160,20);
        NP.setBounds(80,210,160,20);
        AE.setBounds(80,240,160,20);
        DS.setBounds(80,270,160,20);
        fobj.add(MP);
        fobj.add(AJ);
        fobj.add(NP);
        fobj.add(AE);
        fobj.add(DS);
        
        
        JLabel lblprog = new JLabel("Program");
        lblprog.setBounds(10,290,50,40);
        fobj.add(lblprog);
        JRadioButton b1 = new JRadioButton("BCA");
        b1.setBounds(80,290,60,40);
        fobj.add(b1);
        JRadioButton b2 = new JRadioButton("BBS");
        b2.setBounds(150,290,50,40);
        fobj.add(b2);        

        
        JLabel lblclg = new JLabel("College");
        lblclg.setBounds(10,330,50,40);
        fobj.add(lblclg);

        String[] College = { "Sungava College",
                "Indreni College",
                 "Saptagandaki College",
                 "Birendra College",
                 "Sahid Smarak College",
                };
        JComboBox College_List = new JComboBox(College);
        College_List.setBounds(80,340,150,20);
        fobj.add(College_List);
        
        JButton btnok = new JButton("Ok");
        btnok.setBounds(10,370,80,20);
        fobj.add(btnok);
        
        JButton btncancle = new JButton("Cancle");
        btncancle.setBounds(100,370,90,20);
        fobj.add(btncancle);
        
        fobj.setSize(400,600);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fobj.setLayout(null);
        fobj.setVisible(true);

    }
    
    public static void main(String args[]){
        new ThirdQuest();
    }
    
}
