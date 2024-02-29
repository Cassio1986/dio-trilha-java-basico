package apps;

public class MSNMessenger extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		ValidarConexão();
		System.out.println("Enviar mensagem MSN");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Receber mensagem MSN");
		
	}

}
