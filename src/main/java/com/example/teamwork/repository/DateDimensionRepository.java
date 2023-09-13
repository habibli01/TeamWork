package com.example.teamwork.repository;

import com.example.teamwork.model.ClictStreamFact;
import com.example.teamwork.model.DateDimension;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DateDimensionRepository extends JpaRepository<DateDimension, Long> {

    DateDimension getDateDimensionById(Long id);
}
