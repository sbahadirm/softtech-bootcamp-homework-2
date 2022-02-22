package com.bahadirmemis.study2.study2.converter;

import com.bahadirmemis.study2.study2.dto.AddressResponseDto;
import com.bahadirmemis.study2.study2.dto.AddressSaveRequestDto;
import com.bahadirmemis.study2.study2.entity.Address;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    Address convertToAddress(AddressSaveRequestDto addressSaveRequestDto);

    AddressResponseDto convertToAddressResponseDto(Address address);

}
