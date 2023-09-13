package com.example.teamwork.controller;


import com.example.teamwork.dto.DateDimensionDto;
import com.example.teamwork.dto.request.DateDimensionRequest;
import com.example.teamwork.service.DateDimensionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/dateDimension")
@RequiredArgsConstructor

public class DateDimensionController {
    final DateDimensionService dateDimensionService;
    @GetMapping(value = "dateDimensionList")
    public List<DateDimensionDto> getCustomerDimensionInfo(){
       return dateDimensionService.getAll();
    }
    @GetMapping(value = "/getDateDimensionById/{id}")
    public DateDimensionDto getDateDimensionById(@PathVariable(value = "id")Long id)
    {
        return dateDimensionService.getDateDimensionById(id);
    }
    @PostMapping(value = "/saveDateDimension")
    public void saveDateDimension (@RequestBody DateDimensionRequest dateDimensionRequest)
    {
        dateDimensionService.saveDateDimension(dateDimensionRequest);
    }
    @PostMapping(value = "/updateDateDimension")
    public void updateDateDimension (@RequestBody DateDimensionRequest dateDimensionRequest)
    {
        dateDimensionService.updateDateDimension(dateDimensionRequest);
    }
    @DeleteMapping(value = "/deleteDateDimension")
    public void deleteDateDimensionById(@PathVariable(value = "id")Long id)
    {
        dateDimensionService.deleteDateDimensionById(id);
    }
}

