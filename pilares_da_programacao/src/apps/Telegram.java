package apps;

public class Telegram extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		ValidarConexão();
		System.out.println("Enviar mensagem Telegram");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Receber mensagem Telgram");
		
	}

}
