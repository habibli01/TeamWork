package com.example.teamwork.repository;

import com.example.teamwork.model.PageDimension;
import com.example.teamwork.model.SessionDimension;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionDimensionRepository extends JpaRepository<SessionDimension, Long> {

    SessionDimension getSessionDimensionById(Long id);
}
