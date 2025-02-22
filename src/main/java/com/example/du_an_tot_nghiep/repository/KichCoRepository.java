package com.example.du_an_tot_nghiep.repository;

import com.example.du_an_tot_nghiep.entity.KichCo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface KichCoRepository extends JpaRepository<KichCo, Long> {
    Page<KichCo> findByTenKichCoContainingIgnoreCase(String tenKichCo, Pageable pageable);
}
