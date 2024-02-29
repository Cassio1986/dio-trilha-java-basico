package pilares_da_programacao;

import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class Computadorpedrinho {
public static void main(String[] args) {
	
	ServicoMensagemInstantanea smi = null;
	
	String appEscolha ="fcb";
	
	if(appEscolha.equals("msn"))
		smi = new MSNMessenger();
	else if(appEscolha.equals("fcb"))
		smi = new FacebookMessenger();
	else if(appEscolha.equals("tlg"))
		smi= new Telegram();
	
	smi.enviarMensagem();
	smi.receberMensagem();
}

	
}
