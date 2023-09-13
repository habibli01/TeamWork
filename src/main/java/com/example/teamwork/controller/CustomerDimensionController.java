package com.example.teamwork.controller;

import com.example.teamwork.dto.CustomerDimensionDto;
import com.example.teamwork.dto.request.CustomerDimensionRequest;
import com.example.teamwork.service.CustomerDimensionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customerDimension")
@RequiredArgsConstructor

public class CustomerDimensionController {
    final CustomerDimensionService customerDimensionService;

    @GetMapping(value = "customerDimensionList")
    public List<CustomerDimensionDto> getCustomerDimensionInfo(){
        return customerDimensionService.getAll();
    }
    @GetMapping(value = "/getCustomerDimensionById/{id}")
    public CustomerDimensionDto getCustomerDimensionById(@PathVariable(value = "id")Long id)
    {
        return customerDimensionService.getCustomerDimensionById(id);
    }
    @PostMapping(value = "/saveCustomerDimension")
    public void saveCustomerDimension (@RequestBody CustomerDimensionRequest customerDimensionRequest)
    {
        customerDimensionService.saveCustomerDimension(customerDimensionRequest);
    }
    @PostMapping(value = "/updateCustomerDimension")
    public void updateCustomerDimension (@RequestBody CustomerDimensionRequest customerDimensionRequest)
    {
        customerDimensionService.updateCustomerDimension(customerDimensionRequest);
    }
    @DeleteMapping(value = "/deleteCustomerDimension")
    public void deleteCustomerDimensionById(@PathVariable(value = "id")Long id)
    {
        customerDimensionService.deleteCustomerDimensionById(id);
    }
}
