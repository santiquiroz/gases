package guiMain.ventanas;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import excepciones.ExcepcionTipo3;
import excepciones.VentanaExcepcion;
import gestorBD.Datos;
import gestorBD.GestorDatos;
import gestorPersonas.Administrador;
import gestorPersonas.Cliente;
import gestorPersonas.Persona;
import gestorPersonas.Usuario;
import guiMain.gasesOK;

public class Mi extends JFrame{
	//atributos
	private Persona ente;
	private Datos datos;
	private Container contenedor;
	private JPanel P1;
	private JPanel P2;
	private JLabel L1;
	private JTextField TB1;
	//constructores
	private JTextField TB2;
	private JLabel L2;
	private JLabel L3;
	private JTextField TB3;
	private JButton B1;
	private JButton B2;
	public Mi(Administrador a){
		super("Mi cuenta");
		ente=a;
		datos=gasesOK.datos;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(671,350);
		contenedor = this.getContentPane();
		contenedor.setLayout(new GridLayout(2,1));
		contenedor.addKeyListener(new oyente2(this));
		
		//P1
		P1=new JPanel();
		P1.setLayout(new GridLayout(3,2));
		P1.addKeyListener(new oyente2(this));
		contenedor.add(P1);
		
		//P2
		P2=new JPanel();
		P2.setLayout(new FlowLayout());
		P2.addKeyListener(new oyente2(this));
		contenedor.add(P2);
		
		//L1
		L1=new JLabel("Nombre: ",SwingConstants.CENTER);
		L1.setFont(new java.awt.Font("Tahoma", 0, 36)); 
		P1.add(L1);
		
		//TB1
		TB1=new JTextField(a.getNombre());
		TB1.setFont ( new Font("Dialog", Font.BOLD, 36) ) ;
		P1.add(TB1);
		
		//L2
		L2=new JLabel("Nick: ",SwingConstants.CENTER);
		L2.setFont(new java.awt.Font("Tahoma", 0, 36)); 
		P1.add(L2);
		
		//TB2
		TB2=new JTextField((a.getNick()));
		TB2.setFont ( new Font("Dialog", Font.BOLD, 36) ) ;
		TB2.setEditable(false);
		P1.add(TB2);
		
		//L3
		L3=new JLabel("Password: ",SwingConstants.CENTER);
		L3.setFont(new java.awt.Font("Tahoma", 0, 36)); 
		P1.add(L3);
				
		//TB3
		TB3=new JTextField(a.getPassword());
		TB3.setFont ( new Font("Dialog", Font.BOLD, 36) ) ;
		TB3.addKeyListener(new oyente2(this));
		P1.add(TB3);
		
		
		//B1
		B1=new JButton("Guardar");
		B1.setFont ( new Font("Dialog", Font.BOLD, 36) ) ;
		B1.addActionListener(new oyente(this));
		P2.add(B1);
		
		//B2
		B2=new JButton("Salir");
		B2.setFont ( new Font("Dialog", Font.BOLD, 36) ) ;
		B2.addActionListener(new oyente(this));
		P2.add(B2);
		
		setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
	}	
	
	public Mi(Usuario a){
		super("Mi cuenta");
		ente=a;
		datos=gasesOK.datos;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(671,350);
		contenedor = this.getContentPane();
		contenedor.setLayout(new GridLayout(2,1));

		contenedor.addKeyListener(new oyente2(this));
		
		//P1
		P1=new JPanel();
		P1.setLayout(new GridLayout(3,2));
		P1.addKeyListener(new oyente2(this));
		contenedor.add(P1);
		
		//P2
		P2=new JPanel();
		P2.setLayout(new FlowLayout());
		P2.addKeyListener(new oyente2(this));
		contenedor.add(P2);
		
		//L1
		L1=new JLabel("Nombre: ",SwingConstants.CENTER);
		L1.setFont(new java.awt.Font("Tahoma", 0, 36)); 
		P1.add(L1);
		
		//TB1
		TB1=new JTextField(a.getNombre());
		TB1.setFont ( new Font("Dialog", Font.BOLD, 36) ) ;
		TB1.addKeyListener(new oyente2(this));
		P1.add(TB1);
		
		//L2
		L2=new JLabel("Nick: ",SwingConstants.CENTER);
		L2.setFont(new java.awt.Font("Tahoma", 0, 36)); 
		P1.add(L2);
		
		//TB2
		TB2=new JTextField((a.getNick()));
		TB2.setFont ( new Font("Dialog", Font.BOLD, 36) ) ;
		TB2.setEditable(false);
		TB2.addKeyListener(new oyente2(this));
		P1.add(TB2);
		
		//L3
		L3=new JLabel("Password: ",SwingConstants.CENTER);
		L3.setFont(new java.awt.Font("Tahoma", 0, 36)); 
		P1.add(L3);
				
		//TB3
		TB3=new JTextField(a.getPassword());
		TB3.setFont ( new Font("Dialog", Font.BOLD, 36) ) ;
		TB3.addKeyListener(new oyente2(this));
		P1.add(TB3);
		
		
		//B1
		B1=new JButton("Guardar");
		B1.setFont ( new Font("Dialog", Font.BOLD, 36) ) ;
		B1.addActionListener(new oyente(this));
		P2.add(B1);
		
		//B2
		B2=new JButton("Salir");
		B2.setFont ( new Font("Dialog", Font.BOLD, 36) ) ;
		B2.addActionListener(new oyente(this));
		P2.add(B2);
		
		setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
	}
	//listeners
	class oyente implements ActionListener, MouseMotionListener{
		private Mi ventana;
		public oyente (Mi v){
			ventana = v;
		}
		public void actionPerformed(ActionEvent n) {
				String i=n.getActionCommand();
				System.out.println("boton precionado");
				if("Guardar".equals(i)){
					
					String nuevoNombre=TB1.getText();
					String nuevaClave=TB3.getText();
					if ((ente instanceof Administrador)&&(datos.getAdministradores().containsKey(((Administrador) ente).getNick()))){
						datos.getAdministradores().get(((Administrador) ente).getNick()).setNombre(nuevoNombre);
						if(nuevaClave.equals("")==false){
							datos.getAdministradores().get(((Administrador) ente).getNick()).setPassword(nuevaClave);
						}
						GestorDatos.guardarDatos(datos);
					}
					else{
						datos.getUsuarios().get(((Usuario) ente).getNick()).setNombre(nuevoNombre);
						if(nuevaClave.equals("")==false){
							datos.getUsuarios().get(((Usuario) ente).getNick()).changePassword(nuevaClave);
					
						}
					}
					GestorDatos.guardarDatos(datos);
				}
				if("Salir".equals(i)){
					GestorDatos.guardarDatos(datos);
					ventana.dispose();
				}
		}
		public void mouseDragged(MouseEvent e) {
		}
		public void mouseMoved(MouseEvent e) {
		}
	}
	class oyente2 implements MouseMotionListener,KeyListener{
		private Mi ventana;
		public oyente2 (Mi v){
			ventana = v;
		}
		public void keyPressed(KeyEvent arg0) {
			if (arg0.getKeyCode() == KeyEvent.VK_ESCAPE) {
				ventana.dispose();
			}
		}
		public void keyReleased(KeyEvent arg0) {
		}

		public void keyTyped(KeyEvent arg0) {
		}
		public void mouseDragged(MouseEvent arg0) {
		}
		public void mouseMoved(MouseEvent arg0) {
		}
	}
}
