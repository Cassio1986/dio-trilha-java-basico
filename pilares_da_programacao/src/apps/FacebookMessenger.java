package apps;

public class FacebookMessenger extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		ValidarConexão();
		System.out.println("Enviar mensagem Facebook");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Receber mensagem Facebook");
		
	}

}
