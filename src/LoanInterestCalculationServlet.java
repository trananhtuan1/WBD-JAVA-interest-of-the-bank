import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoanInterestCalculationServlet", urlPatterns = "/aa")
public class LoanInterestCalculationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Double loan = Double.parseDouble(request.getParameter("loan"));
        Double monthlyInterestRate = Double.parseDouble(request.getParameter("monthlyInterestRate"));
        Double numberOfMonthsOfLoan = Double.parseDouble(request.getParameter("numberOfMonthsOfLoan"));
        Double totalMoney = loan * (monthlyInterestRate / 100) / 12 * numberOfMonthsOfLoan;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("Amount Of Loan: " + loan + "<br>");
        writer.println("monthly interest rate: " + monthlyInterestRate + "<br>");
        writer.println("number Of Months Of Loan: " + numberOfMonthsOfLoan + "<br>");
        writer.println("Total Money: " + totalMoney);
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
