package pe.edu.upn.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upn.demo.model.entity.EnzoCastillo;

@Repository
public interface EnzoCastilloRepository extends JpaRepository<EnzoCastillo, String> {

}
