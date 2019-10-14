package pe.edu.upn.demo.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "datos")
public class AdrianMorgan {

	@Id
	@Column(name = "codigo", length = 9)
	private String codigo;
	
	@Column(name = "nombre", length = 20, nullable = false)
	private String nombre;
	
	@Column(name = "edad")
	private Integer edad;
	
	@Column(name = "direccion", length = 50)
	private String direccion;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
