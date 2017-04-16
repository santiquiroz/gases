package gestorBD;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
	public String ano,mes,dia,hora,minuto,segundo;
	public Fecha(){
		 //Instanciamos el objeto Calendar
	    //en fecha obtenemos la fecha y hora del sistema
	    Calendar fecha = new GregorianCalendar();
	    //Obtenemos el valor del a�o, mes, d�a,
	    //hora, minuto y segundo del sistema
	    //usando el m�todo get y el par�metro correspondiente
	     ano = String.valueOf(fecha.get(Calendar.YEAR));
	     mes = String.valueOf(fecha.get(Calendar.MONTH));
	     dia =String.valueOf( fecha.get(Calendar.DAY_OF_MONTH));
	     hora =String.valueOf( fecha.get(Calendar.HOUR_OF_DAY));
	     minuto = String.valueOf(fecha.get(Calendar.MINUTE));
	     segundo = String.valueOf(fecha.get(Calendar.SECOND));
	}
	public Fecha(String v){
		if (v.equals("vacio")){
			ano="";
			mes="";
			dia="";
			hora="";
			minuto="";
			segundo="";
		}
	}
	public String toString(){
		return ano+"/"+mes+"/"+dia+"/"+hora+"/"+minuto+"/"+segundo;
	}
	public String toString(String formato){
		if(formato.equals("D/M/A")){
			return dia+"/"+mes+"/"+ano;
		}
		if(formato.equals("M/D/A")){
			return mes+"/"+dia+"/"+ano;
		}
		if(formato.equals("A/M/D")){
			return ano+"/"+mes+"/"+dia;
		}
		if(formato.equals("M/A/D")){
			return mes+"/"+ano+"/"+dia;
		}
		if(formato.equals("A/M")){
			return ano+"/"+mes;
		}
		if(formato.equals("M/A")){
			return mes+"/"+ano;
		}
		if(formato.equals("M/D")){
			return mes+"/"+dia;
		}
		if(formato.equals("h:m:s")){
			return hora+":"+minuto+segundo;
		}
		if(formato.equals("h:m")){
			return hora+":"+minuto;
		}
		if(formato.equals("vacio")){
			return "";
		}
		return "formato no compatible.";
		
	}
	
}
