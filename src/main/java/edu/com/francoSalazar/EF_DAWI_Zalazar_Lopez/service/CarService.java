package edu.com.francoSalazar.EF_DAWI_Zalazar_Lopez.service;

import edu.com.francoSalazar.EF_DAWI_Zalazar_Lopez.dto.CarCreateDto;
import edu.com.francoSalazar.EF_DAWI_Zalazar_Lopez.dto.CarDetailDto;
import edu.com.francoSalazar.EF_DAWI_Zalazar_Lopez.dto.CarDto;

import java.util.List;
import java.util.Optional;

public interface CarService {

    List<CarDto> findAllCar() throws Exception;

    Optional<CarDetailDto> findDetailCar(Integer id) throws Exception;

    boolean updateCar(CarDto car) throws Exception;

    boolean createCar(CarCreateDto car) throws Exception;

    boolean deleteCar(Integer id) throws Exception;

}
