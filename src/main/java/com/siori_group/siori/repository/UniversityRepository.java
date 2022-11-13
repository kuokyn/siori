package com.siori_group.siori.repository;

import com.siori_group.siori.entity.Company;
import com.siori_group.siori.entity.University;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityRepository extends JpaRepository<University, Long> {

    Page<University> findAll(Pageable pageable);
}
