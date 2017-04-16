//by santiquiroz
package gestorBD;
import java.io.Serializable;
import java.util.*;

import excepciones.ExcepcionTipo3;
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
	public void addCliente(Cliente c) throws ExcepcionTipo3{
		if(this.clientes.containsKey(c.getTelefono())==false){
			this.clientes.put(c.getTelefono(), c);
		}
		else{
			throw new ExcepcionTipo3();
		}
	}
	public void addAdministrador(Administrador a) throws ExcepcionTipo3{
		if(this.administradores.containsKey(a.getNick())==false){
			this.administradores.put(a.getNick(),a);
		}
		else{
			throw new ExcepcionTipo3();
		}
	}
	public void addUsuario(Usuario u) throws ExcepcionTipo3{
		if(this.usuarios.containsKey(u.getNick())==false){
			this.usuarios.put(u.getNick(),u);
		}
		else{
			throw new ExcepcionTipo3();
		}
	}
	public void addTrabajador(Trabajador t) throws ExcepcionTipo3{
		if(this.trabajadores.containsKey(t.getNombre())==false){
			this.trabajadores.put(t.getNombre(),t);
		}
		else{
			throw new ExcepcionTipo3();
		}
	}
}
