package com.example.teamwork.repository;

import com.example.teamwork.model.ClictStreamFact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClictStreamFactRepository  extends JpaRepository<ClictStreamFact , Long> {

    ClictStreamFact getClictStreamFactById(Long id);
}
