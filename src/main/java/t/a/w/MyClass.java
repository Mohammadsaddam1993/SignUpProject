package t.a.w;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyClass extends HttpServlet {

	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		PrintWriter po=res.getWriter();
		
		String e=req.getParameter("email");
		String p=req.getParameter("pass");
		String ad1=req.getParameter("ad1");
		String ad2=req.getParameter("ad2");
		String c=req.getParameter("city");
		String s=req.getParameter("state");
		String z=req.getParameter("zip");
		
		
		po.println("Your Email is is "+e);
		po.println("Your Password is "+p);
		po.println("Your Address 1  is "+ad1);
		po.println("Your Address 2 is "+ad2);
		po.println("Your Live in "+c);
		po.println("Your State is "+s);
		po.println("Your Zip code is "+z);
	
	}
}
