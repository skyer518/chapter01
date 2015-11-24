package cn.com.u2be.chapter01.dao.impl;

import cn.com.u2be.alekMvc.helper.DatabaseHelper;
import cn.com.u2be.chapter01.dao.CustomerDao;
import cn.com.u2be.chapter01.entity.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ã÷ on 2015/11/24.
 */
public class CustomerDaoImpl implements CustomerDao {

    public List<Customer> getCustomerList() {
        List<Customer> customerList = new ArrayList<Customer>(0);
        //Customer customer = DatabaseHelper.queryEntityList(Customer.class,sql);


        return null;
    }

    public Customer getCustomer(long id) {
        return null;
    }
}
