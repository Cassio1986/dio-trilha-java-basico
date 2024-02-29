package apps;

public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	
	protected void ValidarConexão() {
		System.out.println("Conexão validada!");
		
	}

}
