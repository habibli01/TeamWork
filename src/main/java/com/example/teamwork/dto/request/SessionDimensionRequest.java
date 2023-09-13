package com.example.teamwork.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SessionDimensionRequest {

    private Long id;
    private Integer SessionKey;
    private String SessionStartTime;
    private String SessionEndTime;
    private Integer Duration;
    private String ServerIP;
    private String ClientIP;
}
