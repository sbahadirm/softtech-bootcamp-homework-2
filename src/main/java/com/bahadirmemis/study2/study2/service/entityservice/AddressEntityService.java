package com.bahadirmemis.study2.study2.service.entityservice;

import com.bahadirmemis.study2.study2.converter.AddressMapper;
import com.bahadirmemis.study2.study2.dao.AddressDao;
import com.bahadirmemis.study2.study2.dto.AddressDetailDto;
import com.bahadirmemis.study2.study2.dto.AddressResponseDto;
import com.bahadirmemis.study2.study2.dto.AddressSaveRequestDto;
import com.bahadirmemis.study2.study2.entity.Address;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Service
@RequiredArgsConstructor
public class AddressEntityService {

    private final AddressDao addressDao;

    public AddressResponseDto save(AddressSaveRequestDto addressSaveRequestDto){

        Address address = AddressMapper.INSTANCE.convertToAddress(addressSaveRequestDto);

        address = addressDao.save(address);

        AddressResponseDto addressResponseDto = AddressMapper.INSTANCE.convertToAddressResponseDto(address);

        return addressResponseDto;
    }

    public void delete(Long id){

        Address address = getById(id);

        addressDao.delete(address);
    }

    public AddressResponseDto findById(Long id){

        Address address = getById(id);

        AddressResponseDto addressResponseDto = AddressMapper.INSTANCE.convertToAddressResponseDto(address);

        return addressResponseDto;
    }

    public AddressDetailDto findAddressDetails(Long id){
        return addressDao.findAddressDetails(id);
    }

    private Address getById(Long id) {

        Optional<Address> addressOptional = addressDao.findById(id);

        Address address;
        if (addressOptional.isPresent()) {
            address = addressOptional.get();
        } else {
            throw new RuntimeException("Item not found!");
        }
        return address;
    }
}
