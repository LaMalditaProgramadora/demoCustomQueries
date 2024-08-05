package com.lmp.demoCustomQueries.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReportDTO {
    private int ownerId;
    private String ownerName;
    private long petCount;

}
