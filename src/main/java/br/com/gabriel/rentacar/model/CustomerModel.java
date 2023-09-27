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
@Table(name = "customers")
public class CustomerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "First_name", nullable = false, length = 50)
    private String FisrtName;

    @Column(name = "Last_name", nullable = false, length = 255)
    private String LastName;

    @Column(nullable = false, length = 50)
    private String city;
}
