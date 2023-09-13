package com.example.teamwork.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ClictStream_Fact")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClictStreamFact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Referrer_Page_ID")
    private Integer ReferrerPageID;
    @Column(name = "Num_Errors")
    private Integer NumErrors;
    @Column(name = "KBytes_Downloaded")
    private Integer KBytesDownloaded;
    @Column(name = "Browsing_Time")
    private Integer BrowsingTime;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "credit_card_dimension_id")
    private CreditCardDimension creditCardDimension;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_dimension_id")
    private CustomerDimension customerDimension;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "date_dimension_id")
    private DateDimension dateDimension;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ipaddress_dimension_id")
    private IPAddressDimension ipaddressDimension;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "page_dimension_id")
    private PageDimension pageDimension;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "session_dimension_id")
    private SessionDimension sessionDimension;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_agent_dimension_id")
    private UserAgentDimension userAgentDimension;

}
