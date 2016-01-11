package com.springPractise;

import java.util.List;

import com.springPractise.model.CustomerBean;
import com.springPractise.service.CustormerServiceImpl;
import com.springPractise.service.ICustomerService;

public class App {
	public static void main(String[] args) {
		ICustomerService cusSrv = new CustormerServiceImpl();
		List<CustomerBean> cusLst = cusSrv.findCustomer();
		for(CustomerBean cus: cusLst){
			System.out.println(cus.getFirstName() + " " + cus.getLastName());
		}
	}
}
