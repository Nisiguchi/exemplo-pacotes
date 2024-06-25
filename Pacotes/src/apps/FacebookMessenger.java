package apps;
public class FacebookMessenger extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConexcaoInternet();
        System.out.println("Enviando mensagem pelo Face");
    }
    @Override
    public void receberMensagem() {
        System.out.println(" Recebendo mensagem pelo Face");
    }
}
