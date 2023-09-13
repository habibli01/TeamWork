package com.example.teamwork.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CreditCard_Dimension")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class CreditCardDimension {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Card_Key")
    private Integer CardKey;
    @Column(name = "Card_Holder_Name")
    private Integer CardHolderName;
    @Column(name = "Card_Issuer")
    private String CardIssuer;
    @Column(name = "Card_Expiration_Date")
    private String CardExpirationDate;

    @OneToMany(mappedBy = "creditCardDimension", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ClictStreamFact> clictStreamFacts = new ArrayList<>();

}
