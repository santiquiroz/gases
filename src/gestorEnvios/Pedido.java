package gestorEnvios;

import java.util.Date;

public class Pedido {
	//atributos
	private String municipio, direccion,mensajero;
	private Long precio;
	private Date fecha;
	//constructor
	public Pedido(String m,String d, String me,Long p){
		this.direccion=d;
		this.mensajero=me;
		this.municipio=m;
		this.precio=p;
		this.fecha=new Date();
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
	public Date getFecha(){
		return fecha;
	}
	
}
