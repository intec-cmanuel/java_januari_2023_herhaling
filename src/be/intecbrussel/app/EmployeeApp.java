package be.intecbrussel.app;

import be.intecbrussel.model.Employee;
import be.intecbrussel.service.DetailedReportMaker;
import be.intecbrussel.service.ReportMaker;
import be.intecbrussel.service.SimpleReportMaker;

import java.util.stream.Stream;

public class EmployeeApp {
    private static ReportMaker reportMaker = reportArray -> "everyone is rich";
    public static void main(String[] args) {

        Employee employee = new Employee("Manuel", 5000, 5500);
        Employee employee2 = new Employee("Jonathan", 0, 1);
        Employee employee3 = new Employee("Gabriel", 2, 3);
        Employee employee4 = new Employee("Walid", 4, 5);
        Employee employee5 = new Employee("Alina", 6, 7);
        Employee employee6 = new Employee("Dmytro", 8, 9);
        Employee employee7 = new Employee("Abderrahman", 10, 11);
        Employee employee8 = new Employee("Bogdan", 12, 13);
        Employee employee9 = new Employee("HuseyÍn", 0, 1);
        Employee employee0 = new Employee("Tom", 14, 15);
        Employee employee11 = new Employee("Anas", 20, 21);

        Employee[] myClass = {employee0,employee4,employee2,employee5,employee3,employee6,employee9,employee8,employee11,employee7,employee};

        String report = reportMaker.generateReport(myClass);
        System.out.println(report);
    }
}
