public class Clientes {
    private int id;
    private String nome;
    private String email;
    private String telefone;

    public Clientes(int id, String nome, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    // Getters e Setters (métodos para acesso aos atributos)

    public void exibirDetalhes() {
        System.out.println("Detalhes do Cliente:");
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
    }

    public void setTelefone(String number) {
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
