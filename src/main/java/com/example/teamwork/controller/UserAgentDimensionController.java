package com.example.teamwork.controller;

import com.example.teamwork.dto.UserAgentDimensionDto;
import com.example.teamwork.dto.request.UserAgentDimensionRequest;
import com.example.teamwork.service.UserAgentDimensionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/userAgentDimension")
@RequiredArgsConstructor

public class UserAgentDimensionController {
    final UserAgentDimensionService userAgentDimensionService;

    @GetMapping(value = "userAgentDimensionList")
    public List<UserAgentDimensionDto> getUserAgentDimensionInfo(){
        return userAgentDimensionService.getAll();
    }
    @GetMapping(value = "/getUserAgentDimensionById/{id}")
    public UserAgentDimensionDto getUserAgentDimensionById(@PathVariable(value = "id")Long id)
    {
        return userAgentDimensionService.getUserAgentDimensionById(id);
    }
    @PostMapping(value = "/saveUserAgentDimension")
    public void saveUserAgentDimension (@RequestBody UserAgentDimensionRequest userAgentDimensionRequest)
    {
        userAgentDimensionService.saveUserAgentDimension(userAgentDimensionRequest);
    }
    @PostMapping(value = "/updateUserAgentDimension")
    public void updateUserAgentDimension (@RequestBody UserAgentDimensionRequest userAgentDimensionRequest)
    {
        userAgentDimensionService.updateUserAgentDimension(userAgentDimensionRequest);
    }
    @DeleteMapping(value = "/deleteUserAgentDimension")
    public void deleteUserAgentDimensionById(@PathVariable(value = "id")Long id)
    {
        userAgentDimensionService.deleteUserAgentDimensionById(id);
    }
}


