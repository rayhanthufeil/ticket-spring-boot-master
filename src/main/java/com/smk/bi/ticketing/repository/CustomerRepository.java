package com.smk.bi.ticketing.repository;

import com.smk.bi.ticketing.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Long> {
}
