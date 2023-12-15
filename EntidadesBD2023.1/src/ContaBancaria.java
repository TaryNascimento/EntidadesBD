public class ContaBancaria {
    private int numero;
    private double saldo;
    private Clientes cliente;
    private Agencia agencia;

    public ContaBancaria(int numero, double saldo, Clientes cliente, Agencia agencia) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
        this.agencia = agencia;
    }

    // Getters e Setters (métodos para acesso aos atributos)

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void exibirDetalhes() {
        System.out.println("Número da Conta: " + numero);
        System.out.println("Saldo: " + saldo);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Agência: " + agencia.getNumero());
    }
}
