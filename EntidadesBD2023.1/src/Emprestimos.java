public class Emprestimos {
    private double valor;
    private double taxaDeJuros;
    private int meses;

    public Emprestimos(double valor, double taxaDeJuros, int meses) {
        this.valor = valor;
        this.taxaDeJuros = taxaDeJuros;
        this.meses = meses;
    }

    // Getters e Setters (métodos para acesso aos atributos)

    public double calcularValorTotal() {
        return valor * (1 + taxaDeJuros) * meses;
    }
}
