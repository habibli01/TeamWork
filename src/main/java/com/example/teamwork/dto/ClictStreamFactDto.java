package com.example.teamwork.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ClictStreamFactDto {
    private Integer NumErrors;
    private Integer KBytesDownloaded;
    private Integer BrowsingTime;
}
