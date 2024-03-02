
public class Smartphone implements Telefone, PlayerMusica, Navegador {

    public void ligar() {
        System.out.println("Ligar o telefone");
    }

    public void atender() {
        System.out.println("Atender o telefone");
    }

    public void iniciarCorrerioVoz() {
        System.out.println("Iniciar o Correio de voz");
    }

    public void tocar() {
        System.out.println("Tocar música");
    }

    public void pausar() {
        System.out.println("Pausar música");
    }

    public void selecionarMusica() {
        System.out.println("Selecionar música");
    }

    public void exibirPagina() {
        System.out.println("Exibir página");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionar nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizar página");
    }

    public void funcoesTelefone() {
        ligar();
        atender();
        iniciarCorrerioVoz();
    }

    public void funcoesNavegador() {
        exibirPagina();
        adicionarNovaAba();
        atualizarPagina();
    }

    public void funcoesPlayer() {
        tocar();
        selecionarMusica();
        pausar();
    }

}
