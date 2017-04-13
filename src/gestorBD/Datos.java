//by santiquiroz
package gestorBD;
import java.io.Serializable;
import java.util.*;

import gestorPersonas.*;
public class Datos implements Serializable{
	//atributos
	private HashMap<String,Administrador> administradores= new HashMap();
	private HashMap<String,Usuario> usuarios = new HashMap();
	private HashMap<String,Trabajador>trabajadores = new HashMap();
	private HashMap<Long,Cliente> clientes = new HashMap();
	private int aumentoPuntos;
	//constructor
	public Datos(){
		this.aumentoPuntos=0;
	}
	//metodos
	public HashMap<String,Administrador> getAdministradores(){
		return administradores;
	}
	public HashMap<String,Usuario> getUsuarios(){
		return usuarios;
	}
	public HashMap<Long,Cliente> getClientes(){
		return clientes;
	}
	public int getAumentoPuntos(){
		return aumentoPuntos;
	}
}
