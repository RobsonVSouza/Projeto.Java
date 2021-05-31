package com.projectcar.Projetocarro.repository;

import com.projectcar.Projetocarro.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Car,Long> {

}
