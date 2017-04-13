//by santiquiroz
package guiMain.ventanas;
import java.awt.*;
import java.util.*;

import javax.swing.*;

import gestorBD.Datos;
import guiMain.gasesOK;

public class VentanaInicio extends JFrame{
	//atributos
	Datos datos;
	
	//constructor
	public VentanaInicio(){
		datos=gasesOK.datos;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200,700);
		Container Frame = this.getContentPane();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
}
