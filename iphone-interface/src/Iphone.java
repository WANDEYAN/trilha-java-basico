import aparelhotelefone.AparelhoTelefonico;
import aparelhotelefone.Telefone;
import internet.NavegadorDeInternet;
import internet.Safari;
import reprodutormusical.Ipod;
import reprodutormusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorDeInternet, ReprodutorMusical {

    private AparelhoTelefonico telefone;
    private NavegadorDeInternet navegador;
    private ReprodutorMusical reprodutorMusical;

    public Iphone() {
        this.telefone = new Telefone();
        this.navegador = new Safari();
        this.reprodutorMusical = new Ipod();
    }

    public Iphone(AparelhoTelefonico telefone, NavegadorDeInternet navegador, ReprodutorMusical reprodutorMusical) {
        this.telefone = telefone;
        this.navegador = navegador;
        this.reprodutorMusical = reprodutorMusical;
    }

    @Override
    public void ligar(String numero) {
        telefone.ligar(numero);
    }

    @Override
    public boolean atender() {
        return telefone.atender();
    }

    @Override
    public void iniciarCorreioDeVoz() {
        telefone.iniciarCorreioDeVoz();
    }

    @Override
    public void exibirPagina(String url) {
        navegador.exibirPagina(url);
    }

    @Override
    public void adicionarNovaAba() {
        navegador.adicionarNovaAba();
    }

    @Override
    public void atualizarPagina() {
        navegador.atualizarPagina();
    }

    @Override
    public void tocar() {
        reprodutorMusical.tocar();
    }

    @Override
    public void pausar() {
        reprodutorMusical.pausar();
    }

    @Override
    public void selecionarMusica(String musica) {
        reprodutorMusical.selecionarMusica(musica);
    }

}
