package guiMain.ventanas;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import gestorBD.Datos;
import gestorEnvios.Pedido;
import gestorPersonas.Cliente;
import guiMain.gasesOK;

public class ClienteRegistrado extends JFrame {
	//altributos
	Cliente c;
	Pedido ultimo;
	private Container contenedor;
	private JPanel P1;
	//constructor
	private JPanel P1A;
	private JPanel P1B;
	private Datos datos;
	private JPanel P2;
	private JPanel P2A;
	private JPanel P2B;
	private JLabel L2;
	private JLabel L1;
	private JLabel L3;
	private JLabel L5;
	private JLabel L4;
	private JLabel L6;
	private JLabel L7;
	private JLabel L8;
	private JLabel L9;
	private JLabel L10;
	private JLabel L11;
	private JLabel L12;
	private JLabel L13;
	private JLabel L14;
	private JLabel L15;
	private JLabel L16;
	private JTextField TB1;
	private JTextField TB2;
	private JTextField TB3;
	public ClienteRegistrado(Cliente cliente) {
		super ("Hacer pedido");
		c=cliente;
		if(c.getPedidos().isEmpty()){
			ultimo=new Pedido("","","",0L,"");
		}
		else{
			ultimo=c.getPedidos().getLast();
		}
		datos=gasesOK.datos;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(1000,700);
		contenedor = this.getContentPane();
		contenedor.setLayout(new GridLayout(1,2));
		
		//P1
		P1=new JPanel();
		P1.setLayout(new GridLayout(2,1));
		contenedor.add(P1);
		
		//P1A
		P1A=new JPanel();
		P1A.setLayout(new GridLayout(2,1));
		P1.add(P1A);
		
		
		//P1B
		P1B=new JPanel();
		P1B.setLayout(new GridLayout(8,2));
		P1.add(P1B);
		
		//P2
		P2=new JPanel();
		P2.setLayout(new GridLayout(2,1));
		contenedor.add(P2);
		
		//P2A
		P2A=new JPanel();
		P2A.setLayout(new GridLayout(1,1));
		P2.add(P2A);
		
		//P2B
		
		P2B=new JPanel();
		P2B.setLayout(new GridLayout(8,2));
		P2.add(P2B);
		
		//L1
		L1=new JLabel("Ultimo Pedido",SwingConstants.CENTER);
		L1.setFont ( new java.awt.Font("Tahoma",0, 50) ) ;
		P1A.add(L1);
		
		//L2
		L2=new JLabel("Telefono: ",SwingConstants.CENTER);
		L2.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		P1B.add(L2);
		
		//L3
		L3=new JLabel(c.getTelefono().toString(),SwingConstants.CENTER);
		L3.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		P1B.add(L3);
		
		//L4
		L4=new JLabel("Direccion: ",SwingConstants.CENTER);
		L4.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		P1B.add(L4);
		
		//L5
		L5=new JLabel(ultimo.getDireccion(),SwingConstants.CENTER);
		L5.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		P1B.add(L5);

		//L6
		L6=new JLabel("Municipio: ",SwingConstants.CENTER);
		L6.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		P1B.add(L6);
		
		//L7
		L7=new JLabel(ultimo.getMunicipio(),SwingConstants.CENTER);
		L7.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		P1B.add(L7);

		//L8
		L8=new JLabel("Nombre: ",SwingConstants.CENTER);
		L8.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		P1B.add(L8);
		
		//L9
		L9=new JLabel(cliente.getNombre(),SwingConstants.CENTER);
		L9.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		P1B.add(L9);

		//L10
		L10=new JLabel("Mensajero: ",SwingConstants.CENTER);
		L10.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		P1B.add(L10);
		
		//L11
		L11=new JLabel(ultimo.getMensajero(),SwingConstants.CENTER);
		L11.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		P1B.add(L11);

		//L12
		L12=new JLabel("Precio: ",SwingConstants.CENTER);
		L12.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		P1B.add(L12);
		
		//L13
		L13=new JLabel(ultimo.getPrecio().toString(),SwingConstants.CENTER);
		L13.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		P1B.add(L13);
		
		//L14
		L14=new JLabel("Fecha: ",SwingConstants.CENTER);
		L14.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		P1B.add(L14);
		
		//L15
		L15=new JLabel(ultimo.getFecha().toString("D/M/A"),SwingConstants.CENTER);
		L15.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		P1B.add(L15);
		
		
		//relleno del nuevo formulario (L2A y B)

		//L16
		L16=new JLabel("Nuevo Pedido",SwingConstants.CENTER);
		L16.setFont ( new java.awt.Font("Tahoma",0, 50) ) ;
		P2A.add(L16);
		
		//L2
		L2=new JLabel("Telefono: ",SwingConstants.CENTER);
		L2.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		P2B.add(L2);
		
		//TB1
		TB1=new JTextField(c.getTelefono().toString(),SwingConstants.CENTER);
		TB1.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		TB1.setEditable(false);
		P1B.add(TB1);
		
		//L4
		L4=new JLabel("Direccion: ",SwingConstants.CENTER);
		L4.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		P2B.add(L4);

		//TB2
		TB2=new JTextField(ultimo.getDireccion(),SwingConstants.CENTER);
		TB2.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		TB2.setEditable(false);
		P1B.add(TB2);

		//L6
		L6=new JLabel("Municipio: ",SwingConstants.CENTER);
		L6.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		P2B.add(L6);

		//TB3
		TB3=new JTextField(ultimo.getDireccion(),SwingConstants.CENTER);
		TB3.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		TB3.setEditable(false);
		P1B.add(TB3);

		//L8
		L8=new JLabel("Nombre: ",SwingConstants.CENTER);
		L8.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		P1B.add(L8);
		
		//L9
		L9=new JLabel(cliente.getNombre(),SwingConstants.CENTER);
		L9.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		P1B.add(L9);

		//L10
		L10=new JLabel("Mensajero: ",SwingConstants.CENTER);
		L10.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		P1B.add(L10);
		
		//L11
		L11=new JLabel(ultimo.getMensajero(),SwingConstants.CENTER);
		L11.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		P1B.add(L11);

		//L12
		L12=new JLabel("Precio: ",SwingConstants.CENTER);
		L12.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		P1B.add(L12);
		
		//L13
		L13=new JLabel(ultimo.getPrecio().toString(),SwingConstants.CENTER);
		L13.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		P1B.add(L13);
		
		//L14
		L14=new JLabel("Fecha: ",SwingConstants.CENTER);
		L14.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		P1B.add(L14);
		
		//L15
		L15=new JLabel(ultimo.getFecha().toString("D/M/A"),SwingConstants.CENTER);
		L15.setFont ( new java.awt.Font("Tahoma",0, 36) ) ;
		P1B.add(L15);
		
		
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		
	}
	
}
