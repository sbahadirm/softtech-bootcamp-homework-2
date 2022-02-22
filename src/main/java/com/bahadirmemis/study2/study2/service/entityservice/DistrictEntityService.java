package com.bahadirmemis.study2.study2.service.entityservice;

import com.bahadirmemis.study2.study2.dao.DistrictDao;
import com.bahadirmemis.study2.study2.entity.District;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Service
@RequiredArgsConstructor
public class DistrictEntityService {

    private final DistrictDao districtDao;

    public District save(District district){
        return districtDao.save(district);
    }

    public List<District> findAllByCityId(Long cityId){
        return districtDao.findAllByCityId(cityId);
    }
}
