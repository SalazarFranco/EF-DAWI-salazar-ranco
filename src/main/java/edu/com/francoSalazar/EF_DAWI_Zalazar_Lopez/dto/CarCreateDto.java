package edu.com.francoSalazar.EF_DAWI_Zalazar_Lopez.dto;

public record CarCreateDto(
        Integer carId,
         String make,
         String model,
         int year,
         String vin,
         String licensePlate,
         String ownerName,
         String ownerContact,
         int mileage,
         String engineType,
         String color,
         String insuranceCompany
) {
}
