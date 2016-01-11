package com.springPractise.repository;

import java.util.List;

import com.springPractise.model.CustomerBean;

public interface IRepository {

	List<CustomerBean> findCustomer();

}