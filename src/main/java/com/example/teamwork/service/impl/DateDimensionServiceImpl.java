package com.example.teamwork.service.impl;

import com.example.teamwork.dto.DateDimensionDto;
import com.example.teamwork.dto.request.DateDimensionRequest;
import com.example.teamwork.model.DateDimension;
import com.example.teamwork.repository.DateDimensionRepository;
import com.example.teamwork.service.DateDimensionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor

public class DateDimensionServiceImpl implements DateDimensionService {
    final DateDimensionRepository dateDimensionRepository;
    @Override
    public DateDimensionDto getDateDimensionById(Long id) {
        DateDimension dateDimension = dateDimensionRepository.getDateDimensionById(id);
        return DateDimensionDto.builder()
                .DateKey(dateDimension.getDateKey())
                .DateVal(dateDimension.getDateVal())
                .DateDescription(dateDimension.getDateDescription())
                .DayNumInFiscalMonth(dateDimension.getDayNumInFiscalMonth())
                .CalendarYearMonth(dateDimension.getCalendarYearMonth())
                .CalendarYear(dateDimension.getCalendarYear())
                .build();

    }

    @Override
    public void saveDateDimension(DateDimensionRequest dateDimensionRequest) {
        DateDimension dateDimension = DateDimension.builder()
                .DateKey(dateDimensionRequest.getDateKey())
                .DateVal(dateDimensionRequest.getDateVal())
                .DateDescription(dateDimensionRequest.getDateDescription())
                .DayNumInFiscalMonth(dateDimensionRequest.getDayNumInFiscalMonth())
                .CalendarYearMonth(dateDimensionRequest.getCalendarYearMonth())
                .CalendarYear(dateDimensionRequest.getCalendarYear())
        .build();
        dateDimensionRepository.save(dateDimension);

    }

    @Override
    public void updateDateDimension(DateDimensionRequest dateDimensionRequest) {
        DateDimension dateDimension = DateDimension.builder()
                .DateKey(dateDimensionRequest.getDateKey())
                .DateVal(dateDimensionRequest.getDateVal())
                .DateDescription(dateDimensionRequest.getDateDescription())
                .DayNumInFiscalMonth(dateDimensionRequest.getDayNumInFiscalMonth())
                .CalendarYearMonth(dateDimensionRequest.getCalendarYearMonth())
                .CalendarYear(dateDimensionRequest.getCalendarYear())
                .build();
        dateDimensionRepository.save(dateDimension);

    }

    @Override
    public void deleteDateDimensionById(Long id) {
        if (id == null) {
            throw new RuntimeException("There is no such information");
        }
        else {
            dateDimensionRepository.deleteById(id);
        }

    }

    @Override
    public List<DateDimensionDto> getAll() {
        List<DateDimension>dateDimensions=dateDimensionRepository.findAll();
        List<DateDimensionDto>dateDimensionDtos= new ArrayList<>();
        for (DateDimension dateDimension : dateDimensions)
        {
            DateDimensionDto dateDimensionDto= DateDimensionDto.builder()
                    .DateKey(dateDimension.getDateKey())
                    .DateVal(dateDimension.getDateVal())
                    .DateDescription(dateDimension.getDateDescription())
                    .DayNumInFiscalMonth(dateDimension.getDayNumInFiscalMonth())
                    .CalendarYearMonth(dateDimension.getCalendarYearMonth())
                    .CalendarYear(dateDimension.getCalendarYear())
                    .build();
        }
        return dateDimensionDtos;
    }
}
