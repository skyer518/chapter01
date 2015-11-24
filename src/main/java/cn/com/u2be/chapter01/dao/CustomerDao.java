package cn.com.u2be.chapter01.dao;

import cn.com.u2be.chapter01.entity.Customer;

import java.util.List;

/**
 * Created by Ã÷ on 2015/11/24.
 */
public interface CustomerDao {

    List<Customer> getCustomerList();

    Customer getCustomer(long id);
}
