package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the nombre database table.
 * 
 */
@Entity
@NamedQuery(name="Nombre.findAll", query="SELECT n FROM Nombre n")
public class Nombre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;

	private String nombre;

	public Nombre() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}