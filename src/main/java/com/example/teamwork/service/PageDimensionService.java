package com.example.teamwork.service;

import com.example.teamwork.dto.PageDimensionDto;
import com.example.teamwork.dto.request.PageDimensionRequest;

import java.util.List;

public interface PageDimensionService {
    PageDimensionDto getPageDimensionById(Long id);

    void savePageDimension(PageDimensionRequest pageDimensionRequest);

    void updatePageDimension(PageDimensionRequest pageDimensionRequest);

    void deletePageDimensionById(Long id);

    List<PageDimensionDto> getAll();

}
