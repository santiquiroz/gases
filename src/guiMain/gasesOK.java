//by santiquiroz
package guiMain;
import java.util.*;

import gestorBD.Datos;
import gestorBD.GestorDatos;
import gestorPersonas.Administrador;
import gestorPersonas.Usuario;
import guiMain.ventanas.VentanaInicio;

public class gasesOK {
	public static Datos datos;
	public static void main(String[] args) {
		datos = GestorDatos.leerDatos();
		if ( datos == null ) {
			System.out.println("no habian datos men");
			datos = new Datos();
			//creando usuarios por defecto
			datos.getAdministradores().put("sebas",new Administrador("sebastian","sebas","12345678"));
			datos.getUsuarios().put("santiago",new Usuario("santiago","santiago","1"));
			GestorDatos.guardarDatos(datos);
		}
		VentanaInicio Inicio = new VentanaInicio();
		System.out.println("termino men");
		GestorDatos.guardarDatos(datos);
		System.out.println("guardo men");
	}

}
