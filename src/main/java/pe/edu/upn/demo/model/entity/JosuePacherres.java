package pe.edu.upn.demo.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tabla1")
public class JosuePacherres {

	@Id
	@Column(name="codigo",length = 9)
	private String id;
	
	@Column(name="nombre",length=30, nullable=false)
	private String nombre;
	
	@Column(name="edad",length = 2, nullable=false)
	private Integer edad;
	
	@Column(name="hobbie",length=50)
	private String hobbie;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getHobbie() {
		return hobbie;
	}

	public void setHobbie(String hobbie) {
		this.hobbie = hobbie;
	}
	
}
