package com.SWP.WebServer.repository;

import com.SWP.WebServer.entity.CVApply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CVRepository extends JpaRepository<CVApply, Integer> {
    CVApply findByCvId(int cv_id);
}
