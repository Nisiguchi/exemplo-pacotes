package apps;
public class TelegramMessenger extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConexcaoInternet();
        System.out.println("Enviando mensagem pelo Tele");
    }
    @Override
    public void receberMensagem() {
        System.out.println(" Recebendo mensagem pelo Tele");
    }
}
