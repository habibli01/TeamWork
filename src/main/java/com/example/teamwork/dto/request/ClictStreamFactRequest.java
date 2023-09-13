package com.example.teamwork.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClictStreamFactRequest {

    private Integer ReferrerPageID;
    private Integer NumErrors;
    private Integer KBytesDownloaded;
    private Integer BrowsingTime;
}
