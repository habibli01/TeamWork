package com.example.teamwork.service;

import com.example.teamwork.dto.ClictStreamFactDto;
import com.example.teamwork.dto.request.ClictStreamFactRequest;

import java.util.List;

public interface ClictStreamFactService {
    ClictStreamFactDto getClictStreamFactById(Long id);

    void saveClictStreamFact(ClictStreamFactRequest clictStreamFactRequest);

    void updateClictStreamFact(ClictStreamFactRequest clictStreamFactRequest);

    void deleteClictStreamFactById(Long id);


    List<ClictStreamFactDto> getAll();
}
