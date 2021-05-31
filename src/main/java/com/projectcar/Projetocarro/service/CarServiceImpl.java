package com.projectcar.Projetocarro.service;

import com.projectcar.Projetocarro.model.Car;
import com.projectcar.Projetocarro.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Car save(Car car){
        return productRepository.save(car);
    }

    @Override
    public List<Car> findAll(){
        return productRepository.findAll();
    }

    @Override
    public Optional<Car> findById(Long id){
        return productRepository.findById(id);
    }

    @Override
    public Car update(Car car){
        return productRepository.save(car);
    }

    @Override
    public void deletById(Long id) {
        productRepository.deleteById(id);

    }

    @Override
    public void deleteById(Long id){
        productRepository.deleteById(id);
    }
}
