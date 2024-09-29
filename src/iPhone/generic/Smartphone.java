package iPhone.generic;

public class Smartphone implements IAparelhoTelefonico, INavegadorInternet, IReprodutorMusical {
    /**
     * @param numero o numero de telefone a ser chamado.
     */
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    /**
     *
     */
    @Override
    public void atender() {
        System.out.println("Chamada atendida");
    }

    /**
     *
     */
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }

    /**
     * @param url a url do site a ser aberto.
     */
    @Override
    public void exibirPagina(String url) {
        System.out.println("Abrindo site " + url);
    }

    /**
     *
     */
    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba");
    }

    /**
     *
     */
    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    /**
     *
     */
    @Override
    public void tocar() {
        System.out.println("Iniciando a reprodução");
    }

    /**
     *
     */
    @Override
    public void pausar() {
        System.out.println("Pausando a reprodução");
    }

    /**
     * @param musica a musica a ser selecionada.
     */
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica " + musica);
    }
}
