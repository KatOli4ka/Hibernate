import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import model.City;
import model.Employee;

import java.sql.*;

public class Application {
    public static void main(String[] args) throws SQLException {

        EmployeeDao employeeDao=new EmployeeDaoImpl();
        employeeDao.findAll().forEach(System.out::println);
        System.out.println();
        employeeDao.add(new Employee(11,"Anna","Kou","f",63,new City((5),"Riga")));
        System.out.println();
        employeeDao.findAll().forEach(System.out::println);
        System.out.println();
        System.out.println(employeeDao.readById(2));
        System.out.println();
        employeeDao.updateEmployeeById(5,"KoKo");
        employeeDao.findAll().forEach(System.out::println);
        System.out.println();
        employeeDao.deleteById(0);
        employeeDao.findAll().forEach(System.out::println);





    }
}




