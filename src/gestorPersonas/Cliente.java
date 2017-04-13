package gestorPersonas;

import java.util.LinkedList;

import gestorEnvios.Pedido;

public class Cliente extends Persona {
	//atributos
	private Long telefono;
	private int puntos;
	private LinkedList <Pedido> pedidos=new LinkedList<Pedido>();
	//constructor
	public Cliente(String n,Long t) {
		super(n);
		this.telefono=t;
		this.puntos=0;
	}
	//metodos 
	public Long getTelefono(){
		return telefono;
	}
	public int getPuntos(){
		return puntos;
	}
	public void changePuntos(int p){
		this.puntos=p;
	}
	

}
