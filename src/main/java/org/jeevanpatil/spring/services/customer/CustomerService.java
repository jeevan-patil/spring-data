package org.jeevanpatil.spring.services.customer;

import java.util.List;

import org.jeevanpatil.spring.dto.CustomerDto;

public interface CustomerService {

	List<CustomerDto> getAll();
}
