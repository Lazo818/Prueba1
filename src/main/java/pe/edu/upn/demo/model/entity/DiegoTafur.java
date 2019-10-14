package pe.edu.upn.demo.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="DiegoTafur")
public class DiegoTafur {

	@Id
	@Column(name ="cod_dt" , length = 4 , nullable = false)
	private String codigo;
	@Column(name ="nom_dt" , length = 30 , nullable = false)
	private String nombre;
	@Column(name ="ape_dt" , length = 30 , nullable = false)
	private String apellido;
	@Column(name ="sex_dt" , length = 1 , nullable = false)
	private String sexo;
}
