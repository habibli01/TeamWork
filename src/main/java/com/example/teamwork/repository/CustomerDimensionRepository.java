package com.example.teamwork.repository;

import com.example.teamwork.model.ClictStreamFact;
import com.example.teamwork.model.CustomerDimension;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDimensionRepository extends JpaRepository<CustomerDimension, Long> {

    CustomerDimension getCustomerDimensionById(Long id);

    CustomerDimension getCustomerDimensionById();
}
