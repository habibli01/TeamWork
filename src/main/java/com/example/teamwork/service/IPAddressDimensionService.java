package com.example.teamwork.service;

import com.example.teamwork.dto.IPAddressDimensionDto;
import com.example.teamwork.dto.request.IPAddressDimensionRequest;

import java.util.List;

public interface IPAddressDimensionService {
    IPAddressDimensionDto getIPAddressDimensionById(Long id);

    void saveIPAddressDimension(IPAddressDimensionRequest ipAddressDimensionRequest);

    void updateIPAddressDimension(IPAddressDimensionRequest ipAddressDimensionRequest);

    void deleteIPAddressDimensionById(Long id);

    List<IPAddressDimensionDto> getAll();

}
