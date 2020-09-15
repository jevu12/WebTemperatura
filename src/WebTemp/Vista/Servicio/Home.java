package WebTemp.Vista.Servicio;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Home implements Serializable {
private String nombre;
private static final long serialVersionUID = 1L;
public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String guardar() {
	System.out.println("Hola mundo"+this.nombre);
	return("confirmacion");
}
}
