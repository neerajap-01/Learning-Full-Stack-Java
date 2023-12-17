package org.example;

import org.example.Entity.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class App {
    public static void main(String[] args) {
        //How to access the hibernate.cfg.xml file
        //? The configure method takes in a string which is the path to the hibernate.cfg.xml file
        //? The addAnnotatedClass method takes in a class which is the entity class
        //? The buildSessionFactory method returns a SessionFactory object

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Users.class).buildSessionFactory();

        Session session = factory.getCurrentSession();

        //! Performing CRUD operations
        try {
            //? Create operation
            // Create a user object
//            Users user = new Users("johndoe", "password", "dummy@gmail.com", "John", "Doe");
//
//            // Start a transaction
//            session.beginTransaction();
//
//            // Performing the operation
//            session.save(user);
//
//            // Commit the transaction
//            session.getTransaction().commit();
//            System.out.println("Row inserted successfully");

            //? Read operation
//            Users user = new Users();
//
//            // Start a transaction
//            session.beginTransaction();
//
//            //Performing the operation
//            user = session.get(Users.class, 1);
//
//            // Commit the transaction (optional)
//            session.getTransaction().commit();
//
//            System.out.println(user); //Prints:- Users{userId=1, username='Neeraj', password='', email='neeraj@neerajpal.dev', firstname='', lastname=''}

            //? Update operation
//            Users user = new Users();
//
//            // Start a transaction
//            session.beginTransaction();
//
//            // Performing the operation
//            user = session.get(Users.class, 1);
//            user.setUsername("Neeraj");
//            user.setFirstname("Neeraj");
//            user.setLastname("Pal");
//            user.setPassword("password@123");
//
//            // Commit the transaction
//            session.getTransaction().commit();
//
//            System.out.println("Row updated successfully");

            //? Delete operation
//            Users user = new Users();
//
//            // Start a transaction
//            session.beginTransaction();
//
//            // Performing the operation
//            user = session.get(Users.class, 2);
//            session.delete(user);
//
//            // Commit the transaction
//            session.getTransaction().commit();
//
//            System.out.println("Row deleted successfully");

            //? List operation
//            session.beginTransaction();
//
//            List<Users> users = session.createQuery("from users").getResultList();
//            for (Users user : users) {
//                System.out.println(user);
//            } //?Prints:-  Users{userId=1, username='Neeraj', password='password@123', email='neeraj@neerajpal.dev', firstname='Neeraj', lastname='Pal'}

            //? List operation with where clause
//            session.beginTransaction();
//            List<Users> users = session.createQuery("from users where username='john' OR "
//                    + "password like '%123'").getResultList();
//            for (Users temp : users) {
//                System.out.println(temp);
//            } //?Prints:-  Users{userId=1, username='Neeraj', password='password@123', email='neeraj@neerajpal.dev', firstname='Neeraj', lastname='Pal'}

            //? Update operation with where clause
            session.beginTransaction();
            session.createQuery("update users set password='newPassword@123' where password like '%123%'").executeUpdate();
        } finally {
            session.close();
            factory.close();
        }
    }
}
