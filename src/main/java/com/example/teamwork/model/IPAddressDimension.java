package com.example.teamwork.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "IPAddress_Dimension")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class IPAddressDimension {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Client_IP_Address")
    private Integer ClientIPAddress;
    @Column(name = "IP_Address_Val")
    private String IP_Address_Val;
    @Column(name = "City")
    private String City;
    @Column(name = "State")
    private String State;
    @Column(name = "Country")
    private String Country;

    @OneToMany(mappedBy = "ipaddressDimension", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ClictStreamFact> clictStreamFacts = new ArrayList<>();

}
