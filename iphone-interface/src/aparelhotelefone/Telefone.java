package aparelhotelefone;

public class Telefone implements AparelhoTelefonico {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public boolean atender() {
        System.out.println("Atendendo a chamada...");
        return true;
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz...");
    }
    
}
