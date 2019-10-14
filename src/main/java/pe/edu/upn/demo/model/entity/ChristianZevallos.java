package pe.edu.upn.demo.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "christian")
public class ChristianZevallos {
	@Id
	@Column(name = "id_usuario", nullable = false)
	private int id;
	
	@Column(name = "edad_usuario", nullable = false)
	private int edad;
	
	@Column(name = "carrera_usuario", length = 30, nullable = false)
	private String carrera;
	
	@Column(name = "genero_usuario", length = 30, nullable = false)
	private String genero;

	
	//metodo getter and setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
	
}
