package com.springPractise.repository;

import java.util.ArrayList;
import java.util.List;

import com.springPractise.model.CustomerBean;

public class RepositoryImpl implements IRepository {
	
	/* (non-Javadoc)
	 * @see com.springPractise.repository.IRepository#findCustomer()
	 */
	public List<CustomerBean> findCustomer(){
		List<CustomerBean> ret = new ArrayList<CustomerBean>();
		
		CustomerBean cus = new CustomerBean();
		cus.setFirstName("Fname1");
		cus.setLastName("Lname1");
		
		ret.add(cus);
		
		return ret;
	}

}
