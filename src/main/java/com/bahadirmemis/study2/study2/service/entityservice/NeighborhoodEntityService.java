package com.bahadirmemis.study2.study2.service.entityservice;

import com.bahadirmemis.study2.study2.dao.NeighborhoodDao;
import com.bahadirmemis.study2.study2.entity.Neighborhood;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;
import java.util.Optional;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Service
@RequiredArgsConstructor
public class NeighborhoodEntityService {

    private final NeighborhoodDao neighborhoodDao;

    public Neighborhood save(Neighborhood neighborhood){
        return neighborhoodDao.save(neighborhood);
    }

    public Neighborhood updateNeighborhoodName(Long id, String name){
        Optional<Neighborhood> neighborhoodOptional = neighborhoodDao.findById(id);

        Neighborhood neighborhood;
        if (neighborhoodOptional.isPresent()){
            neighborhood = neighborhoodOptional.get();
        } else {
            throw new NotFoundException("Item not found!");
        }

        neighborhood.setName(name);

        return neighborhoodDao.save(neighborhood);
    }

    public List<Neighborhood> findAllByDistrictId(Long districtId){
        return neighborhoodDao.findAllByDistrictId(districtId);
    }
}
