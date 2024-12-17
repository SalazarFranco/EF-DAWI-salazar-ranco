package edu.com.francoSalazar.EF_DAWI_Zalazar_Lopez.response;


import edu.com.francoSalazar.EF_DAWI_Zalazar_Lopez.dto.CarDetailDto;

public record findCarDetailResponse(
        String code,
        String error,
        CarDetailDto car
) {
}
