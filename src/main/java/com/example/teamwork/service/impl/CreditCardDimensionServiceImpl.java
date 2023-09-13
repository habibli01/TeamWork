package com.example.teamwork.service.impl;

import com.example.teamwork.dto.CreditCardDimensionDto;
import com.example.teamwork.dto.request.CreditCardDimensionRequest;
import com.example.teamwork.model.CreditCardDimension;
import com.example.teamwork.repository.CreditCardDimensionRepository;
import com.example.teamwork.service.CreditCardDimensionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CreditCardDimensionServiceImpl implements CreditCardDimensionService {

    final CreditCardDimensionRepository creditCardDimensionRepository;

    @Override
    public CreditCardDimensionDto getCreditCardDimensionById(Long id) {
        CreditCardDimension creditCardDimension = creditCardDimensionRepository.getCreditCardDimensionById(id);

        return CreditCardDimensionDto.builder()
                .CardKey(creditCardDimension.getCardKey())
                .CardHolderName(creditCardDimension.getCardHolderName())
                .CardIssuer(creditCardDimension.getCardIssuer())
                .CardExpirationDate(creditCardDimension.getCardExpirationDate()).build();
    }


    @Override
    public void saveCreditCardDimension(CreditCardDimensionRequest creditCardDimensionRequest) {
        CreditCardDimension creditCardDimension = CreditCardDimension.builder()
                .CardKey(creditCardDimensionRequest.getCardKey())
                .CardHolderName(creditCardDimensionRequest.getCardHolderName())
                .CardIssuer(creditCardDimensionRequest.getCardIssuer())
                .CardExpirationDate(creditCardDimensionRequest.getCardExpirationDate()).build();
        creditCardDimensionRepository.save(creditCardDimension);

    }

    @Override
    public void updateCreditCardDimension(CreditCardDimensionRequest creditCardDimensionRequest) {
        CreditCardDimension creditCardDimension = CreditCardDimension.builder()
                .CardKey(creditCardDimensionRequest.getCardKey())
                .CardHolderName(creditCardDimensionRequest.getCardHolderName())
                .CardIssuer(creditCardDimensionRequest.getCardIssuer())
                .CardExpirationDate(creditCardDimensionRequest.getCardExpirationDate()).build();
        creditCardDimensionRepository.save(creditCardDimension);

    }

    @Override
    public void deleteCreditCardDimensionById(Long id) {
        if (id == null) {
            throw  new RuntimeException("There is no such information");

        }
        else {
            creditCardDimensionRepository.deleteById(id);
        }

    }

    @Override
    public List<CreditCardDimensionDto> getAll() {
        List<CreditCardDimension>creditCardDimensions = creditCardDimensionRepository.findAll();
        List<CreditCardDimensionDto> creditCardDimensionDtos = new ArrayList<>();
        for (CreditCardDimension creditCardDimension : creditCardDimensions)
        {
            CreditCardDimensionDto creditCardDimensionDto = CreditCardDimensionDto.builder()
                    .CardKey(creditCardDimension.getCardKey())
                    .CardHolderName(creditCardDimension.getCardHolderName())
                    .CardIssuer(creditCardDimension.getCardIssuer())
                    .CardExpirationDate(creditCardDimension.getCardExpirationDate()).build();
        }
        return creditCardDimensionDtos;
    }
}
