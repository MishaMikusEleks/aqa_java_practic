package practice.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import practice.hibernate.basics.Student;
import practice.hibernate.basics.HibernateUtil;
import practice.PropertyUtil;

import javax.persistence.Table;
import java.util.List;

public abstract class Dao<T> {
    private Class<T> genericClass;
    private SessionFactory sessionFactory = new HibernateUtil().getSessionFactory();
    public Dao(Class<T> genericClass) {
        this.genericClass=genericClass;
    }

    public T get(long id) {
        T res=null;
        try {
            //Get Session
            Session session = sessionFactory.openSession();
            //start transaction
            session.beginTransaction();
            //Save the Model object
             res = (T) session.get(genericClass,id);
            //Commit transaction
            session.getTransaction().commit();
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            sessionFactory.close();
        }
        return res;
    }

    List<Student> getAll() {
        return null;
    }

    public void save(T object) {
        try {
            //Get Session
            Session session = sessionFactory.openSession();
            //start transaction
            session.beginTransaction();
            //Save the Model object
            Object id = session.save(object);
            //Commit transaction
            session.getTransaction().commit();
            System.out.println("object "+object+" saved to "+getSchemaName()+"."+getTableName()+" as "+id);
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            sessionFactory.close();
        }

    }

    private String getTableName() {
        return genericClass.getAnnotation(Table.class).name();
    }

    private static String getSchemaName() {
        String url=new PropertyUtil().getProperty("hibernate.connection.url").toString();
        return url.split("/")[url.split("/").length-1];
    }

    void update(Student student, String[] params) {

    }

    void delete(Student student) {

    }

    public  void closeSession(){
        sessionFactory.close();
    }
}