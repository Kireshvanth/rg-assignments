package com.kireshvanth.Customer_Springbatch.repository;

import com.kireshvanth.Customer_Springbatch.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer,Integer> {
}