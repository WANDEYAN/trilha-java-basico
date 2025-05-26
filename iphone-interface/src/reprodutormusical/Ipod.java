package reprodutormusical;
public class Ipod implements ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando música no iPod.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada no iPod.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    
}