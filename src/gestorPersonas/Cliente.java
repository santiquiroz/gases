package gestorPersonas;

import java.util.Date;
import java.util.LinkedList;

import gestorBD.Fecha;
import gestorEnvios.Pedido;

public class Cliente extends Persona {
	//atributos
	private Long telefono;
	private int puntos;
	private String fechaRegistro;
	LinkedList <Pedido> pedidos;
	//constructor
	public Cliente(String n,Long t) {
		super(n);
		this.telefono=t;
		this.puntos=0;
		this.fechaRegistro=new Fecha().toString("M/D/A");
		pedidos=new LinkedList<Pedido>();
	}
	//metodos 
	public Long getTelefono(){
		return telefono;
	}
	public int getPuntos(){
		return puntos;
	}
	public LinkedList<Pedido> getPedidos(){
		return this.pedidos;
	}
	public void setPuntos(int p){
		this.puntos=p;
	}
	public void addPedido(Pedido ped){
		this.pedidos.add(ped);
	}
}
