package com.bahadirmemis.study2.study2.service.entityservice;

import com.bahadirmemis.study2.study2.dao.StreetDao;
import com.bahadirmemis.study2.study2.entity.Street;
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
public class StreetEntityService {

    private final StreetDao streetDao;

    public Street save(Street street){
        return streetDao.save(street);
    }

    public Street updateStreetName(Long id, String name){
        Optional<Street> streetOptional = streetDao.findById(id);

        Street street;
        if (streetOptional.isPresent()){
            street = streetOptional.get();
        } else {
            throw new NotFoundException("Item not found!");
        }

        street.setName(name);

        return streetDao.save(street);
    }

    public List<Street> findAllByNeighborhoodId(Long neighborhoodId){
        return streetDao.findAllByNeighborhoodId(neighborhoodId);
    }
}
