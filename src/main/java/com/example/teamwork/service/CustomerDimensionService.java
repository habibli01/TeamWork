package com.example.teamwork.service;

import com.example.teamwork.dto.CustomerDimensionDto;
import com.example.teamwork.dto.request.CustomerDimensionRequest;

import java.util.List;

public interface CustomerDimensionService {
    CustomerDimensionDto getCustomerDimensionById(Long id);

    void saveCustomerDimension(CustomerDimensionRequest customerDimensionRequest);

    void updateCustomerDimension(CustomerDimensionRequest customerDimensionRequest);

    void deleteCustomerDimensionById(Long id);

    List<CustomerDimensionDto> getAll();

}
