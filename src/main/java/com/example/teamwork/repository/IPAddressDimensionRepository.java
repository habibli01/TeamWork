package com.example.teamwork.repository;

import com.example.teamwork.model.ClictStreamFact;
import com.example.teamwork.model.IPAddressDimension;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPAddressDimensionRepository extends JpaRepository<IPAddressDimension, Long> {

    IPAddressDimension getIPAddressDimensionById(Long id);
}
