package pe.edu.upn.demo.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SebastianSegura")
public class SebastianSegura {
	@Id
	@Column(name="cod",length=4,nullable=false)
	private Integer codigo;
	@Column(name="nom",length=30,nullable=false)
	private String nombre;
	@Column(name="ape",length=30,nullable=false)
	private String apellido;
	@Column(name="cor",length=30,nullable=false)
	private String correo;
	@Column(name="tel",length=10,nullable=false)
	private String telefono;
	
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
