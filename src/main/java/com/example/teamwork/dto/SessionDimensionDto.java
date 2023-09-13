package com.example.teamwork.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SessionDimensionDto {
    private Integer SessionKey;
    private String SessionStartTime;
    private String SessionEndTime;
    private Integer Duration;
}
