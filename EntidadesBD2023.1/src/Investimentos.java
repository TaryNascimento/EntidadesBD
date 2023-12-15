public class Investimentos {
    private String tipo;
    private double valorInvestido;
    private double retorno;

    public Investimentos(String tipo, double valorInvestido, double retorno) {
        this.tipo = tipo;
        this.valorInvestido = valorInvestido;
        this.retorno = retorno;
    }

    // Getters e Setters (métodos para acesso aos atributos)

    public double calcularLucro() {
        return valorInvestido * retorno;
    }
}
