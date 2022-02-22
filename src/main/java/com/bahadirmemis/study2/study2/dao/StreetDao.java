package com.bahadirmemis.study2.study2.dao;

import com.bahadirmemis.study2.study2.entity.Street;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Repository
public interface StreetDao extends JpaRepository<Street, Long> {

    List<Street> findAllByNeighborhoodId(Long neighborhoodId);
}
