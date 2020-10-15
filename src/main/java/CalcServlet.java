import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "CalcServlet", urlPatterns = "/CalcServlet")
public class CalcServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String s1 = req.getParameter("user first number_sum");
        String s2 = req.getParameter("user second number_sum");

        try {

            int i1 = Integer.parseInt(s1);
            int i2 = Integer.parseInt(s2);

            int sumValue = i1 + i2;

            req.setAttribute("sumValue", sumValue);
            this.getServletContext().getRequestDispatcher("/sumForm.jsp").forward(req,resp);


        } catch (Exception e) {
            resp.sendRedirect("error.html");

        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String s1 = req.getParameter("user first number_mltpl");
        String s2 = req.getParameter("user second number_mltpl");

        try {

            int i1 = Integer.parseInt(s1);
            int i2 = Integer.parseInt(s2);

            int multiplyValue = i1 * i2;

            req.setAttribute("multiplyValue", multiplyValue);
            this.getServletContext().getRequestDispatcher("/multiplyForm.jsp").forward(req,resp);


        } catch (Exception e) {
            resp.sendRedirect("error.html");

        }
    }
}
