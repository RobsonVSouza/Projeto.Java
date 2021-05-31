package com.projectcar.Projetocarro.controller;

import com.projectcar.Projetocarro.model.Car;
import com.projectcar.Projetocarro.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/car")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public ResponseEntity<List<Car>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(carService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Car>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(carService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Car> create(@RequestBody Car car){
        return ResponseEntity.status(HttpStatus.CREATED).body(carService.save(car));

    }

    @PutMapping
    public ResponseEntity<Car> update(@RequestBody Car car){
        return ResponseEntity.status(HttpStatus.OK).body(carService.update(car));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        carService.deletById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
