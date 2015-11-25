package cn.com.u2be.chapter01.dao.impl;


import cn.com.u2be.chapter01.dao.CustomerDao;
import cn.com.u2be.chapter01.entity.Customer;
import cn.com.u2be.framework.annotation.Bean;
import cn.com.u2be.framework.helper.DatabaseHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ã÷ on 2015/11/24.
 */
@Bean
public class CustomerDaoImpl implements CustomerDao {

    public List<Customer> getCustomerList() {
        String sql = "SELECT * FROM " + DatabaseHelper.getTableName(Customer.class);
        return DatabaseHelper.queryEntityList(Customer.class, sql);
    }

    public Customer getCustomer(long id) {
        String sql = String.format("SELECT * FROM %s WHERE id =?", DatabaseHelper.getTableName(Customer.class));
        return DatabaseHelper.queryEntity(Customer.class, sql, id);
    }
}
