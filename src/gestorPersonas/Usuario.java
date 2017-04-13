//by santiquiroz
package gestorPersonas;

public class Usuario extends Persona{
	//atributos
	String nick,password;
	//constructor
	public Usuario(String n,String u,String p) {
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
	public void changePassword(String p){
		this.password=p;
	}
	
	
}
