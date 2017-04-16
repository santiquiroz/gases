package guiMain.ventanas;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.*;

import javax.swing.*;

import excepciones.CampoVacio;
import excepciones.ExcepcionTipo3;
import excepciones.UsuarioNoEncontrado;
import excepciones.VentanaExcepcion;
import gestorBD.Datos;
import gestorBD.Fecha;
import gestorBD.GestorDatos;
import gestorPersonas.Cliente;
import guiMain.gasesOK;
import guiMain.ventanas.VentanaUsuario.oyente;
public class ClienteNuevo extends JFrame {
	//atributos 
	Datos datos;
	private Container contenedor;
	private JLabel L1;
	private JPanel P1;
	private JButton B1;
	private Long telefono;
	private JLabel L2;
	private JTextField TB1;
	private JLabel L3;
	private JLabel L4;
	private JLabel L5;
	private JLabel L6;
	private JTextField TB2;
	private JTextField TB3;
	private JTextField TB4;
	private Component Lt;
	
	//constructor
	public ClienteNuevo(Long t){
		super("Cliente Nuevo");
		telefono=t;
		datos=gasesOK.datos;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(671,740);
		contenedor = this.getContentPane();
		contenedor.setLayout(new GridLayout(3,1));
		//contenedor.setBackground(Color.blue);
		//L1
		L1=new JLabel("Registro de cliente nuevo",SwingConstants.CENTER);
		L1.setFont(new java.awt.Font("Tahoma", 0, 50)); 
		contenedor.add(L1);
		
		//P1
		P1=new JPanel();
		P1.setLayout(new GridLayout(5,2));
		contenedor.add(P1);
		
		//B1
		B1=new JButton("Guardar");
		B1.setFont ( new Font("Dialog", Font.BOLD, 36) ) ;
		B1.addKeyListener(new oyente2(this));
		B1.addActionListener(new oyente(this));
		contenedor.add(B1);
		
		//L2
		L2=new JLabel("Telefono",SwingConstants.CENTER);
		L2.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		P1.add(L2);
		/*
		//Lt
		Lt=new JLabel(t.toString(),SwingConstants.CENTER);
		Lt.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		P1.add(Lt);
		*/
		//TB1 
				TB1=new JTextField(t.toString());
				TB1.setFont ( new Font("Dialog", Font.BOLD, 36) ) ;
				P1.add(TB1);
		
		//L3
		L3=new JLabel("Nombre",SwingConstants.CENTER);
		L3.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		P1.add(L3);

		//TB2
			TB2=new JTextField();
			TB2.setFont ( new Font("Dialog", Font.BOLD, 36) ) ;
			TB2.addKeyListener(new oyente2(this));
			P1.add(TB2);
		
		/*//L4
		L4=new JLabel("Direccion",SwingConstants.CENTER);
		L4.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		P1.add(L4);
		
		//TB3
			TB3=new JTextField();
			TB3.setFont ( new Font("Dialog", Font.BOLD, 36) ) ;
			P1.add(TB3);
		
		//L5
		L5=new JLabel("Municipio",SwingConstants.CENTER);
		L5.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		P1.add(L5);
		
		//TB4
			TB4=new JTextField();
			TB4.setFont ( new Font("Dialog", Font.BOLD, 36) ) ;
			P1.add(TB4);
		*/
		
		//L6
		L6=new JLabel("Fecha de registro",SwingConstants.CENTER);
		L6.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		P1.add(L6);
		
		//L7
		L6=new JLabel(new Fecha().toString("M/D/A"),SwingConstants.CENTER);
		L6.setFont ( new java.awt.Font("BOLD",0, 36) ) ;
		P1.add(L6);
		
		
		
		
		
		setLocationRelativeTo(null);
		this.setVisible(true);
	}
	//listeners
	
	class oyente implements ActionListener, MouseMotionListener{
		private ClienteNuevo ventana;
		private Cliente cliente;
		public oyente (ClienteNuevo v){
			ventana = v;
		}
		
		public void actionPerformed(ActionEvent i) {
			
			
				System.out.println("boton precionado");
				String comando=i.getActionCommand();
				String nombre=TB2.getText();
				Long telefono=Long.parseLong((TB1.getText()));
				try {
					cliente=new Cliente(nombre,telefono);
					datos.addCliente(cliente);
					new ClienteRegistrado(cliente);
					ventana.dispose();
				} catch (ExcepcionTipo3 e) {
					new VentanaExcepcion(e);
				}
				GestorDatos.guardarDatos(datos);
		}
		public void mouseDragged(MouseEvent e) {}
		public void mouseMoved(MouseEvent e) {}
	}
	private class oyente2 implements MouseMotionListener,KeyListener{
		private ClienteNuevo ventana;
		private Cliente cliente;
		public oyente2(ClienteNuevo v){
			ventana=v;
		}
		public void mouseDragged(MouseEvent arg0) {
		}
		public void mouseMoved(MouseEvent arg0) {
		}
		public void keyPressed(KeyEvent i) {
			if (i.getKeyCode() == KeyEvent.VK_ENTER) {
				String nombre=TB2.getText();
				Long telefono=Long.parseLong((TB1.getText()));
				try {
					cliente=new Cliente(nombre,telefono);
					datos.addCliente(cliente);
					new ClienteRegistrado(cliente);
					
				} catch (ExcepcionTipo3 e) {
					new VentanaExcepcion(e);
				}
				GestorDatos.guardarDatos(datos);
				}
			}
		public void keyReleased(KeyEvent arg0) {}
		public void keyTyped(KeyEvent i) {
			if (i.getKeyCode() == KeyEvent.VK_ENTER) {
				String nombre=TB1.getText();
				Long telefono=Long.parseLong((Lt.getName()));
				try {
					cliente=new Cliente(nombre,telefono);
					datos.addCliente(cliente);
					new ClienteRegistrado(cliente);
				} catch (ExcepcionTipo3 e) {
					new VentanaExcepcion(e);
				}
				GestorDatos.guardarDatos(datos);
				
				}
		
			
		
		}
		
	}
}
