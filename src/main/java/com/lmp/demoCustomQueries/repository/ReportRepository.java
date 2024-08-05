package com.lmp.demoCustomQueries.repository;

import com.lmp.demoCustomQueries.dto.ReportDTO;
import com.lmp.demoCustomQueries.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ReportRepository extends JpaRepository<Owner, Integer> {

    @Query(value = "SELECT O.ID AS ownerId, CONCAT(O.FIRST_NAME, ' ', O.LAST_NAME) AS ownerName, COUNT(O.ID) AS petCount " +
            "FROM OWNER_PET OP " +
            "JOIN OWNER O ON OP.OWNER_ID = O.ID " +
            "GROUP BY O.ID " +
            "ORDER BY O.ID", nativeQuery = true)
    List<Map<String, Object>> countPetsByOwnerNativeQuery();

    @Query(value = "SELECT new com.lmp.demoCustomQueries.dto.ReportDTO(o.id, CONCAT(o.firstName, ' ', o.lastName), COUNT(o.id)) " +
            "FROM OwnerPet op " +
            "JOIN op.owner o " +
            "GROUP BY o.id " +
            "ORDER BY o.id")
    List<ReportDTO> countPetsByOwnerJPQL();
}
