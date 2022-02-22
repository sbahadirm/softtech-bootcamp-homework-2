package com.bahadirmemis.study2.study2.service.entityservice;

import com.bahadirmemis.study2.study2.dao.CityDao;
import com.bahadirmemis.study2.study2.entity.City;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Service
@RequiredArgsConstructor
public class CityEntityService {

    private final CityDao cityDao;

    public City save(City city){
        return cityDao.save(city);
    }

    public City findByPlateCode(String plateCode){
        return cityDao.findByPlateCode(plateCode);
    }
}
