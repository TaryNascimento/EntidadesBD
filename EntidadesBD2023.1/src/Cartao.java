public class Cartao {
    private String numero;
    private String tipo;
    private String titular;

    public Cartao(String numero, String tipo, String titular) {
        this.numero = numero;
        this.tipo = tipo;
        this.titular = titular;
    }

    // Getters e Setters (métodos para acesso aos atributos)

    public void exibirDetalhes() {
        System.out.println("Número: " + numero);
        System.out.println("Tipo: " + tipo);
        System.out.println("Titular: " + titular);
    }
}
