package org.generics.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//You can configure one or multiple paths can access this Servlet
/**
 * Catch errors at compile time with Generics and not to Runtime
 * 
 * @author ovidiu.dragoi
 *
 */
@WebServlet(urlPatterns = { "/test" })
public class TestServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String emailSupport2 = this.getServletConfig().getInitParameter("emailSupport2");

		ServletOutputStream out = response.getOutputStream();

		List<String> listG = new ArrayList<>();

		List list = new ArrayList();
		list.add("String");
		list.add("another s");

		String s = (String) list.get(0);

		Map<String, List<String>> aMap = new HashMap<>();
		aMap.put("d", list);

		out.println("<html>");
		out.println("<head><title>Init Param</title></head>");
		out.println("<body>");
		out.println("<h3>Servlet with Annotation configuration</h3>");
		out.println("<p>emailSupport2 = " + emailSupport2 + "</p>");
		
		//Generic Type Instantiation
		IPair<String, String> p1 = new OrderedPair<String, String>("akey", "avalue");
		IPair<String, String> p2 = new OrderedPair<>("fsdf", "aValue");
		
		//Generic Method
		boolean compare = Util.compare(p1, p2);
		
		out.println("Is equal = " + compare);

		for (String a : aMap.get("d"))
			out.println("<h3>" + a + "</h3>");

		out.println("</body>");
		out.println("<html>");

	}

	public void boxesTest() {
		List<Box<String>> boxes = new ArrayList<>();

		Box<String> box = new Box<>();
		box.setObj("a string");

		Box<String> box2 = new Box<>();
		box2.setObj("a stringsss");

		boxes.add(box);
		boxes.add(box2);

		// Bounded Type Parameter
		box.inspect(123);
		box.inspect(55);
	}
	
	public void showSumOfNumbers() {
		sumOfNumbers(Arrays.asList());
	}

	// Multiple Type Parameter
	public void usingPairs() {

		IPair<String, String> p1 = new OrderedPair<String, String>("akey", "avalue");
		IPair<Integer, String> p2 = new OrderedPair<>(123, "aValue");
	}

	// Wildcard ("extends" is meaning also "implements")
	/**
	 * VERY FLEXIBILE (List<? extends Number> = it's called upperbound)
	 * 
	 * @param numbers
	 */
	public void sumOfNumbers(List<? extends Number> numbers) {

		double d = 0.0;
		for (Number n : numbers) {
			d += n.doubleValue();
		}
		
		System.out.println(d);
	}
	/**
	 * NOT Very  FLEXIBILE
	 * 
	 * @param numbers
	 */
	public <T extends Number > void sumOfNumbers2(List<? extends Number> numbers) {
		
		double d = 0.0;
		for (Number n : numbers) {
			d += n.doubleValue();
		}
		
		System.out.println(d);
	}	
	
}
