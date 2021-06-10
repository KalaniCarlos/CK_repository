package formatadorData;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Formatador {
	
	public static void main(String args[]) {
		
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yy HH:mm");
		
		Date data = new Date();
		
		System.out.println("Data: "+data);
		
		String dataFormatada = formatador.format(data);
		
		System.out.println("Data Formatada: "+dataFormatada);
	}

}
