package practice.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import practice.hibernate.model.Student;

public class HibernateTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Lisa");
        student.setAge(1);
        student.setAddress(1);

        //Get Session
        SessionFactory sessionFactory = new HibernateUtil().getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        //start transaction
        session.beginTransaction();
        //Save the Model object
        session.save(student);
        //Commit transaction
        session.getTransaction().commit();
        System.out.println("student ID="+student.getId());

        //terminate session factory, otherwise program won't end
        sessionFactory.close();
    }
}
