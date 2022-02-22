package com.bahadirmemis.study2.study2.service;

import com.bahadirmemis.study2.study2.dto.AddressDetailDto;
import com.bahadirmemis.study2.study2.dto.AddressResponseDto;
import com.bahadirmemis.study2.study2.dto.AddressSaveRequestDto;
import com.bahadirmemis.study2.study2.entity.*;
import com.bahadirmemis.study2.study2.service.entityservice.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Service
@RequiredArgsConstructor
public class AddressService {

    private final CountryEntityService countryEntityService;
    private final CityEntityService cityEntityService;
    private final DistrictEntityService districtEntityService;
    private final NeighborhoodEntityService neighborhoodEntityService;
    private final StreetEntityService streetEntityService;
    private final AddressEntityService addressEntityService;

    public Country saveCountry(Country country){
        return countryEntityService.save(country);
    }

    public Country findByCountryCode(String code){
        return countryEntityService.findByCountryCode(code);
    }

    public City saveCity(City city){

        return cityEntityService.save(city);
    }

    public City findByPlateCode(String plateCode){
        return cityEntityService.findByPlateCode(plateCode);
    }

    public District saveDistrict(District district){
        return districtEntityService.save(district);
    }

    public List<District> findAllByCityId(Long cityId){
        return districtEntityService.findAllByCityId(cityId);
    }

    public Neighborhood saveNeighborhood(Neighborhood neighborhood){
        return neighborhoodEntityService.save(neighborhood);
    }

    public Neighborhood updateNeighborhoodName(Long id, String name){
        return neighborhoodEntityService.updateNeighborhoodName(id, name);
    }

    public List<Neighborhood> findAllNeighborhoods(Long districtId){
        return neighborhoodEntityService.findAllByDistrictId(districtId);
    }

    public AddressResponseDto saveAddress(AddressSaveRequestDto addressSaveRequestDto){
        return addressEntityService.save(addressSaveRequestDto);
    }

    public void deleteAddress(Long id){
        addressEntityService.delete(id);
    }

    public AddressResponseDto findAddressById(Long id){
        return addressEntityService.findById(id);
    }

    public AddressDetailDto findAddressDetailsById(Long id){
        return addressEntityService.findAddressDetails(id);
    }

    public Street saveStreet(Street street){
        return streetEntityService.save(street);
    }

    public Street updateStreetName(Long id, String name){
        return streetEntityService.updateStreetName(id, name);
    }

    public List<Street> findAllStreets(Long neighborhoodId){
        return streetEntityService.findAllByNeighborhoodId(neighborhoodId);
    }
}
