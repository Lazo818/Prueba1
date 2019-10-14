package pe.edu.upn.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upn.demo.model.entity.LilianCazorla;

@Repository
public interface LilianCazorlaRepository 
	extends JpaRepository<LilianCazorla, Integer>{

}
