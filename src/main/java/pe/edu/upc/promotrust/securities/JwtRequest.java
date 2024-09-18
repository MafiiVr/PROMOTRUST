package pe.edu.upc.promotrust.securities;

import java.io.Serializable;

/*
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

//Clase 4
@Data
@AllArgsConstructor
@NoArgsConstructor*/
public class JwtRequest implements Serializable {
	private static final long serialVersionUID = 5926468583005150707L;
	private String nombre;
	private String contrasenia;
	public JwtRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JwtRequest(String nombre, String contrasenia) {
		super();
		this.nombre = nombre;
		this.contrasenia = contrasenia;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getNombre() {
		return nombre;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
}