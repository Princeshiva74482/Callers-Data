package org.simuserdata.repository;

import static org.simuserdata.utils.Query.USER_DETAILS;

import org.simuserdata.entity.SimUserDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SimUserDetailsRepository extends JpaRepository<SimUserDetailsEntity, String> {
    // Add custom query methods if required
    @Query(value = USER_DETAILS, nativeQuery = true)
    List<SimUserDetailsEntity> userData(String simNumber);
}



