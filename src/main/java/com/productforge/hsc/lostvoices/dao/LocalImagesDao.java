package com.productforge.hsc.lostvoices.dao;

import com.productforge.hsc.lostvoices.dao.domain.LocalImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalImagesDao extends JpaRepository<LocalImageEntity, Long> {
}
