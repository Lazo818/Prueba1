package pe.edu.upn.demo.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="LilianCazorla")
public class LilianCazorla {
	@Id
	@Column(name="codigo")
	private Integer codigo;
	
	@Column(name="nombre" , length = 20 , nullable = false)
	private String nombre;
	
	@Column(name="edad" , length = 2 , nullable = false)
	private Integer edad;
	
	@Column(name="direccion" , length = 30 , nullable = false)
	private Integer direccion;
	
	
	

}
