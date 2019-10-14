package pe.edu.upn.demo.model.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class DiegoNoblecilla {
	
	@Id
	@Column(name = "ape_nombre", length = 60)
	private String nombre;
	
	@Column(name = "dir",length = 50)
	private String direccion;
	
	@Column(name = "edad")
	private Integer edad;
	
	@Column(name = "est_civil")
	private String estadoCivil;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	

}
