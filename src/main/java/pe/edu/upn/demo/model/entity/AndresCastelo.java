package pe.edu.upn.demo.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACastelo")
public class AndresCastelo {

	@Id
	@Column(name = "cod", length=6)
	private Integer codigo;
	
	@Column(name = "nom", length = 30)
	private String nombre;
	
	@Column(name = "edad", length = 3)
	private Integer edad;
	
}
