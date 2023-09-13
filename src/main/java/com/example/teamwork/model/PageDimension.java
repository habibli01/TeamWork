package com.example.teamwork.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Page_Dimension")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class PageDimension {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Page_Key")
    private Integer PageKey;
    @Column(name = "Page_Name")
    private String PageName;
    @Column(name = "Page_Sub_Domain")
    private String PageSubDomain;
    @Column(name = "Page_Domain")
    private String PageDomain;

    @OneToMany(mappedBy = "pageDimension", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ClictStreamFact> clictStreamFacts = new ArrayList<>();

}
