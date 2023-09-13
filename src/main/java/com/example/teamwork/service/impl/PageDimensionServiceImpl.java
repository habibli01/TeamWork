package com.example.teamwork.service.impl;

import com.example.teamwork.dto.PageDimensionDto;
import com.example.teamwork.dto.request.PageDimensionRequest;
import com.example.teamwork.model.PageDimension;
import com.example.teamwork.repository.PageDimensionRepository;
import com.example.teamwork.service.PageDimensionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class PageDimensionServiceImpl implements PageDimensionService {
    final PageDimensionRepository pageDimensionRepository;
    @Override
    public PageDimensionDto getPageDimensionById(Long id) {
        PageDimension pageDimension =pageDimensionRepository.getPageDimensionById(id);
        return PageDimensionDto.builder()
                .PageKey(pageDimension.getPageKey())
                .PageName(pageDimension.getPageName())
                .PageSubDomain(pageDimension.getPageSubDomain())
                .PageDomain(pageDimension.getPageDomain())
                .build();

    }

    @Override
    public void savePageDimension(PageDimensionRequest pageDimensionRequest) {
        PageDimension pageDimension=PageDimension.builder()
                .PageKey(pageDimensionRequest.getPageKey())
                .PageName(pageDimensionRequest.getPageName())
                .PageSubDomain(pageDimensionRequest.getPageSubDomain())
                .PageDomain(pageDimensionRequest.getPageDomain())
                .build();
        pageDimensionRepository.save(pageDimension);
    }

    @Override
    public void updatePageDimension(PageDimensionRequest pageDimensionRequest) {
        PageDimension pageDimension=PageDimension.builder()
                .PageKey(pageDimensionRequest.getPageKey())
                .PageName(pageDimensionRequest.getPageName())
                .PageSubDomain(pageDimensionRequest.getPageSubDomain())
                .PageDomain(pageDimensionRequest.getPageDomain())
                .build();
        pageDimensionRepository.save(pageDimension);
    }

    @Override
    public void deletePageDimensionById(Long id) {
        if (id == null) {
            throw new RuntimeException("There is no such information");
        } else {
            pageDimensionRepository.deleteById(id);

        }

    }

    @Override
    public List<PageDimensionDto> getAll() {
        List<PageDimension>pageDimensions=pageDimensionRepository.findAll();
        List<PageDimensionDto>pageDimensionDtos=new ArrayList<>();
        for (PageDimension pageDimension:pageDimensions)
        {
            PageDimensionDto pageDimensionDto = PageDimensionDto.builder()
                    .PageKey(pageDimension.getPageKey())
                    .PageName(pageDimension.getPageName())
                    .PageSubDomain(pageDimension.getPageSubDomain())
                    .PageDomain(pageDimension.getPageDomain())
                    .build();
        }
        return pageDimensionDtos;
    }
}
