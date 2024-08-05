package com.lmp.demoCustomQueries.service;

import com.lmp.demoCustomQueries.dto.ReportDTO;
import com.lmp.demoCustomQueries.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ReportService {

    @Autowired
    private ReportRepository reportRepository;

    public List<Map<String, Object>> countPetsByOwnerNativeQuery() {
        return reportRepository.countPetsByOwnerNativeQuery();
    }

    public List<ReportDTO> countPetsByOwnerJPQL() {
        return reportRepository.countPetsByOwnerJPQL();
    }
}
