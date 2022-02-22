package com.bahadirmemis.study2.study2.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Entity
@Table(name = "DISTRICT")
@Getter
@Setter
public class District {

    @Id
    @SequenceGenerator(name = "District", sequenceName = "DISTRICT_ID_SEQ")
    @GeneratedValue(generator = "District")
    private Long id;

    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

    @Column(name = "ID_CITY")
    private Long cityId;
}
