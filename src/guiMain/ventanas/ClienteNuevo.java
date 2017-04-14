package guiMain.ventanas;
import java.awt.*;
import java.util.*;

import javax.swing.*;

import gestorBD.Datos;
import guiMain.gasesOK;
public class ClienteNuevo extends JFrame {
	//atributos 
	Datos datos;
	private Container contenedor;
	
	//constructor
	public ClienteNuevo(){
		super("Cliente Nuevo");
		datos=gasesOK.datos;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900,500);
		contenedor = this.getContentPane();
		contenedor.setLayout(new GridLayout(3,1));
		contenedor.setBackground(Color.blue);
		
		setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
