package com.projectcar.Projetocarro.service;

import com.projectcar.Projetocarro.model.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {

    Car save(Car car);

    List<Car> findAll();

    Optional<Car> findById(Long id);

    Car update(Car car);

    void deletById(Long id);

    void deleteById(Long id);
}
