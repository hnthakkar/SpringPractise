package com.springPractise;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springPractise.model.CustomerBean;
import com.springPractise.service.ICustomerService;

public class App {
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")){
			ICustomerService cusSrv = context.getBean("custormerServiceImpl", ICustomerService.class);
			List<CustomerBean> cusLst = cusSrv.findCustomer();
			for(CustomerBean cus: cusLst){
				System.out.println(cus.getFirstName() + " " + cus.getLastName());
			}
		}
	}
}
