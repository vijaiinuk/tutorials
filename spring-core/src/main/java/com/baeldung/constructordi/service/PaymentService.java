package com.baeldung.constructordi.service;

import com.baeldung.beanfactory.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Vijay on 4/3/2017.
 */
public class PaymentService {

    Logger logger = LoggerFactory.getLogger(PaymentService.class);

    private final String bankName;

    private final String accountNo;

    public PaymentService(String bankName, String accountNo) {
        this.bankName = bankName;
        this.accountNo = accountNo;
    }

    public boolean pay(Employee employee)  {
        logger.info("Paying employee - "+employee.getName()+" from "+ bankName +" Account No: "+ accountNo);

        //do actual payments and return true on success
        return true;
    }

}
