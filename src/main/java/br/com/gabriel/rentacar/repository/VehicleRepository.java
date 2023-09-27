package br.com.gabriel.rentacar.repository;

import br.com.gabriel.rentacar.model.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<VehicleModel, Integer> {
}
