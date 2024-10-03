// Classe Usuario representa um usuário da rede social
public class Usuario {
    private String nome;
    private String email;
    private int idade;

    // Construtor para inicializar os atributos do usuário
    public Usuario(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    // Método para obter o nome do usuário (usado em Postagem)
    public String getNome() {
        return nome;
    }

    // Método para exibir as informações do usuário
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Idade: " + idade);
    }
}

