package com.example.teamwork.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreditCardDimensionDto {
    private Integer CardKey;
    private Integer CardHolderName;
    private String CardIssuer;
    private String CardExpirationDate;
}
