package com.example.teamwork.service.impl;

import com.example.teamwork.dto.SessionDimensionDto;
import com.example.teamwork.dto.request.SessionDimensionRequest;
import com.example.teamwork.model.SessionDimension;
import com.example.teamwork.repository.SessionDimensionRepository;
import com.example.teamwork.service.SessionDimensionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class SessionDimensionServiceImpl implements SessionDimensionService {
    final SessionDimensionRepository sessionDimensionRepository;
    @Override
    public SessionDimensionDto getSessionDimensionById(Long id) {
        SessionDimension sessionDimension=sessionDimensionRepository.getSessionDimensionById(id);
        return SessionDimensionDto.builder()
                .SessionKey(sessionDimension.getSessionKey())
                .SessionStartTime(sessionDimension.getSessionStartTime())
                .SessionEndTime(sessionDimension.getSessionEndTime())
                .Duration(sessionDimension.getDuration())
                .build();
    }

    @Override
    public void saveSessionDimension(SessionDimensionRequest sessionDimensionRequest) {
        SessionDimension sessionDimension = SessionDimension.builder()
                .SessionKey(sessionDimensionRequest.getSessionKey())
                .SessionStartTime(sessionDimensionRequest.getSessionStartTime())
                .SessionEndTime(sessionDimensionRequest.getSessionEndTime())
                .Duration(sessionDimensionRequest.getDuration())
                .build();
    }

    @Override
    public void updateSessionDimension(SessionDimensionRequest sessionDimensionRequest) {
        SessionDimension sessionDimension= SessionDimension.builder()
                .SessionKey(sessionDimensionRequest.getSessionKey())
                .SessionStartTime(sessionDimensionRequest.getSessionStartTime())
                .SessionEndTime(sessionDimensionRequest.getSessionEndTime())
                .Duration(sessionDimensionRequest.getDuration())
                .build();

    }

    @Override
    public void deleteSessionDimensionById(Long id) {
        if (id == null) {
            throw new RuntimeException("There is no such information");
        } else {
            sessionDimensionRepository.deleteById(id);


        }
    }

    @Override
    public List<SessionDimensionDto> getAll() {
        List<SessionDimension>sessionDimensions= sessionDimensionRepository.findAll();
        List<SessionDimensionDto>sessionDimensionDtos=new ArrayList<>();
        for (SessionDimension sessionDimension : sessionDimensions)
        {
            SessionDimensionDto sessionDimensionDto1=SessionDimensionDto.builder()
                    .SessionKey(sessionDimension.getSessionKey())
                    .SessionStartTime(sessionDimension.getSessionStartTime())
                    .SessionEndTime(sessionDimension.getSessionEndTime())
                    .Duration(sessionDimension.getDuration())
                    .build();
        }
        return sessionDimensionDtos;
    }
}
