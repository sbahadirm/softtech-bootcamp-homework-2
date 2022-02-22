package com.bahadirmemis.study2.study2.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Entity
@Table(name = "CITY")
@Getter
@Setter
public class City {

    @GeneratedValue(generator = "City")
    @SequenceGenerator(name = "City", sequenceName = "CITY_ID_SEQ")
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "PLATE_CODE", length = 5, nullable = false)
    private String plateCode;

    @Column(name = "ID_COUNTRY")
    private Long countryId;
}
