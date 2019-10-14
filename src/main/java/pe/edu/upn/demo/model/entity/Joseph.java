package pe.edu.upn.demo.model.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Minombre")
public class Joseph {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod") 
	private Integer codigo;
	
	@Column(name = "nom_Joseph", length = 30, nullable = false )
	private String nombre;
	
	private Integer edad;
	
	private Date nacimiento;
	
	
	
	
	
	
}
