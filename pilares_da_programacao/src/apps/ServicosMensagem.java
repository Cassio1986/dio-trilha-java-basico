package apps;

public class ServicosMensagem {
	public static void main(String[] args) {
		FacebookMessenger fcb = new FacebookMessenger();
		MSNMessenger msn = new MSNMessenger();
		Telegram tlg = new Telegram();
		
		fcb.enviarMensagem();
		fcb.receberMensagem();
		
		msn.enviarMensagem();
		msn.receberMensagem();
		
		tlg.enviarMensagem();
		tlg.receberMensagem();
	}

}
