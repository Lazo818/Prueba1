package pe.edu.upn.demo.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "ernesto")
public class ErnestoTarazona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( name = "codig")
	private Integer codigo;
	
	@Column(name = "nom",length = 20)
	private String nombre;
	
	@Column(name = "apellidopater",length = 20)
	private String apellidoP;
	
	@Column(name = "apellidomater",length = 20)
	private String apellidoM;
	
	@Column(name = "eda",length = 10)
	private String edad;
	
	@Column(name = "corre",length = 10)
	private String correo;
	
	
	
}
