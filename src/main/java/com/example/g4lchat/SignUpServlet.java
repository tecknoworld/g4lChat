package com.example.g4lchat;

import java.io.*;


import com.example.g4lchat.model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


@WebServlet(name = "signUpServlet", value = "/signup")
public class SignUpServlet extends HttpServlet {

    private static SessionFactory sessionFactory;

    @Override
    public void init() throws ServletException {
        // Initialize Hibernate SessionFactory with explicit configuration file location
        Configuration configuration = new Configuration().configure("com/example/g4lchat/hibernate.cfg.xml");
        sessionFactory = configuration.buildSessionFactory();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("signup.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // Retrieve form data
        String phoneNumber = req.getParameter("number");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");
        String username = req.getParameter("username");

        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Confirm Password: " + confirmPassword);
        System.out.println("Username: " + username);

        // Create a User object
        User user = new User();
        user.setPhone(Integer.parseInt(phoneNumber));
        user.setEmail(email);
        user.setPassword(password);
        user.setUsername(username);

        // Save the User using Hibernate
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(user);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Cannot save");
        }
    }

    @Override
    public void destroy() {
        // Close the Hibernate SessionFactory when the application is shutting down
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }
}
