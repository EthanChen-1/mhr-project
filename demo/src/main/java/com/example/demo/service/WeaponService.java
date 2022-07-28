package com.example.demo.service;

import com.example.demo.model.Weapon;
import com.example.demo.repository.WeaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class WeaponService {
    WeaponRepository weaponRepository;

    @Autowired
    public WeaponService(WeaponRepository weaponRepository) {
        this.weaponRepository = weaponRepository;
    }

    public Iterable<Weapon> getAllWeapons(){
        return weaponRepository.findAll();
    }

    public Weapon getWeaponById(Long id){
        if(weaponRepository.existsById(id)){
            Optional<Weapon> weaponFromDB = weaponRepository.findById(id);
            return weaponFromDB.get();
        }
        return null;
    }

    public void addNewWeapon(Weapon weapon){
        weaponRepository.save(weapon);
    }
}
