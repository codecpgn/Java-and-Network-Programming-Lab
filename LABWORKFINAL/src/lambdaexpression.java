import java.util.ArrayList;

public class lambdaexpression {
 public static void main(String[] args){
    ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
    list.add("Mango");
    list.add("Apple");    
    list.forEach(i -> System.out.println(i));
   }
}
