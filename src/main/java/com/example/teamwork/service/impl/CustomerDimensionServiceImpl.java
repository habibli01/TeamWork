package com.example.teamwork.service.impl;

import com.example.teamwork.dto.CustomerDimensionDto;
import com.example.teamwork.dto.request.CustomerDimensionRequest;
import com.example.teamwork.model.CustomerDimension;
import com.example.teamwork.repository.CustomerDimensionRepository;
import com.example.teamwork.service.CustomerDimensionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CustomerDimensionServiceImpl implements CustomerDimensionService {

    final CustomerDimensionRepository customerDimensionRepository;
    @Override
    public CustomerDimensionDto getCustomerDimensionById(Long id) {
        CustomerDimension customerDimension = customerDimensionRepository.getCustomerDimensionById(id);
        return CustomerDimensionDto.builder()
                .CustomerEmail(customerDimension.getCustomerEmail())
                .CustomerName(customerDimension.getCustomerName())
                .Age(customerDimension.getAge())
                .Sex(customerDimension.getSex())
                .AnnualIncome(customerDimension.getAnnualIncome())
                .City(customerDimension.getCity())
                .Country(customerDimension.getCountry())
                .build();
    }

    @Override
    public void saveCustomerDimension(CustomerDimensionRequest customerDimensionRequest) {
        CustomerDimension customerDimension = CustomerDimension.builder()
                .CustomerEmail(customerDimensionRequest.getCustomerEmail())
                .CustomerName(customerDimensionRequest.getCustomerName())
                .Age(customerDimensionRequest.getAge())
                .Sex(customerDimensionRequest.getSex())
                .AnnualIncome(customerDimensionRequest.getAnnualIncome())
                .City(customerDimensionRequest.getCity())
                .Country(customerDimensionRequest.getCountry())
                .build();
        customerDimensionRepository.save(customerDimension);
    }

    @Override
    public void updateCustomerDimension(CustomerDimensionRequest customerDimensionRequest) {
        CustomerDimension customerDimension= CustomerDimension.builder()
                .CustomerEmail(customerDimensionRequest.getCustomerEmail())
                .CustomerName(customerDimensionRequest.getCustomerName())
                .Age(customerDimensionRequest.getAge())
                .Sex(customerDimensionRequest.getSex())
                .AnnualIncome(customerDimensionRequest.getAnnualIncome())
                .City(customerDimensionRequest.getCity())
                .Country(customerDimensionRequest.getCountry())
                .build();
        customerDimensionRepository.save(customerDimension);

    }

    @Override
    public void deleteCustomerDimensionById(Long id) {
        if (id == null) {
            throw new RuntimeException("There is no such information");
        }
        else {
            customerDimensionRepository.deleteById(id);
        }

    }

    @Override
    public List<CustomerDimensionDto> getAll() {
        List<CustomerDimension> customerDimensions = customerDimensionRepository.findAll();
        List<CustomerDimensionDto> customerDimensionDtos = new ArrayList<>();
        for (CustomerDimension customerDimension : customerDimensions)
        {
            CustomerDimensionDto customerDimensionDto = CustomerDimensionDto.builder()
                    .CustomerEmail(customerDimension.getCustomerEmail())
                    .CustomerName(customerDimension.getCustomerName())
                    .Age(customerDimension.getAge())
                    .Sex(customerDimension.getSex())
                    .AnnualIncome(customerDimension.getAnnualIncome())
                    .City(customerDimension.getCity())
                    .Country(customerDimension.getCountry())
                    .build();
        }
        return customerDimensionDtos;

    }
}
