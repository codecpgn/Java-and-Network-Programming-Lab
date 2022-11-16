import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

@WebServlet(urlPatterns = {"/SaveBook"})
public class SaveBook extends HttpServlet {
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   
//id	isbn	title	author
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    String isbn = request.getParameter("isbn");
    String title = request.getParameter("title");
    String author = request.getParameter("author");
    
       try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lab_work","root","");
            String sql="insert into book(id,isbn,title,author) values(NULL,?,?,?)";
            PreparedStatement ptmt=conn.prepareStatement(sql);
            ptmt.setString(1,isbn);
            ptmt.setString(2, title);
            ptmt.setString(3, author);
            ptmt.executeUpdate();
            if(ptmt.getUpdateCount()>0){
                out.println("Book inserted");
            }
            
            conn.close();
       } catch (Exception ex) {
//           out.println("There was in error in connection in databse");
            out.println(ex);
       }  
    }
}
