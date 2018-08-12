package com.example.chapter3.controller;

import com.example.chapter3.model.Customer;
import com.example.chapter3.service.CustomerService;
import com.example.framework.annotation.Action;
import com.example.framework.annotation.Controller;
import com.example.framework.annotation.Inject;
import com.example.framework.bean.Data;
import com.example.framework.bean.Param;
import com.example.framework.bean.View;

import java.util.List;

@Controller
public class CustomerController {

    @Inject
    private CustomerService customerService;

    @Action("get:/customer")
    public View index(Param param) {
        List<Customer> customerList = customerService.getCustomerList();
        return new View("customer.jsp").addModel("customerList", customerList);
    }

    @Action("get:/customer_show")
    public View show(Param param) {
        long id = param.getLong("id");
        Customer customer = customerService.getCustomer(id);
        return new View("customer_show.jsp").addModel("customer", customer);
    }

    @Action("get:/customer_delete")
    public View delete(Param param) {
        long id = param.getLong("id");
        boolean result = customerService.deleteCustomer(id);
        //return new Data(result);
        return new View("/customer");
    }

}
