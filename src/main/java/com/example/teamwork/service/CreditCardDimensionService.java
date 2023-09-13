package com.example.teamwork.service;

import com.example.teamwork.dto.CreditCardDimensionDto;
import com.example.teamwork.dto.request.CreditCardDimensionRequest;

import java.util.List;

public interface CreditCardDimensionService {
    CreditCardDimensionDto getCreditCardDimensionById (Long id);

    void saveCreditCardDimension(CreditCardDimensionRequest creditCardDimensionRequest);

    void updateCreditCardDimension(CreditCardDimensionRequest creditCardDimensionRequest);
    void deleteCreditCardDimensionById(Long id);

    List<CreditCardDimensionDto> getAll();
}
