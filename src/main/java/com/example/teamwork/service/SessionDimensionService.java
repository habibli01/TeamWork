package com.example.teamwork.service;

import com.example.teamwork.dto.SessionDimensionDto;
import com.example.teamwork.dto.request.SessionDimensionRequest;

import java.util.List;

public interface SessionDimensionService {
    SessionDimensionDto getSessionDimensionById(Long id);

    void saveSessionDimension(SessionDimensionRequest sessionDimensionRequest);
    void updateSessionDimension(SessionDimensionRequest sessionDimensionRequest);
    void deleteSessionDimensionById(Long id);

    List<SessionDimensionDto> getAll();
}
