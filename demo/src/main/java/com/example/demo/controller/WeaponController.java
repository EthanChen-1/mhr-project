package com.example.demo.controller;

import com.example.demo.model.Weapon;
import com.example.demo.service.WeaponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/weapon")
public class WeaponController {
    WeaponService weaponService;

    @Autowired
    public WeaponController(WeaponService weaponService) {
        this.weaponService = weaponService;
    }

    @GetMapping
    public ResponseEntity<Weapon> getAllWeapons(){
        Iterable<Weapon> allWeapons = weaponService.getAllWeapons();
        return new ResponseEntity(allWeapons, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Weapon>> getWeaponByID(@PathVariable Long id){
        Optional<Weapon> weaponById = weaponService.getWeaponById(id);
        if(weaponById == null){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(weaponById, HttpStatus.OK);
    }
}
