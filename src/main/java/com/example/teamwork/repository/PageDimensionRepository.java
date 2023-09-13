package com.example.teamwork.repository;

import com.example.teamwork.model.IPAddressDimension;
import com.example.teamwork.model.PageDimension;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PageDimensionRepository extends JpaRepository<PageDimension, Long> {

    PageDimension getPageDimensionById(Long id);
}
