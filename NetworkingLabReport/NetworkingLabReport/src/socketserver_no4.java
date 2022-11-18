//no 4 TCP
//package Np;
import java.io.*;
import java.net.*;

public class socketserver_no4 {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(9000);//step-1
        Socket s = ss.accept();
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        String str1 = "";
        while (!str1.equals("stop")) {
            str = din.readUTF();//reading reply of client
            System.out.println("Server Says: " + str);
            str1 = br.readLine();
            dos.writeUTF(str1);//sending the reply
        }
        s.close();
        ss.close();
    }
}