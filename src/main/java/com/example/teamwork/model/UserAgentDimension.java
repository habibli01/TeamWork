package com.example.teamwork.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "UserAgent_Dimension")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class UserAgentDimension {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserAgent_Key")
    private Integer UserAgentKey;
    @Column(name = "Browser_Type")
    private String BrowserType;
    @Column(name = "Browser_Version")
    private String BrowserVersion;
    @Column(name = "Operating_System")
    private String OperatingSystem;
    @Column(name = "Operating_System_Version")
    private String OperatingSystemVersion;
    @Column(name = "Agent_Language")
    private String AgentLanguage;

    @OneToMany(mappedBy = "userAgentDimension", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ClictStreamFact> clictStreamFacts = new ArrayList<>();

}
