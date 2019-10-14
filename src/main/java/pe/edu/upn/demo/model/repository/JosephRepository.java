package pe.edu.upn.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upn.demo.model.entity.Especialidad;
import pe.edu.upn.demo.model.entity.Joseph;

public interface JosephRepository  
extends JpaRepository<Joseph , Integer>{

}
