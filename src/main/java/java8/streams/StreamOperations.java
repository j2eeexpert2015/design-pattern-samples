package java8.streams;

import java8.common.Employee;

import java.util.ArrayList;
import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {
        System.out.println();
    }

    public static List<Employee> generateData()
    {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(1, "Emp1", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(2, "Emp2", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(3, "Emp3", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(4, "Emp4", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(5, "Emp6", 27, "Female", "HR", 2013, 22700.0));
        return employeeList;
    }
}
