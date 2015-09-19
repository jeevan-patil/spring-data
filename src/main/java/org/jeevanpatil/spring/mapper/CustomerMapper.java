package org.jeevanpatil.spring.mapper;

import java.util.List;

import org.jeevanpatil.spring.domain.Customer;
import org.jeevanpatil.spring.dto.CustomerDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {
	CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

	CustomerDto mapToDto(Customer customer);

	List<CustomerDto> mapToDtos(List<Customer> customers);
}
