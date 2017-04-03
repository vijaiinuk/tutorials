package com.baeldung.constructordi.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Vijay on 4/4/2017.
 */
public class EmployeeRunner {

    public static void main(String[] args) {
        EmployeeService employeeService = getEmployeeService();

        employeeService.payEmployees("Da");
    }

    private static EmployeeService getEmployeeService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("DependencyInjection.xml");

        return context.getBean(EmployeeService.class);
    }

}
