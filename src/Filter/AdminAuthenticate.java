package Filter;




import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import Services.AdminService;
import com.sun.jersey.core.util.Base64;

@WebFilter("/service/Admin/*")
public class AdminAuthenticate implements Filter{
	

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		String a = httpRequest.getHeader("Authorization");
		
		AdminService adminService = new AdminService();
		
		if(a != null){
			a = a.replaceAll("Basic ", "");
			String decode = Base64.base64Decode(a);
			
			StringTokenizer tok = new StringTokenizer(decode,":");
			String username = tok.nextToken();
			String password = tok.nextToken();
			
			if(adminService.loginAdmin(username, password)){
				chain.doFilter(request, response);
			}
		}
 

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("Vous n'avez pas l'acces");
		out.close();
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
