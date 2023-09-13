package com.example.teamwork.controller;


import com.example.teamwork.dto.IPAddressDimensionDto;
import com.example.teamwork.dto.request.IPAddressDimensionRequest;
import com.example.teamwork.service.IPAddressDimensionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/iPAddressDimension")
@RequiredArgsConstructor
public class IPAddressDimensionController {
    final IPAddressDimensionService ipAddressDimensionService;
    @GetMapping(value = "iPAddressDimensionList")
    public List<IPAddressDimensionDto> getIPAddressDimensionInfo(){
        return ipAddressDimensionService.getAll();
    }
    @GetMapping(value = "/getIPAddressDimensionById/{id}")
    public IPAddressDimensionDto getIPAddressDimensionById(@PathVariable(value = "id")Long id)
    {
        return ipAddressDimensionService.getIPAddressDimensionById(id);
    }
    @PostMapping(value = "/saveIPAddressDimension")
    public void saveIPAddressDimension (@RequestBody IPAddressDimensionRequest iPAddressDimensionRequest)
    {
        ipAddressDimensionService.saveIPAddressDimension(iPAddressDimensionRequest);
    }
    @PostMapping(value = "/updateIPAddressDimension")
    public void updateIPAddressDimension (@RequestBody IPAddressDimensionRequest iPAddressDimensionRequest)
    {
        ipAddressDimensionService.updateIPAddressDimension(iPAddressDimensionRequest);
    }

    @DeleteMapping(value = "/deleteIPAddressDimension")
    public void deleteIPAddressDimension (@PathVariable(value = "id")Long id)
    {
        ipAddressDimensionService.deleteIPAddressDimensionById(id);
    }
}

