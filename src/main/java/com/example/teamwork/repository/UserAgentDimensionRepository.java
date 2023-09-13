package com.example.teamwork.repository;

import com.example.teamwork.model.SessionDimension;
import com.example.teamwork.model.UserAgentDimension;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAgentDimensionRepository extends JpaRepository<UserAgentDimension, Long> {

    UserAgentDimension getUserAgentDimensionById(Long id);
}
