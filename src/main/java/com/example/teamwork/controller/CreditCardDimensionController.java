package com.example.teamwork.controller;

import com.example.teamwork.dto.CreditCardDimensionDto;
import com.example.teamwork.dto.request.CreditCardDimensionRequest;
import com.example.teamwork.service.CreditCardDimensionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/creditCardDimension")
@RequiredArgsConstructor

public class CreditCardDimensionController {
    final CreditCardDimensionService creditCardDimensionService;
    @GetMapping(value = "/creditCardDimensionList")

    public  List<CreditCardDimensionDto> getCreditCardDimensionInfo(){
        return creditCardDimensionService.getAll();
    }
    @GetMapping(value = "/getCreditCardDimensionById/{id}")
    public CreditCardDimensionDto getCreditCardDimensionById(@PathVariable(value = "id")Long id)
    {
        return creditCardDimensionService.getCreditCardDimensionById(id);
    }
   @PostMapping(value = "/saveCreditCardDimension")
    public void saveCreditCardDimension (@RequestBody CreditCardDimensionRequest creditCardDimensionRequest)
    {
        creditCardDimensionService.saveCreditCardDimension(creditCardDimensionRequest);
    }

    @PostMapping(value = "/updateCreditCardDimension")
    public void updateCreditCardDimension (@RequestBody CreditCardDimensionRequest creditCardDimensionRequest)
    {
        creditCardDimensionService.updateCreditCardDimension(creditCardDimensionRequest);
    }

    @DeleteMapping(value = "/deleteCreditCardDimension")
    public void deleteCreditCardDimensionById(@PathVariable(value = "id")Long id)
    {
        creditCardDimensionService.deleteCreditCardDimensionById(id);
    }

}