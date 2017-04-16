package guiMain.ventanas;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class Cerrar implements KeyListener{
	JFrame v;
	JDialog d;
	Boolean esf=false;
	Boolean esd=false;

	public Cerrar(JFrame c){
		v=c;
		esf=true;
	}
	public Cerrar(JDialog d) {
		d=d;
		esd=true;
	}
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			if(esf){
				v.dispose();
			}
			else if(esd){
				d.dispose();
			}
		}
	}
	public void keyReleased(KeyEvent e) {
	}
	public void keyTyped(KeyEvent e) {
	}
}
