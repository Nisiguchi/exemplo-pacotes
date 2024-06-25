public class ComputadorPedrinho {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMessenger fcb = new FacebookMessenger();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        TelegramMessenger tlg = new TelegramMessenger();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
