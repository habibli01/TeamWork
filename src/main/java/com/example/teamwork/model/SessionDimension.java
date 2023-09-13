package com.example.teamwork.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Session_Dimension")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class SessionDimension {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "Session_Key")
    private Integer SessionKey;
    @Column(name = "Session_Start_Time")
    private String SessionStartTime;
    @Column(name = "Session_End_Time")
    private String SessionEndTime;
    @Column(name = "Duration")
    private Integer Duration;
    @Column(name = "Server_IP")
    private String ServerIP;
    @Column(name = "Client_IP")
    private String ClientIP;

    @OneToMany(mappedBy = "sessionDimension", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ClictStreamFact> clictStreamFacts = new ArrayList<>();

}
