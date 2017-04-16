package excepciones;

import java.awt.Container;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import guiMain.ventanas.Cerrar;

public class VentanaExcepcion extends JDialog{
	private JPanel P1;

	public VentanaExcepcion(ErrorGasesok e){
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(796,200);
		Container pPanel = this.getContentPane();
		pPanel.add(new JLabel(e.toString(),SwingConstants.CENTER));
			
		this.setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
