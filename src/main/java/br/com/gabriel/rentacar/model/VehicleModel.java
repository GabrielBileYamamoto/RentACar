package br.com.gabriel.rentacar.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "vehicles")
public class VehicleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "model_name", length = 50, nullable = false)
    private  String ModelName;

    @Column(name = "assembler", length = 50, nullable = false)
    private  String Assembler;

    @Column(name = "manufacture_year", nullable = false)
    private int ManufactureYear;

    @Column(name = "model_year", nullable = false)
    private int ModelYear;

}
