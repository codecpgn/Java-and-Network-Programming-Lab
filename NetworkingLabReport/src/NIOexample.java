import java.io.*;
import java.nio.*;
import java.nio.channels.FileChannel;

public class NIOexample{
    public static void main(String[] args) throws IOException{
        FileOutputStream fout = new FileOutputStream("C:\\\\Users\\\\kcros\\\\OneDrive\\\\Desktop\\\\BCA\\\\6th-SEM\\\\Networking\\\\report_output\\\\w_r.txt");
        FileChannel writeChannle = fout.getChannel();
        ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
        String message = "Write this in w_r text file";
        writeBuffer.put(message.getBytes());
        writeBuffer.flip();
        writeChannle.write(writeBuffer);
        System.out.println("data written");
          
        FileInputStream fin = new FileInputStream("C:\\\\Users\\\\kcros\\\\OneDrive\\\\Desktop\\\\BCA\\\\6th-SEM\\\\Networking\\\\report_output\\\\w_r.txt");
        FileChannel readChannel = fin.getChannel();
        ByteBuffer readBuffer = ByteBuffer.allocate(1024);
        int result = readChannel.read(readBuffer);
//        System.out.println(result);
        
        while(result > 0 ){
            readBuffer.flip();
            while(readBuffer.hasRemaining()){
                System.out.print((char) readBuffer.get());
            }
            System.out.println("");
            break;
        }
        fin.close();

    }
}