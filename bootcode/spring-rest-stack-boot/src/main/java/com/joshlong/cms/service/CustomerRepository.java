
package com.joshlong.cms.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.joshlong.cms.domain.Customer;

/**
 * Repository for dealing with {@link Customer customer } records.
 */
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {

	@RestResource(path = "/find")
	List<Customer> findByUserId(Long id);

	@RestResource(path = "/pagedfind")
	Page<Customer> findByUserId(Long id, Pageable pageable);

}
