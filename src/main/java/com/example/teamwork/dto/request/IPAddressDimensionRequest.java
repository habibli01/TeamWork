package com.example.teamwork.dto.request;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IPAddressDimensionRequest {
    private Long id;
    private Integer ClientIPAddress;
    private String IP_Address_Val;
    private String City;
    private String State;
    private String Country;
}
