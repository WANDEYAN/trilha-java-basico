import aparelhotelefone.Telefone;
import internet.Safari;
import reprodutormusical.Ipod;

public class Usuario {
    public static void main(String[] args) {
        final Iphone iphone = new Iphone(new Telefone(), new Safari(), new Ipod());

        iphone.ligar("4002-8922");
        iphone.atender();
        iphone.iniciarCorreioDeVoz();

        System.out.println("-----");

        iphone.selecionarMusica("Let Me Love You - Mario");
        iphone.tocar();
        iphone.pausar();

        System.out.println("-----");

        iphone.exibirPagina("https://www.dio.com");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
    }
}
