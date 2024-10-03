import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criando um usuário comum
        Usuario usuario1 = new Usuario("Naissa", "nay@example.com", 25);
        usuario1.exibirInformacoes();

        // Criando uma postagem para o usuário comum
        Postagem postagem1 = new Postagem("O céu está lindo hoje!", new Date(), usuario1);
        postagem1.exibirPostagem();

        System.out.println();

        // Criando um usuário premium
        UsuarioPremium usuarioPremium = new UsuarioPremium("Marcelo", "marcelo@example.com", 30, true);
        usuarioPremium.exibirInformacoes();
        usuarioPremium.exibirBeneficios();

        // Criando uma postagem para o usuário premium
        Postagem postagem2 = new Postagem("Postagem premium!", new Date(), usuarioPremium);
        postagem2.exibirPostagem();
    }
}

