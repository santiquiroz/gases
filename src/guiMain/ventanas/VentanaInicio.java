//by santiquiroz
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
import excepciones.UsuarioNoEncontrado;
import excepciones.VentanaExcepcion;
import gestorBD.Datos;
import gestorPersonas.Administrador;
import guiMain.gasesOK;

public class VentanaInicio extends JFrame{
	
	//atributos
	Datos datos;
	private JPanel P1;
	private JPanel P2;
	private JPanel P3;
	private JLabel L1;
	private JLabel L2;
	private JTextField TB1;
	private JLabel L3;
	private JPasswordField TB2;
	private JButton B1;
	
	//constructor
	public VentanaInicio(){
		super("Inicio de seccion");
		datos=gasesOK.datos;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640,300);
		Container Frame = this.getContentPane();
		Frame.addMouseMotionListener(new oyente2(this));
		Frame.setLayout(new GridLayout(3,1));
		
		//P2
				P2=new JPanel();
				P2.setLayout(new GridLayout(1,3));
				Frame.add(P2);
		//P1
		P1=new JPanel();
		P1.setLayout(new GridLayout(2,2));
		Frame.add(P1);
		
		//P3
		P3=new JPanel();
		P3.setLayout(new FlowLayout());
		Frame.add(P3);
		
		//L1
		L1=new JLabel("Bienvenido a la base de datos, por favor ingrese sus datos de inicio de seccion.",SwingConstants.CENTER);
	
		//P2.add(new JLabel());
		P2.add(L1);
		//P2.add(new JLabel());
		
		//L2
		L2=new JLabel("usuario:",SwingConstants.CENTER);
		P1.add(L2);
		
		//TB1
		TB1=new JTextField();
		P1.add(TB1);
		//L3
				L3=new JLabel("clave:",SwingConstants.CENTER);
				
				P1.add(L3);
		//TB1
				TB2=new JPasswordField();
				P1.add(TB2);
		
		//B1
				B1=new JButton("Ingresar");
				B1.addActionListener(new oyente(this));
				P3.add(B1);
		
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	
	//listeners
	class oyente implements ActionListener, MouseMotionListener{
		private VentanaInicio ventana;
		public oyente (VentanaInicio v){
			ventana = v;
		}
		
		public void actionPerformed(ActionEvent i) {
			
			try{
				System.out.println("boton precionado");
				String comando=i.getActionCommand();
				if("Ingresar".equals(comando)){
					String usuario=TB1.getText();
					String clave=TB2.getText();
					TB1.setText("");
					TB2.setText("");
					if (usuario.equals("")){
						throw new CampoVacio();
					}
					if (clave.equals("")){
						throw new CampoVacio();			
					}
					if(((datos.getAdministradores().containsKey(usuario)))&&((datos.getAdministradores().get(usuario).getPassword().equals(clave)))){
						new VentanaAdministrador();
					}
					else{
					if(((datos.getUsuarios().containsKey(usuario))==false)){
						System.out.print("puto");
						throw new UsuarioNoEncontrado();
					}
					else if((((datos.getUsuarios().get(usuario).getPassword()).equals(clave))==false)){
						System.out.print("el que lo lea");
						throw new UsuarioNoEncontrado();
					}
					else if ((datos.getUsuarios().containsKey(usuario))&&(((datos.getUsuarios().get(usuario).getPassword()).equals(clave)))){
						new VentanaUsuario();				
						ventana.dispose();
					}
					}
				}
			}catch(CampoVacio e){
				new VentanaExcepcion(e);
			}catch(UsuarioNoEncontrado e){
				new VentanaExcepcion(e);
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
	class oyente2 implements MouseMotionListener,KeyListener{
		private VentanaInicio ventana;
		public oyente2(VentanaInicio v){
			ventana=v;
		}
		@Override
		public void mouseDragged(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent arg0) {
			ventana.L1.setForeground(Color.BLACK);
			
		}

		@Override
		public void keyPressed(KeyEvent arg0) {
			if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
				try{
					
						
						String usuario=TB1.getText();
						String clave=TB2.getText();
						TB1.setText("");
						TB2.setText("");
						if (usuario.equals("")){
							throw new CampoVacio();
						}
						if (clave.equals("")){
							throw new CampoVacio();			
						}
						if(((datos.getAdministradores().containsKey(usuario)))&&((datos.getAdministradores().get(usuario).getPassword().equals(clave)))){
							new VentanaAdministrador();
						}
						else{
						if(((datos.getUsuarios().containsKey(usuario))==false)){
							System.out.print("puto");
							throw new UsuarioNoEncontrado();
						}
						else if((((datos.getUsuarios().get(usuario).getPassword()).equals(clave))==false)){
							System.out.print("el que lo lea");
							throw new UsuarioNoEncontrado();
						}
						else if ((datos.getUsuarios().containsKey(usuario))&&(((datos.getUsuarios().get(usuario).getPassword()).equals(clave)))){
							new VentanaUsuario();				
							ventana.dispose();
						}
						}
					
					}catch(CampoVacio e){
						new VentanaExcepcion(e);
					}catch(UsuarioNoEncontrado e){
						new VentanaExcepcion(e);
					}
					
				}
		
			}
		

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
