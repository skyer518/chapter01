package cn.com.u2be.chapter01.service.impl;

import cn.com.u2be.chapter01.dao.CustomerDao;
import cn.com.u2be.chapter01.entity.Customer;
import cn.com.u2be.chapter01.service.CustomerService;

import java.util.List;

/**
 * Created by Ã÷ on 2015/11/24.
 */
public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao;

    public List<Customer> getCustomerList() {
        return customerDao.getCustomerList();
    }

    public Customer getCustomer(long id) {
        return customerDao.getCustomer(id);
    }
}
