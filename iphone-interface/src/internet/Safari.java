package internet;
public class Safari implements NavegadorDeInternet {

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Safari.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página web no Safari.");
    }
    
}
