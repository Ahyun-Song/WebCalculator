package com.example;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CalculatorServlet") // URL 매핑
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CalculatorServlet() {
		super();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			double num1 = Double.parseDouble(request.getParameter("num1"));
			double num2 = Double.parseDouble(request.getParameter("num2"));
			String operation = request.getParameter("operation");

			double result = 0;

			switch (operation) {
				case "add":
					result = num1 + num2;
					break;
				case "subtract":
					result = num1 - num2;
					break;
				case "multiply":
					result = num1 * num2;
					break;
				case "divide":
					if (num2 != 0) {
						result = num1 / num2;
					} else {
						throw new ArithmeticException("Division by zero");
					}
					break;
				default:
					throw new IllegalArgumentException("Invalid operation");
			}

			response.setContentType("text/html");
			response.getWriter().println("<html><body>");
			response.getWriter().println("<h1>Result: " + result + "</h1>");
			response.getWriter().println("<a href='calculator.jsp'>Back to Calculator</a>");
			response.getWriter().println("</body></html>");
		} catch (Exception e) {
			response.getWriter().println("<html><body>");
			response.getWriter().println("<h1>Error: " + e.getMessage() + "</h1>");
			response.getWriter().println("<a href='calculator.jsp'>Back to Calculator</a>");
			response.getWriter().println("</body></html>");
		}
	}
}
