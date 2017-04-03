package com.baeldung.constructordi.service;

import com.baeldung.beanfactory.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by Vijay on 4/3/2017.
 */
public class EmployeeService {

    private final EmployeeDAO employeeDAO;

    private final PaymentService paymentService;

    private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);

    public EmployeeService(EmployeeDAO employeeDAO, PaymentService paymentService) {
        this.employeeDAO = employeeDAO;
        this.paymentService = paymentService;
    }

    public List<Employee> payEmployees(String nameCriteria)  {
        List<Employee> allEmployeesByName = employeeDAO.findAllEmployeesByName(nameCriteria);
        allEmployeesByName.forEach(e -> paymentService.pay(e));

        logger.info("Paid the employees: "+allEmployeesByName);

        return allEmployeesByName;
    }
}
