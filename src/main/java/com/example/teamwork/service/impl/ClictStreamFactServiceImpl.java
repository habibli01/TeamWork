package com.example.teamwork.service.impl;

import com.example.teamwork.dto.ClictStreamFactDto;
import com.example.teamwork.dto.request.ClictStreamFactRequest;
import com.example.teamwork.model.ClictStreamFact;
import com.example.teamwork.repository.ClictStreamFactRepository;
import com.example.teamwork.service.ClictStreamFactService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor

public class ClictStreamFactServiceImpl implements ClictStreamFactService {

    final ClictStreamFactRepository clictStreamFactRepository;
    @Override
    public ClictStreamFactDto getClictStreamFactById(Long id) {
        ClictStreamFact clictStreamFact = clictStreamFactRepository.getClictStreamFactById(id);

        return ClictStreamFactDto.builder()
                .NumErrors(clictStreamFact.getNumErrors())
                .KBytesDownloaded((clictStreamFact.getKBytesDownloaded()))
                .BrowsingTime((clictStreamFact.getBrowsingTime())).build();
    }

    @Override
    public void saveClictStreamFact(ClictStreamFactRequest clictStreamFactRequest) {
        ClictStreamFact clictStreamFact = ClictStreamFact.builder()
                .NumErrors(clictStreamFactRequest.getNumErrors())
                .KBytesDownloaded(clictStreamFactRequest.getKBytesDownloaded())
                .BrowsingTime(clictStreamFactRequest.getBrowsingTime()).build();
        clictStreamFactRepository.save(clictStreamFact);

    }

    @Override
    public void updateClictStreamFact(ClictStreamFactRequest clictStreamFactRequest) {
        ClictStreamFact clictStreamFact = ClictStreamFact.builder()
                .ReferrerPageID(clictStreamFactRequest.getReferrerPageID())
                .NumErrors(clictStreamFactRequest.getNumErrors())
                .KBytesDownloaded(clictStreamFactRequest.getKBytesDownloaded())
                .BrowsingTime(clictStreamFactRequest.getBrowsingTime()).build();
        clictStreamFactRepository.save(clictStreamFact);


    }

    @Override
    public void deleteClictStreamFactById(Long id) {
        if (id == null) {
            throw new RuntimeException("There is no such information");

        }
        else {
            clictStreamFactRepository.deleteById(id);
        }

    }

    @Override
    public List<ClictStreamFactDto> getAll() {
        List<ClictStreamFact> clictStreamFacts = clictStreamFactRepository.findAll();
        List<ClictStreamFactDto> clictStreamFactDtos = new ArrayList<>();
        for (ClictStreamFact clictStreamFact : clictStreamFacts)
        {
            ClictStreamFactDto clictStreamFactDto = ClictStreamFactDto.builder()
                    .NumErrors(clictStreamFact.getNumErrors())
                    .KBytesDownloaded((clictStreamFact.getKBytesDownloaded()))
                    .BrowsingTime((clictStreamFact.getBrowsingTime())).build();
            clictStreamFactDtos.add(clictStreamFactDto);


        }
        return clictStreamFactDtos;
    }
}
