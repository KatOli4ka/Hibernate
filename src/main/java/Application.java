import dao.EmployeeDao;
import dao.impl.EmployeeDaoImpl;
import entity.Employee;

import java.sql.*;

public class Application {
    public static void main(String[] args) throws SQLException {

        EmployeeDao employeeDao=new EmployeeDaoImpl();
        employeeDao.findAll().forEach(System.out::println);
        System.out.println();
        Employee e1= new Employee(1,"Ann","Oh","f",73,4);
        employeeDao.add(e1);
        employeeDao.findAll().forEach(System.out::println);
        System.out.println();
        System.out.println(employeeDao.readById(2));
        System.out.println();
        employeeDao.deleteById(e1);
        employeeDao.findAll().forEach(System.out::println);
    }
}




