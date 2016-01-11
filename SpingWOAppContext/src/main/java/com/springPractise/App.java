package com.springPractise;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springPractise.model.CustomerBean;
import com.springPractise.service.ICustomerService;

public class App {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)){
			ICustomerService cusSrv = context.getBean("custormerServiceImpl", ICustomerService.class);
			List<CustomerBean> cusLst = cusSrv.findCustomer();
			for(CustomerBean cus: cusLst){
				System.out.println(cus.getFirstName() + " " + cus.getLastName());
			}
		}
	}
}
