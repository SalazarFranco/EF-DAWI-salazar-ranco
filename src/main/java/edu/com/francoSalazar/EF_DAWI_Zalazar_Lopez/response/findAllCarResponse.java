package edu.com.francoSalazar.EF_DAWI_Zalazar_Lopez.response;


import edu.com.francoSalazar.EF_DAWI_Zalazar_Lopez.dto.CarDto;

import java.util.List;

public record findAllCarResponse(
        String code,
        String error,
        List<CarDto> cars
) {
}
