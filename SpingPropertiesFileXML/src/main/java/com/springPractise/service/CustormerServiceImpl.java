package com.springPractise.service;

import java.util.ArrayList;
import java.util.List;

import com.springPractise.model.CustomerBean;
import com.springPractise.repository.IRepository;

public class CustormerServiceImpl implements ICustomerService {
	
	private IRepository repo;
	//private String sample;
	
	public CustormerServiceImpl(IRepository repo){
	//public CustormerServiceImpl(IRepository repo, String sample){
		this.repo = repo;
		//this.sample = sample;
	}
	
	/* (non-Javadoc)
	 * @see com.springPractise.service.ICustomerService#findCuster()
	 */
	public List<CustomerBean> findCustomer(){
		//System.out.println(sample);
		List<CustomerBean> ret = new ArrayList<CustomerBean>();
		ret.addAll(repo.findCustomer());
		return ret;
	}

}
