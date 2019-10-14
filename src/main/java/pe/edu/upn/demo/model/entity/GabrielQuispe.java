package pe.edu.upn.demo.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "Gabriel Quispe Rosas")
public class GabrielQuispe {
	@Column( name ="nombre",length = 50)
	private String Nombre;
	
	@Column(name ="apellidomaterno", length = 50)
	private String ApellidoMaterno;
	
	@Column(name ="apellidopaterno", length = 50)
	private String ApellidoPaterno;
	
	@Column(name ="edad")
	private Integer Edad;
	@Id
	@Column( name ="codigo", length = 5)
	private String DNI;
	
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidoMaterno() {
		return ApellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		ApellidoMaterno = apellidoMaterno;
	}
	public String getApellidoPaterno() {
		return ApellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		ApellidoPaterno = apellidoPaterno;
	}
	public Integer getEdad() {
		return Edad;
	}
	public void setEdad(Integer edad) {
		Edad = edad;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	
	

}
