public class GerenteConta {
    private String nome;
    private String email;
    private String telefone;

    public GerenteConta(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    // Getters e Setters (métodos para acesso aos atributos)

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
    }
}
