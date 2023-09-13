package com.example.teamwork.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Customer_Dimension")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class CustomerDimension {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Customer_Key")
    private Integer CustomerKey;
    @Column(name = "Customer_Name")
    private String CustomerName;
    @Column(name = "Customer_Email")
    private String CustomerEmail;
    @Column(name = "Age")
    private String Age;
    @Column(name = "Sex")
    private String Sex;
    @Column(name = "Annual_Income")
    private Integer AnnualIncome;
    @Column(name = "City")
    private String City;
    @Column(name = "Country")
    private String Country;

    @OneToMany(mappedBy = "customerDimension", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ClictStreamFact> clictStreamFacts = new ArrayList<>();

}
