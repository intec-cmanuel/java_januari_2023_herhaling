package be.intecbrussel.service;

import be.intecbrussel.model.Employee;

public interface ReportMaker {
    String generateReport(Employee[] employees);
}
