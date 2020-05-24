package xyz;
import java.net.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class bbb extends HttpServlet
{
public void doGet(HttpServletRequest rq,HttpServletResponse rs)
{
try
{
Cookie c[]=rq.getCookies();
String nn=" ";
String ss=" ";
String cc=" ";
if(c!=null)
{
for(Cookie r:c)
{
if(r.getName().equals("nm"))
{
nn=r.getValue();
}else if(r.getName().equals("ct"))
{
cc=r.getValue();
}else if(r.getName().equals("sex"))
{
ss=r.getValue();
}
}
}
System.out.println("Request arrived");
System.out.println("Data arrived");
System.out.println("Name : "+nn);
System.out.println("Gender : "+ss);
System.out.println("City :"+cc);
rs.setContentType("text/html");
PrintWriter pw;
pw=rs.getWriter();

pw.println("<!Doctype html>");
pw.println("<html l ang='en'>");
pw.println("<head>");
pw.println("<meta charset='utf-8'>");
pw.println("<title>three.com</title>");
pw.println("</head>");
pw.println("<body>");
pw.println("<center>");
pw.println("<h1>Session Tracking Example</h1>");
pw.println("<h4><u>Using Cookies</u></h4>");
pw.println("<h1>Data Saved </h1></body></html>");
pw.println("Name :"+nn+"</br>");
pw.println("Gender :"+ss+"</br>");
pw.println("City :"+cc+"</br>");

pw.println("</center>");
}catch(Exception exception)
{
System.out.println(exception);
}
}
}