package com.bahadirmemis.study2.study2.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Entity
@Table(name = "STREET")
@Getter
@Setter
public class Street {

    @Id
    @SequenceGenerator(name = "Street", sequenceName = "STREET_ID_SEQ")
    @GeneratedValue(generator = "Street")
    private Long id;

    @Column(name = "NAME", length = 150, nullable = false)
    private String name;

    @Column(name = "ID_NEIGHBORHOOD")
    private Long neighborhoodId;
}
