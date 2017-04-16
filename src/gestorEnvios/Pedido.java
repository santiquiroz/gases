package gestorEnvios;

import java.util.Date;

import gestorBD.Fecha;

public class Pedido {
	//atributos
	private String municipio, direccion,mensajero;
	private Long precio;
	private Fecha fecha;
	//constructor
	public Pedido(String m,String d, String me,Long p){
		this.direccion=d;
		this.mensajero=me;
		this.municipio=m;
		this.precio=p;
		this.fecha=new Fecha();
	}
	public Pedido(String m,String d, String me,Long p,String f){
		this.direccion=d;
		this.mensajero=me;
		this.municipio=m;
		this.precio=p;
		this.fecha=new Fecha(f);
	}
	//metodos
	public String getMunicipio(){
		return municipio;
	}
	public String getDireccion(){
		return direccion;
	}
	public String getMensajero(){
		return mensajero;
	}
	public Long getPrecio(){
		return precio;
	}
	public Fecha getFecha(){
		return fecha;
	}
	
}
