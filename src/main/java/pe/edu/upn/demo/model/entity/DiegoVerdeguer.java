package pe.edu.upn.demo.model.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DiegoVerdeguer")
public class DiegoVerdeguer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigo")
	private  int codigo;
	
	@Column(name="nombre", length = 50)
	private String nombre;
	
	@Column(name="nombre", length = 30)
	private String correo;
	
	@Column(name="nombre", length = 60)
	private String direccion;
	
	
}
