package com.example.teamwork.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDimensionDto {
    private String CustomerName;
    private String CustomerEmail;
    private String Age;
    private String Sex;
    private Integer AnnualIncome;
    private String City;
    private String Country;
}
