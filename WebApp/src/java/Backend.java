
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

public class Backend extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    PrintWriter out = response.getWriter();
    int num;
    num = Integer.parseInt(request.getParameter("Firstno"));
    float fact=1;
    for(int i=1;i<=num;i++){
        fact = fact*i;
    }
//    out.println("<!DOCTYPE html>");
//    out.println("<html>");
//    out.println("<head>");
//    out.println("<title>Servlet CookieServletBackend</title>");            
//    out.println("</head>");
//    out.println("<body>");

    response.setContentType("text/html");
    out.print("The factorial of " + num + " is " + fact);
    Cookie[] cookies = request.getCookies();
    if(cookies!=null){
        out.print("<p> First_name_from_cookie : "+cookies[0].getValue()+"</p>");
        out.print("<p> Last_name_from_cookie : "+cookies[1].getValue()+"</p>");
    }
//    out.println("</body>");
//    out.println("</html>");
    out.close();
    }
}
