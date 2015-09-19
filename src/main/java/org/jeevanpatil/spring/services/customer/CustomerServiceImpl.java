package org.jeevanpatil.spring.services.customer;

import java.util.ArrayList;
import java.util.List;

import org.jeevanpatil.spring.dto.CustomerDto;
import org.jeevanpatil.spring.mapper.CustomerMapper;
import org.jeevanpatil.spring.repositories.customer.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerServiceImpl implements CustomerService {

	private static final Logger _log = LoggerFactory.getLogger(CustomerServiceImpl.class);

	@Autowired
	private CustomerRepository customerRepo;

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)	
	public List<CustomerDto> getAll() {
		List<CustomerDto> customers = new ArrayList<>();

		try {
			// use mapstruct here to map bean to dto
			customers = CustomerMapper.INSTANCE.mapToDtos(customerRepo.findAll());
		} catch(Exception e) {
			_log.error("Exception occurred while fetching customer list.");
		}

		return customers;
	}

}
