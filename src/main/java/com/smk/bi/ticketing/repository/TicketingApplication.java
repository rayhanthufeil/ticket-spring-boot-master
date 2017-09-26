package com.smk.bi.ticketing.repository;

import com.smk.bi.ticketing.model.Customer;
import com.smk.bi.ticketing.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class
TicketingApplication {

	public static void main(String[] args) { SpringApplication.run(TicketingApplication.class, args); }
	@Bean
	public CommandLineRunner demo(CustomerRepository customerRepository){
		return (args) -> {
			Customer customer = new Customer();
			customer.setCustomerName("dadada");
			customer.setCustomerPhoneNumber("32131231");
			customer.setCustomerAddress("dasdasd");
			customer.setCustomerEmail("dsdadad");
			customer.setIdentityNumber("1221323");
			customerRepository.save(customer);
		};
	}
}
