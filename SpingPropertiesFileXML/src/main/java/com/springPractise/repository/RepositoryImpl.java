package com.springPractise.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.springPractise.model.CustomerBean;

public class RepositoryImpl implements IRepository {
	
	@Value("${key1}")
	public String prop;
	
	/* (non-Javadoc)
	 * @see com.springPractise.repository.IRepository#findCustomer()
	 */
	public List<CustomerBean> findCustomer(){
		List<CustomerBean> ret = new ArrayList<CustomerBean>();
		
		CustomerBean cus = new CustomerBean();
		cus.setFirstName(prop);
		cus.setLastName("Lname1");
		
		ret.add(cus);
		
		return ret;
	}

}
