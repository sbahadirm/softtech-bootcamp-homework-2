package com.bahadirmemis.study2.study2.service.entityservice;

import com.bahadirmemis.study2.study2.dao.CountryDao;
import com.bahadirmemis.study2.study2.entity.Country;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Service
@RequiredArgsConstructor
public class CountryEntityService {

    private final CountryDao countryDao;

    public List<Country> findAll(){
        return countryDao.findAll();
    }

    public Country save(Country country){
        return countryDao.save(country);
    }

    public Country findByCountryCode(String countryCode){
        return countryDao.findByCode(countryCode);
    }
}
