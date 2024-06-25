package com.jpmorganchase.chasejavaproject;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
public class EntityClass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "apiID", nullable = false)
    private int apiID;
    @Column(name = "apiName", nullable = false)
    private String apiName;
    @Column(name = "LOB", nullable = false)
    private String LOB;


}
