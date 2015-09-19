package org.jeevanpatil.spring.repositories.customer;

import java.util.List;

import org.jeevanpatil.spring.domain.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

	/**
	 * List all the customers. CrudRepository provides findAll method but it returns Iterable list.
	 */
	@Query("SELECT c FROM Customer c")
	List<Customer> findAll();
}
