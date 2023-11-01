package aplicativo;
import sociedade.*;
import java.util.Date;
import entities.enums.*;


public class Gabinete {

	public static void main(String[] args) {
		
	Demanda d1 = new Demanda("Matheus", "70573321140", "62998414433", "matheusag@04gmail.com", "brasileiro", "04/04/2003", "Setor Oeste", "07361698", "Masculino", "programador", 12345,"tapa_buraco", "prefeitura", StatusDemanda.ANDAMENTO, "tapaburaco.pdf","Moradores estão a mais de dois anos esperando." , "Larissa", new Date());
	System.out.println(d1);
	}

}
