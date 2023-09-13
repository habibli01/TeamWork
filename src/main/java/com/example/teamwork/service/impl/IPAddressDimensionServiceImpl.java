package com.example.teamwork.service.impl;

import com.example.teamwork.dto.IPAddressDimensionDto;
import com.example.teamwork.dto.request.IPAddressDimensionRequest;
import com.example.teamwork.model.IPAddressDimension;
import com.example.teamwork.repository.IPAddressDimensionRepository;
import com.example.teamwork.service.IPAddressDimensionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class IPAddressDimensionServiceImpl implements IPAddressDimensionService {
    final IPAddressDimensionRepository ipAddressDimensionRepository;
    @Override
    public IPAddressDimensionDto getIPAddressDimensionById(Long id) {
        IPAddressDimension ipAddressDimension=ipAddressDimensionRepository.getIPAddressDimensionById(id);
        return IPAddressDimensionDto.builder()
                .City(ipAddressDimension.getCity())
                .State(ipAddressDimension.getState())
                .Country(ipAddressDimension.getCountry())
                .build();

    }

    @Override
    public void saveIPAddressDimension(IPAddressDimensionRequest ipAddressDimensionRequest) {
        IPAddressDimension ipAddressDimension=IPAddressDimension.builder()
                .City(ipAddressDimensionRequest.getCity())
                .State(ipAddressDimensionRequest.getState())
                .Country(ipAddressDimensionRequest.getCountry())
                .build();
        ipAddressDimensionRepository.save(ipAddressDimension);

    }

    @Override
    public void updateIPAddressDimension(IPAddressDimensionRequest ipAddressDimensionRequest) {
        IPAddressDimension ipAddressDimension=IPAddressDimension.builder()
                .City(ipAddressDimensionRequest.getCity())
                .State(ipAddressDimensionRequest.getState())
                .Country(ipAddressDimensionRequest.getCountry())
                .build();
        ipAddressDimensionRepository.save(ipAddressDimension);

    }

    @Override
    public void deleteIPAddressDimensionById(Long id) {
        if (id == null) {
            throw new RuntimeException("There is no such information");
        } else {
            ipAddressDimensionRepository.deleteById(id);

        }
    }


    @Override
    public List<IPAddressDimensionDto> getAll(){
        List<IPAddressDimension> ipAddressDimensions = ipAddressDimensionRepository.findAll();
        List<IPAddressDimensionDto> ipAddressDimensionDtos = new ArrayList<>();
        for (IPAddressDimension ipAddressDimension : ipAddressDimensions)
        {
            IPAddressDimensionDto ipAddressDimensionDto = IPAddressDimensionDto.builder()
                    .City(ipAddressDimension.getCity())
                    .State(ipAddressDimension.getState())
                    .Country(ipAddressDimension.getCountry())
                    .build();
        }
        return ipAddressDimensionDtos;
    }
}
