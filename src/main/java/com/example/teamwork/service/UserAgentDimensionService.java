package com.example.teamwork.service;

import com.example.teamwork.dto.UserAgentDimensionDto;
import com.example.teamwork.dto.request.UserAgentDimensionRequest;

import java.util.List;

public interface UserAgentDimensionService {

    UserAgentDimensionDto getUserAgentDimensionById(Long id);

    void saveUserAgentDimension(UserAgentDimensionRequest userAgentDimensionRequest);

    void updateUserAgentDimension(UserAgentDimensionRequest userAgentDimensionRequest);

    void deleteUserAgentDimensionById(Long id);

    List<UserAgentDimensionDto> getAll();
}
