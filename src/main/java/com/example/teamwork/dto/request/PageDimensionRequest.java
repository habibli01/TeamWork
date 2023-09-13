package com.example.teamwork.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PageDimensionRequest {

    private Long id;
    private Integer PageKey;
    private String PageName;
    private String PageSubDomain;
    private String PageDomain;

}
