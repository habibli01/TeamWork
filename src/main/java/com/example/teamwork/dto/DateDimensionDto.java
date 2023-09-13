package com.example.teamwork.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DateDimensionDto {
    private Integer DateKey;
    private String DateVal;
    private String DateDescription;
    private Integer DayNumInFiscalMonth;
    private Integer CalendarYearMonth;
    private Integer CalendarYear;
}
