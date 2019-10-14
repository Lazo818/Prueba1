package pe.edu.upn.demo.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "LuizRomero")
public class LuizRomero {
	@Column(name = "nombre",length = 41)
	private String Nombre;
	@Column(name = "ApellidoPaterno",length = 41)
	private String ApellidoPaterno;
	@Column(name = "ApellidoMaterno",length = 41)
	private String ApellidoMaterno;
	@Column(name = "Edad")
	private Integer Edad;	
	@Id
	@Column(name = "codigo", length = 5, nullable = false)
	private String NumeroDocumento;
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidoPaterno() {
		return ApellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		ApellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return ApellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		ApellidoMaterno = apellidoMaterno;
	}
	public Integer getEdad() {
		return Edad;
	}
	public void setEdad(Integer edad) {
		Edad = edad;
	}
	public String getNumeroDocumento() {
		return NumeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		NumeroDocumento = numeroDocumento;
	}
	
	
	
}
