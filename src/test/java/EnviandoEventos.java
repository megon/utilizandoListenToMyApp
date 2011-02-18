/**
 * Exemplo para enviar eventos para o ListenToMyApp
 * Para maiores detalhes, por favor, leia o arquivo README
 * 
 * Megon Internet Services Ltda (http://www.megon.com.br)
 * 18/02/2011
 */
import org.apache.log4j.Logger;


public class EnviandoEventos {
	
	private static final Logger logger = Logger.getLogger(EnviandoEventos.class);
	
	public static void main (String []args){
		enviandoInfo();
		enviandoErro();
	}
	
	private static void enviandoInfo(){
		logger.info("Enviando uma info para o ListenToMyApp");
	}

	
	private static void enviandoErro(){
		logger.error("Enviando um erro para o ListenToMyApp");
	}

}
