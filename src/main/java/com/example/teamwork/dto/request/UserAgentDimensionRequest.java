package com.example.teamwork.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserAgentDimensionRequest {

    private Long id;
    private Integer UserAgentKey;
    private String BrowserVersion;
    private String OperatingSystem;
    private String OperatingSystemVersion;
    private String AgentLanguage;
}
