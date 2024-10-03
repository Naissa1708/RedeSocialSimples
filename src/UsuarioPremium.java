// A classe UsuarioPremium herda da classe Usuario e adiciona funcionalidades premium
public class UsuarioPremium extends Usuario {
    private boolean isDestacado;  // Indica se o usuário pode fazer postagens destacadas

    // Construtor que chama o construtor da classe base (Usuario) e inicializa o atributo isDestacado
    public UsuarioPremium(String nome, String email, int idade, boolean isDestacado) {
        super(nome, email, idade);  // Chama o construtor da classe Usuario
        this.isDestacado = isDestacado;  // Inicializa o atributo isDestacado
    }

    // Metodo para exibir se o usuário tem postagens destacadas
    public void exibirBeneficios() {
        System.out.println("Usuário Premium: Postagem destacada: " + (isDestacado ? "Sim" : "Não"));
    }
}
