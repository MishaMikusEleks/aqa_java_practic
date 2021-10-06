package practice.hibernate.dao;


import practice.hibernate.basics.Student;

public class HibernateTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Lisa");
        student.setAge(1);
        student.setAddress(1);

        StudentDao.getInstance().save(student);

        System.out.println(AddressDao.getInstance().get(1));
    }
}
