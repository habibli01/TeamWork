package com.example.teamwork.service.impl;

import com.example.teamwork.dto.UserAgentDimensionDto;
import com.example.teamwork.dto.request.UserAgentDimensionRequest;
import com.example.teamwork.model.UserAgentDimension;
import com.example.teamwork.repository.UserAgentDimensionRepository;
import com.example.teamwork.service.UserAgentDimensionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class UserAgentDimensionServiceImpl implements UserAgentDimensionService {
    final UserAgentDimensionRepository userAgentDimensionRepository;
    @Override
    public UserAgentDimensionDto getUserAgentDimensionById(Long id) {

        UserAgentDimension userAgentDimension=userAgentDimensionRepository.getUserAgentDimensionById(id);
        return UserAgentDimensionDto.builder()
                .UserAgentKey(userAgentDimension.getUserAgentKey())
                .build();
    }

    @Override
    public void saveUserAgentDimension(UserAgentDimensionRequest userAgentDimensionRequest) {
        UserAgentDimension userAgentDimension=UserAgentDimension.builder()
                .UserAgentKey(userAgentDimensionRequest.getUserAgentKey())
                .build();

    }

    @Override
    public void updateUserAgentDimension(UserAgentDimensionRequest userAgentDimensionRequest) {
        UserAgentDimension userAgentDimension=UserAgentDimension.builder()
                .UserAgentKey(userAgentDimensionRequest.getUserAgentKey())
                .build();
    }

    @Override
    public void deleteUserAgentDimensionById(Long id) {
        if (id == null) {
            throw new RuntimeException("There is no such information");
        } else {
            userAgentDimensionRepository.deleteById(id);


        }

    }

    @Override
    public List<UserAgentDimensionDto> getAll() {

        List<UserAgentDimension> userAgentDimensions = userAgentDimensionRepository.findAll();
        List<UserAgentDimensionDto> userAgentDimensionDtos = new ArrayList<>();
        for (UserAgentDimension userAgentDimension : userAgentDimensions)
        {
            UserAgentDimensionDto userAgentDimensionDto = UserAgentDimensionDto.builder()
                    .UserAgentKey(userAgentDimension.getUserAgentKey())
                    .build();
        }
        return userAgentDimensionDtos;
     }

}
