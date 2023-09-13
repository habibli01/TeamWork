package com.example.teamwork.controller;


import com.example.teamwork.dto.PageDimensionDto;
import com.example.teamwork.dto.request.PageDimensionRequest;
import com.example.teamwork.service.PageDimensionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pageDimension")
@RequiredArgsConstructor

public class PageDimensionController {
    final PageDimensionService pageDimensionService;
    @GetMapping(value = "pageDimensionList")
    public List<PageDimensionDto> getPageDimensionInfo(){
        return pageDimensionService.getAll();
    }
    @GetMapping(value = "/getPageDimensionById/{id}")
    public PageDimensionDto getPageDimensionById(@PathVariable(value = "id")Long id)
    {
        return pageDimensionService.getPageDimensionById(id);
    }
    @PostMapping(value = "/savePageDimension")
    public void savePageDimension (@RequestBody PageDimensionRequest pageDimensionRequest)
    {
        pageDimensionService.savePageDimension(pageDimensionRequest);
    }
    @PostMapping(value = "/updatePageDimension")
    public void updatePageDimension (@RequestBody PageDimensionRequest pageDimensionRequest)
    {
        pageDimensionService.updatePageDimension(pageDimensionRequest);
    }

    @DeleteMapping(value = "/deletePageDimension")
    public void deletePageDimensionById(@PathVariable(value = "id")Long id)
    {
        pageDimensionService.deletePageDimensionById(id);
    }
}


