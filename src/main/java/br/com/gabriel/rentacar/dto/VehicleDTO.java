package br.com.gabriel.rentacar.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class VehicleDTO {

    private int id;

    private String ModelName;

    private String Assembler;

    private int ManufactureYear;

    private int ModelYear;
}
