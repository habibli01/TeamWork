package com.example.teamwork.repository;

import com.example.teamwork.model.ClictStreamFact;
import com.example.teamwork.model.CreditCardDimension;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCardDimensionRepository extends JpaRepository<CreditCardDimension, Long> {

    CreditCardDimension getCreditCardDimensionById(Long id);
}
