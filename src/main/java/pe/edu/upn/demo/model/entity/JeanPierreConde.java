package pe.edu.upn.demo.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="JeanPierre")
public class JeanPierreConde {

	@Column(name="id")
	private String id;
	
	@Column(name="SegundoNombre")
	private String segundoNombre;
	
	@Column(name="ApellidoMaterno")
	private String ApellidoMaterno;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getApellidoMaterno() {
		return ApellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		ApellidoMaterno = apellidoMaterno;
	}
	
	
}
