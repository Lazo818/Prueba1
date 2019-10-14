package pe.edu.upn.demo.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Datos")
public class LuisSuarez {
		
		@Id
		@Column(name = "codigo")
		private Integer codigo;
		
		@Column(name = "nombre", length = 30)
		private String nombre;
		
		@Column(name = "apellido", length = 40)
		private String apellido;
		
		@Column(name = "correo", length = 40)
		private String correo;

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
		
		
		
}
