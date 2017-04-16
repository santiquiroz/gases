//by santiquiroz
package gestorPersonas;

public class Administrador extends Persona {
	//atributos
	String password,nick;
	//constructor
	public Administrador(String n,String u,String p) {
		super(n);
		this.nick=u;
		this.password=p;
	}
	//metodos
	public String getNick(){
		return nick;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String p){
		this.password=p;
	}


}
