package be.intecbrussel.service;

import be.intecbrussel.model.Employee;

public class SimpleReportMaker implements ReportMaker{
    @Override
    public String generateReport(Employee[] employees) {
        String report = "";

        for (Employee employee : employees) {
            String name = employee.name;
            double oldSalary = employee.previousSalary;
            double newSalary = employee.currentSalary;

            String reportLine = String.format("%s: %.2f -> %.2f", name, oldSalary, newSalary);

            report += reportLine + "\n";
        }

        return report;
    }
}
