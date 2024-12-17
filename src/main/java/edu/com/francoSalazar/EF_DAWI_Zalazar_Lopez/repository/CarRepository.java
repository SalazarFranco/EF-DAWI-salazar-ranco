package edu.com.francoSalazar.EF_DAWI_Zalazar_Lopez.repository;

import edu.com.francoSalazar.EF_DAWI_Zalazar_Lopez.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
}
