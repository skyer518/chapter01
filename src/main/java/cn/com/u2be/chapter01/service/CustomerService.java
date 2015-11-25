package cn.com.u2be.chapter01.service;

import cn.com.u2be.chapter01.entity.Customer;
import cn.com.u2be.framework.annotation.Service;

import java.util.List;

/**
 * Created by �� on 2015/11/24.
 */
public interface CustomerService {

    List<Customer> getCustomerList();

    Customer getCustomer(long id);

}
