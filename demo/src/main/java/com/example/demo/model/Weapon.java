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

    public Weapon(String weaponName, int weaponDamage, double weaponAffinity, String elementalDamageType, int elementalDamage) {
        this.weaponName = weaponName;
        this.weaponDamage = weaponDamage;
        this.weaponAffinity = weaponAffinity;
        this.elementalDamageType = elementalDamageType;
        this.elementalDamage = elementalDamage;
    }

    public Weapon() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public double getWeaponAffinity() {
        return weaponAffinity;
    }

    public void setWeaponAffinity(double weaponAffinity) {
        this.weaponAffinity = weaponAffinity;
    }

    public String getElementalDamageType() {
        return elementalDamageType;
    }

    public void setElementalDamageType(String elementalDamageType) {
        this.elementalDamageType = elementalDamageType;
    }

    public int getElementalDamage() {
        return elementalDamage;
    }

    public void setElementalDamage(int elementalDamage) {
        this.elementalDamage = elementalDamage;
    }
}
