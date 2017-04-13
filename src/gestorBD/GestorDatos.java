//by santiquiroz
package gestorBD;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
public abstract class GestorDatos {
	private static File archivo = new File("datos");
	
	public static Datos leerDatos() {
		Datos data = null;
		FileInputStream fr = null;
		ObjectInputStream or = null;
		
		try {
			fr = new FileInputStream(archivo);
			or = new ObjectInputStream(fr);
			try {
				data = (Datos)or.readObject();
			} catch(ClassNotFoundException e) {
				System.out.println("Error");
			}
		} catch(IOException e) {
			System.out.println("Error: " + e.toString());
		} finally {
			try {
				if (or != null) {
					or.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch(IOException e) {
				System.out.println("Error: " + e.toString());
			}
		}
	
		return data;
	}
	
	public static void guardarDatos(Datos data) {
		FileOutputStream fw = null;
		ObjectOutputStream ow = null;
		
		try {
			fw = new FileOutputStream(archivo);
			ow = new ObjectOutputStream(fw);
			ow.writeObject(data);
		} catch(IOException e) {
			System.out.println("Error: " + e.toString());
		} finally {
			try {
				if (ow != null) {
					ow.close();
				}
				if (fw != null) {
					fw.close();
				}
			} catch(IOException e) {
				System.out.println("Error: " + e.toString());
			}
		}
	}
}
