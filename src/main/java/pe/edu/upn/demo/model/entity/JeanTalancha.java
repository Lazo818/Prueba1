package pe.edu.upn.demo.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "JeanPaul")
public class JeanTalancha {
	@Column(name = "DNI_")
	private Integer dni;
	@Column(name = "nom_Completo", length = 30, nullable = false )
	private String nombre;
	@Column(name = "Direccion_", length = 30, nullable = false )
	private String direccion;
	@Column(name = "Edad_")
	private int edad;
	
	
	
}
