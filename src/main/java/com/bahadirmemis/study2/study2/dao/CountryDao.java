package com.bahadirmemis.study2.study2.dao;

import com.bahadirmemis.study2.study2.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Repository
public interface CountryDao extends JpaRepository<Country, Long> {

    Country findByCode(String code);

}
