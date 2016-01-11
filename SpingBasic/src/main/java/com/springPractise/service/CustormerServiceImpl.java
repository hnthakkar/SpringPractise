package com.springPractise.service;

import java.util.ArrayList;
import java.util.List;

import com.springPractise.model.CustomerBean;
import com.springPractise.repository.IRepository;
import com.springPractise.repository.RepositoryImpl;

public class CustormerServiceImpl implements ICustomerService {
	
	private IRepository repo;
	
	public CustormerServiceImpl(){
		repo = new RepositoryImpl();
	}
	
	/* (non-Javadoc)
	 * @see com.springPractise.service.ICustomerService#findCuster()
	 */
	public List<CustomerBean> findCustomer(){
		List<CustomerBean> ret = new ArrayList<CustomerBean>();
		ret.addAll(repo.findCustomer());
		return ret;
	}

}
