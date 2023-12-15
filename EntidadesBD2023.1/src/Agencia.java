public class Agencia {
    private int numero;
    private String endereco;

    public Agencia(int numero, String endereco) {
        this.numero = numero;
        this.endereco = endereco;
    }

    // Getters e Setters (métodos para acesso aos atributos)

    public void exibirDetalhes() {
        System.out.println("Número: " + numero);
        System.out.println("Endereço: " + endereco);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
