package com.springPractise.service;

import java.util.List;

import com.springPractise.model.CustomerBean;

public interface ICustomerService {

	List<CustomerBean> findCustomer();

}