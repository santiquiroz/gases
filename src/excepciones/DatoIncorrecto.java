package excepciones;

public class DatoIncorrecto extends ExcepcionTipo2 {
	private String errorValue;
	
	public DatoIncorrecto(String errorValue) {
		this.errorValue = errorValue;
	}
	
	public String toString() {
		return super.toString() + "hay un dato incorrecto en el campo: " + errorValue;
	}
}
