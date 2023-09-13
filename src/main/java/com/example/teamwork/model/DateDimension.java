package com.example.teamwork.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Date_Dimension")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class DateDimension {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Date_Key")
    private Integer DateKey;
    @Column(name = "Date_Val")
    private String DateVal;
    @Column(name = "Date_Description")
    private String DateDescription;
    @Column(name = "Day_Num_In_Fiscal_Month")
    private Integer DayNumInFiscalMonth;
    @Column(name = "Calendar_Year_Month")
    private Integer CalendarYearMonth;
    @Column(name = "Calendar_Year")
    private Integer CalendarYear;

    @OneToMany(mappedBy = "dateDimension", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ClictStreamFact> clictStreamFacts = new ArrayList<>();

}
