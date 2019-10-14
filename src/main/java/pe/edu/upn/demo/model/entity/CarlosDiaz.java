package pe.edu.upn.demo.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "carlos")
public class CarlosDiaz {

	@Id
	@Column(name = "carlos_id")
	private Integer c_id ;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "edad")
	private Integer edad;
	@Column(name = "fec_nac_paciente")
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;
	
	@Column(name = "dir_carlos", length = 50, nullable = true)
	private String direccion;

	public Integer getC_id() {
		return c_id;
	}

	public void setC_id(Integer c_id) {
		this.c_id = c_id;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	
}
