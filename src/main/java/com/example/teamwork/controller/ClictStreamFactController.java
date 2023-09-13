package com.example.teamwork.controller;

import com.example.teamwork.dto.ClictStreamFactDto;
import com.example.teamwork.dto.request.ClictStreamFactRequest;
import com.example.teamwork.service.ClictStreamFactService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clictstreamfact")
@RequiredArgsConstructor

public class ClictStreamFactController
{
    final ClictStreamFactService clictStreamFactService;

    @GetMapping(value = "/clictstreamfactList")

    public List<ClictStreamFactDto> getClictsStreamFactInto(){

        return clictStreamFactService.getAll();
    }
    @GetMapping(value = "/getClictStreamFactById/{id}")
    public ClictStreamFactDto getClictStreamFactById(@PathVariable(value = "id")Long id)
    {
        return clictStreamFactService.getClictStreamFactById(id);
    }

    @PostMapping(value = "/saveClictStreamFact")
    public void saveClictStreamFact(@RequestBody ClictStreamFactRequest clictStreamFactRequest)
    {
        clictStreamFactService.saveClictStreamFact(clictStreamFactRequest);
    }
    @PostMapping(value = "/updateClictStreamFact")
    public void updateClictStreamFact(@RequestBody ClictStreamFactRequest clictStreamFactRequest)
    {
        clictStreamFactService.updateClictStreamFact(clictStreamFactRequest);
    }

    @DeleteMapping(value = "/deleteByReferrerPageID/{id}")
    public void deleteByReferrerPageID(@PathVariable(value = "id")Long id)
    {
        clictStreamFactService.deleteClictStreamFactById(id);
    }

}