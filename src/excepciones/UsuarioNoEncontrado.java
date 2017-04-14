package excepciones;

public class UsuarioNoEncontrado extends ExcepcionTipo1{
	public String toString(){
		return super.toString()+"combinacion de usuario y contrasena no encontrada ";
	}
}
