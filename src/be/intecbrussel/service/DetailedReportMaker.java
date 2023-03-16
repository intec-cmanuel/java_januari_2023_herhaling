package be.intecbrussel.service;

import be.intecbrussel.model.Employee;

public class DetailedReportMaker implements ReportMaker{
    @Override
    public String generateReport(Employee[] employees) {
        String report = String.format("|%-15s|%8s|%8s|%8s|%8s|\n","Name", "Old S", "New S", "inc", "%inc");

        for (Employee employee : employees) {
            String name = employee.name;
            double oldSalary = employee.previousSalary;
            double newSalary = employee.currentSalary;

            String reportLine = String.format("|%-15s|%8.2f|%8.2f|%8.2f|%8.2f|",
                    name, oldSalary, newSalary, newSalary-oldSalary, ((newSalary-oldSalary)/oldSalary)*100);

            report += reportLine + "\n";
        }

        return report;
    }
}
