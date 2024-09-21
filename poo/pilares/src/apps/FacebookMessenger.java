package apps;

public class FacebookMessenger extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		// TODO Auto-generated method stub
		System.out.println("Enviando mensagem pelo Facebook Messenger");
		
	}

	@Override
	public void receberMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}
	
	
	

}
