package cn.com.u2be.chapter01.service.impl;

import cn.com.u2be.chapter01.dao.CustomerDao;
import cn.com.u2be.chapter01.entity.Customer;
import cn.com.u2be.chapter01.service.CustomerService;
import cn.com.u2be.framework.annotation.Bean;
import cn.com.u2be.framework.annotation.Inject;
import cn.com.u2be.framework.annotation.Service;

import java.util.List;

/**
 * Created by Ã÷ on 2015/11/24.
 */
@Service
@Bean
public class CustomerServiceImpl implements CustomerService {

    @Inject
    private CustomerDao customerDao;

    public List<Customer> getCustomerList() {
        return customerDao.getCustomerList();
    }

    public Customer getCustomer(long id) {
        return customerDao.getCustomer(id);
    }
}
