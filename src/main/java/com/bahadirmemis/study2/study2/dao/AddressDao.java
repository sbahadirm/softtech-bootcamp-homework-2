package com.bahadirmemis.study2.study2.dao;

import com.bahadirmemis.study2.study2.dto.AddressDetailDto;
import com.bahadirmemis.study2.study2.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Repository
public interface AddressDao extends JpaRepository<Address, Long> {

    @Query(" select new com.bahadirmemis.study2.study2.dto.AddressDetailDto( " +
                    " country.name, city.name " +
                    " ) " +
                    " from Address adr left join Country country on adr.countryId = country.id " +
                    " left join City city on adr.cityId = city.id " +
                    "where adr.id = :id "
    )
    AddressDetailDto findAddressDetails(@Param("id") Long id);
}
