package lt.bta.java2.servlets;


import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
//        PrintWriter writer=resp.getWriter();
//        writer.println("Hello POST!");

        Map<String, Object> map = new HashMap<>();
        map.put("response", "OK");
        map.put("code", 1234);

//        String name = "None";
//
//        if (req.getContentType().equalsIgnoreCase("application/x-www-form-urlencoded")) {
//            name = req.getParameter("name") + " " +
//                    req.getParameter("fname");
//        } else if (req.getContentType().equalsIgnoreCase("application/json")) {
//            Gson gson = new Gson();
//            RequestName r = gson.fromJson(req.getReader(), RequestName.class);
//            name = r.name + " " + r.fname;
//        }
//
//
//        map.put("result",
//                new Result(req.getParameter("name"), "2019"));
//
//        Gson gson = new Gson();
//        gson.toJson(map, resp.getWriter());
//    }
        String name = "None";

        if (req.getContentType().equalsIgnoreCase("application/x-www-form-urlencoded")) {
            name = req.getParameter("name") + " " +
                    req.getParameter("fname");
        } else
        if (req.getContentType().equalsIgnoreCase("application/json")) {
            Gson gson = new Gson();
            RequestName r = gson.fromJson(req.getReader(), RequestName.class);
            name = r.name + " " + r.fname;
        }


        map.put("result", new Result(name, "2020"));
        Gson gson = new Gson();
        gson.toJson(map, resp.getWriter());

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
        PrintWriter writer = resp.getWriter();
        String name = req.getParameter("name");
        String fname = req.getParameter("fname");
        writer.println("Hello " + (name == null ? "GET" : name) + (fname == null ? " " : " ") + fname + "!");
    }

}

class RequestName {
    String name;
    String fname;

    public RequestName(String name, String fname) {
        this.name = name;
        this.fname = fname;
    }
}


class Result {
    String massage;
    String date;

    public Result(String massage, String date) {
        this.massage = massage;
        this.date = date;
    }
}




