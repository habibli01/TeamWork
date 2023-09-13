package com.example.teamwork.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DateDimensionRequest {
    private Long id;
    private Integer DateKey;
    private String DateVal;
    private String DateDescription;
    private Integer DayNumInFiscalMonth;
    private Integer CalendarYearMonth;
    private Integer CalendarYear;
}
