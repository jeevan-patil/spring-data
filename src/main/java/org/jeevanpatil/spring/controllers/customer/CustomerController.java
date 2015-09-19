package org.jeevanpatil.spring.controllers.customer;

import java.util.List;

import org.jeevanpatil.spring.dto.CustomerDto;
import org.jeevanpatil.spring.services.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@ResponseBody
	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public List<CustomerDto> listAll() {
		return customerService.getAll();
	}
}
