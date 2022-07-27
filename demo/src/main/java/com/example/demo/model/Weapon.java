package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Weapon {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String weaponName;

    private int weaponDamage;

    private double weaponAffinity;

    private String elementalDamageType;

    private int elementalDamage;
}
