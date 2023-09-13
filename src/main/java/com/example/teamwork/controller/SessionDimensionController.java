package com.example.teamwork.controller;

import com.example.teamwork.dto.SessionDimensionDto;
import com.example.teamwork.dto.request.SessionDimensionRequest;
import com.example.teamwork.service.SessionDimensionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/sessionDimension")
@RequiredArgsConstructor

public class SessionDimensionController {
    final SessionDimensionService sessionDimensionService;
    @GetMapping(value = "sessionDimensionList")
    public List<SessionDimensionDto> getSessionDimensionInfo(){
        return sessionDimensionService.getAll();
    }
    @GetMapping(value = "/getSessionDimensionById/{id}")
    public SessionDimensionDto getSessionDimensionById(@PathVariable(value = "id")Long id)
    {
        return sessionDimensionService.getSessionDimensionById(id);
    }
    @PostMapping(value = "/saveSessionDimension")
    public void saveSessionDimension (@RequestBody SessionDimensionRequest sessionDimensionRequest)
    {
        sessionDimensionService.saveSessionDimension(sessionDimensionRequest);
    }
    @PostMapping(value = "/updateSessionDimension")
    public void updateSessionDimension (@RequestBody SessionDimensionRequest sessionDimensionRequest)
    {
        sessionDimensionService.updateSessionDimension(sessionDimensionRequest);
    }

    @DeleteMapping(value = "/deleteSessionDimension")
    public void  deleteSessionDimensionById(@PathVariable(value = "id")Long id)
    {
        sessionDimensionService.deleteSessionDimensionById(id);
    }
}

