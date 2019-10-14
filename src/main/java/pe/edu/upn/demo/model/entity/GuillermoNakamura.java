package pe.edu.upn.demo.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "GuillermoNakamura")
public class GuillermoNakamura {
	@Id
	@Column(name = "DNI", length = 10)
	private String DNI;
	
	@Column(name = "nombre", length = 25, nullable = false)
	private String nombre;
	
	@Column(name = "fec_nac_Chalon")
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;
	
	@Column(name = "dir_Chalon", length = 50, nullable = true)
	private String direccion;

}
