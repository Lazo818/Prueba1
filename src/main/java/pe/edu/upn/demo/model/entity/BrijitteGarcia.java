package pe.edu.upn.demo.model.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "brijitte")
public class BrijitteGarcia {
	@Id
	@Column(name = "especial_id", length = 5)
	private String id;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ed")
	private Integer edad;
	
	@Column(name = "dir_medico", length = 50)
	private String direccion;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	

}
