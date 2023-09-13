package com.example.teamwork.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IPAddressDimensionDto {
    private String City;
    private String State;
    private String Country;
}
