package com.example.teamwork.service;

import com.example.teamwork.dto.DateDimensionDto;
import com.example.teamwork.dto.request.DateDimensionRequest;

import java.util.List;

public interface DateDimensionService {
    DateDimensionDto getDateDimensionById(Long id);

    void saveDateDimension(DateDimensionRequest dateDimensionRequest);

    void updateDateDimension(DateDimensionRequest dateDimensionRequest);

    void deleteDateDimensionById(Long id);

    List<DateDimensionDto> getAll();

}
