//by santiquiroz
package gestorPersonas;

import java.util.LinkedList;

public class Trabajador extends Persona {
	//atributos
	private String status;
	private long telefono;
	private LinkedList<Long> pagos = new LinkedList<Long>();
	//constructor
	Trabajador(String n,long t) {
		super(n);
		this.telefono=t;
		this.status="activo";
	}
	//metodos
	public void addPago(long p){
		pagos.add(p);
	}
	public LinkedList<Long> getPagos(){
		return pagos; 
	}
	public void changeStatus(String s){
		status=s;
	}
	

}
