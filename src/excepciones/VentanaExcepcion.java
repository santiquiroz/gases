package excepciones;

import java.awt.Container;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaExcepcion extends JDialog{
	public VentanaExcepcion(ErrorGasesok e){
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(796,200);
		Container pPanel = this.getContentPane();
		
		pPanel.add(new JLabel(e.toString()));
			
		this.setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
