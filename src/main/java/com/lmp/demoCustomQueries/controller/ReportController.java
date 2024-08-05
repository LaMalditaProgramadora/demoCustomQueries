package com.lmp.demoCustomQueries.controller;

import com.lmp.demoCustomQueries.dto.ReportDTO;
import com.lmp.demoCustomQueries.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping(value = "/countPetsByOwnerNativeQuery")
    public List<Map<String, Object>> countPetsByOwnerNativeQuery() {
        return reportService.countPetsByOwnerNativeQuery();
    }

    @GetMapping(value = "/countPetsByOwnerJPQL")
    public List<ReportDTO> countPetsByOwnerJPQL() {
        return reportService.countPetsByOwnerJPQL();
    }
}
