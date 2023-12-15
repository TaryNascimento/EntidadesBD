import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Clientes cliente1 = new Clientes(1, "João", "joao@email.com", "123456789");
        Clientes cliente2 = new Clientes(2, "Maria", "maria@email.com", "987654321");

        cliente1.exibirDetalhes();
        cliente2.exibirDetalhes();

        // Alterando valores do Cliente
        cliente1.setTelefone("999999999");

        System.out.println("\nApós a alteração:");
        cliente1.exibirDetalhes();

        CaixaEletronico caixa = new CaixaEletronico("Rua A");
        caixa.exibirStatus();
        caixa.desativarCaixa();
        caixa.exibirStatus();

        Emprestimos emprestimo = new Emprestimos(1000, 0.1, 12);
        double totalAPagar = emprestimo.calcularValorTotal();
        System.out.println("Valor total a pagar: " + totalAPagar);

        Agencia agencia = new Agencia(1234, "Avenida XYZ");
        agencia.exibirDetalhes();

        GerenteConta gerente = new GerenteConta("Ana", "ana@email.com", "999888777");
        gerente.exibirDetalhes();

        Investimentos investimento = new Investimentos("Ações", 5000, 0.15);
        double lucro = investimento.calcularLucro();
        System.out.println("Lucro do investimento: " + lucro);

        Transacoes transacao = new Transacoes(1, 200, new Date());
        transacao.exibirDetalhes();

        Cartao cartao = new Cartao("123456789", "Débito", "João");
        cartao.exibirDetalhes();

        ContaBancaria conta = new ContaBancaria(98765, 1000, cliente1, agencia);
        conta.exibirDetalhes();
        conta.depositar(500);
        conta.sacar(200);
        conta.exibirDetalhes();
    }
}
