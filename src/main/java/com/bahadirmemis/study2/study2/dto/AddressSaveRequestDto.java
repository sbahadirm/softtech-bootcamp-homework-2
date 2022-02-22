package com.bahadirmemis.study2.study2.dto;

import lombok.Data;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Data
public class AddressSaveRequestDto {

    private Long countryId;
    private Long cityId;
    private Long districtId;
    private Long neighborhoodId;
    private Long streetId;
    private String doorNumber;
    private String apartmentNumber;
}
