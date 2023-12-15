import java.util.Date;

public class Transacoes {
    private int id;
    private double valor;
    private Date data;

    public Transacoes(int id, double valor, Date data) {
        this.id = id;
        this.valor = valor;
        this.data = data;
    }

    // Getters e Setters (métodos para acesso aos atributos)

    public void exibirDetalhes() {
        System.out.println("ID: " + id);
        System.out.println("Valor: " + valor);
        System.out.println("Data: " + data);
    }
}
