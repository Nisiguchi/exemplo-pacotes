public class ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConexcaoInternet();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }
    private void validarConexcaoInternet() {
        System.out.println("Validando se esta conectado a internet");
    }
    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }
}
