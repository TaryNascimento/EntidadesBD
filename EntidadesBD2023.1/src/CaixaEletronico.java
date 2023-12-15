public class CaixaEletronico {
    private String localizacao;
    private boolean emOperacao;

    public CaixaEletronico(String localizacao) {
        this.localizacao = localizacao;
        this.emOperacao = true;
    }

    // Getters e Setters (métodos para acesso aos atributos)

    public void desativarCaixa() {
        this.emOperacao = false;
    }

    public void ativarCaixa() {
        this.emOperacao = true;
    }

    public void exibirStatus() {
        System.out.println("Localização: " + localizacao);
        System.out.println("Em operação: " + emOperacao);
    }
}
