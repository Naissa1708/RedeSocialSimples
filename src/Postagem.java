// Classe Postagem representa uma postagem feita por um usuário na rede social
import java.util.Date;

public class Postagem {
    private String conteudo;
    private Date data;
    private Usuario usuario;

    // Construtor para inicializar os atributos de postagem
    public Postagem(String conteudo, Date data, Usuario usuario) {
        this.conteudo = conteudo;
        this.data = data;
        this.usuario = usuario;
    }

    // Método para exibir as informações da postagem
    public void exibirPostagem() {
        System.out.println("Conteúdo: " + conteudo);
        System.out.println("Data: " + data);
        System.out.println("Postado por: " + usuario.getNome());
    }
}
