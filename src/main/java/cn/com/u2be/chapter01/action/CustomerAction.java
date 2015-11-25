package cn.com.u2be.chapter01.action;


import cn.com.u2be.chapter01.entity.Customer;
import cn.com.u2be.chapter01.service.CustomerService;
import cn.com.u2be.framework.annotation.Action;
import cn.com.u2be.framework.annotation.Controller;
import cn.com.u2be.framework.bean.Param;
import cn.com.u2be.framework.bean.View;

import java.util.List;


/**
 * Created by Ã÷ on 2015/11/24.
 */
@Controller
public class CustomerAction {

    private CustomerService customerService;

    @Action("get:/customer")
    public View index() {
        List<Customer> customerList = customerService.getCustomerList();
        return new View("customer.jsp").addModel("customerList", customerList);
    }

    @Action("get:/customer_show")
    public View show(Param param) {
        long id = param.getLong("id");
        Customer customer = customerService.getCustomer(id);
        return new View("customer_show.jsp").addModel("customer", customer);
    }


}
