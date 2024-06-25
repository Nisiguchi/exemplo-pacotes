package apps;
public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConexcaoInternet() {
        System.out.println("Validando conexcao internet");
    }
}
