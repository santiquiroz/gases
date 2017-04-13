//by santiquiroz
package gestorPersonas;

import java.io.Serializable;

public class Persona implements Serializable{
	private String nombre;
	Persona(String n){
		this.nombre=n;
	}
	public String getNombre(){
		return nombre;
	}
}
