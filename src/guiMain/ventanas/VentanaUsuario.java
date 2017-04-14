package guiMain.ventanas;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.*;
import javax.swing.*;

import excepciones.CampoVacio;
import excepciones.FormatoIncorrectoTelefono;
import excepciones.NoResultados;
import excepciones.UsuarioNoEncontrado;
import excepciones.VentanaExcepcion;
import gestorBD.Datos;
import guiMain.gasesOK;
import guiMain.ventanas.VentanaInicio.oyente;

public class VentanaUsuario extends JFrame{
	//atributos
	
	Datos datos;
	private JPanel P1;
	private JPanel P2;
	private JLabel L1;
	private JTextField TB1;
	private Container contenedor;
	private JButton B1;
	private JButton B2;
	private JButton B3;
	//constructor
	public VentanaUsuario(){
		super("usuario");
		datos= gasesOK.datos;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900,500);
		contenedor = this.getContentPane();
		contenedor.setLayout(new GridLayout(1,2));
		contenedor.setBackground(Color.blue);
		//contenedor.addMouseMotionListener(new oyente5(this));
		
		//P1
		
		P1=new JPanel();
		P1.setLayout(new GridLayout(3,1));
		contenedor.add(P1);
		
		//P2
		
		P2= new JPanel();
		P2.setLayout(new GridLayout(2,1));
		contenedor.add(P2);
		
		//L1
		
		L1=new JLabel("Clientes",SwingConstants.CENTER);
		L1.setFont(new java.awt.Font("Tahoma", 0, 50)); 
		P1.add(L1);
		
		//TB1
		
		TB1=new JTextField();
		TB1.setFont ( new Font("Dialog", Font.BOLD, 70) ) ;
		P1.add(TB1);
		
		//B1
		
		B1=new JButton("Buscar");
		B1.setFont ( new Font("Dialog", Font.BOLD, 36) ) ;
		B1.addActionListener(new oyente(this));
		P1.add(B1);
		
		//B2
		
		B2=new JButton("Trabajadores");
		B2.setFont ( new Font("Dialog", Font.BOLD, 36) ) ;
		B2.addActionListener(new oyente(this));
		P2.add(B2);
		
		//B3
		
		B3=new JButton("Envios");
		B3.setFont ( new Font("Dialog", Font.BOLD, 36) ) ;
		B3.addActionListener(new oyente(this));
		P2.add(B3);
		
		setLocationRelativeTo(null);
		this.setVisible(true);

		
	}
	
	//listeners 
	class oyente implements ActionListener, MouseMotionListener{
		private VentanaUsuario ventana;
		private long telefono; 
		public oyente(){
			
		}
		public oyente(VentanaUsuario v){
			ventana=v;
		}
		
		public void actionPerformed(ActionEvent i) {
			try{
				String comando=i.getActionCommand();
				if("Buscar".equals(comando)){
					
					String t= TB1.getText();
					if("".equals(t)){
						throw new CampoVacio();
					}
					telefono= Long.parseLong((t));
					if(datos.getClientes().containsKey(telefono)){
						new ClienteRegistrado(datos.getClientes().get(telefono));
					}
					else{
						new ClienteNuevo();
					}
					
				}
				else if("Trabajadores".equals(comando)){
					
				}
				else if("Envios".equals(comando)){
					
				}
			}catch(CampoVacio e){
				new VentanaExcepcion(e);
			}catch(NumberFormatException e){
				new VentanaExcepcion(new FormatoIncorrectoTelefono() );
			}
			
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
