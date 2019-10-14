package pe.edu.upn.demo.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

 


@Entity
@Table(name="TablaRiera")
public class MarcosRiera {

@Id
@Column(name="Codigo", length =10)
private String codigo;

@Column(name="Nombre alumno", length=20, nullable = false)
private String nombre;

@Column(name="Apellido alumno", length=20, nullable = false)
private String apellido;




@Column(name="Fecha Nacimiento Riera")
@Temporal(TemporalType.DATE)
private Date fechaNacimiento;













}
