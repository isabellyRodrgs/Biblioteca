
import java.util.Scanner;

public class BibliotecaIsabelly2B {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Biblioteca biblioteca = new Biblioteca();
            
            // Menu principal
            while (true) {
                System.out.println("\n==== Menu Biblioteca ====");
                System.out.println("1. Cadastrar Usuário");
                System.out.println("2. Cadastrar Livro");
                System.out.println("3. Cadastrar Admin");
                System.out.println("4. Listar Livros");
                System.out.println("5. Listar Admins");
                System.out.println("6. Listar Usuários");
                System.out.println("7. Sair");
                System.out.print("Escolha uma opção: ");
                int opcao = scanner.nextInt();
                scanner.nextLine(); // Limpar buffer
                
                try {
                    
                    switch (opcao) {
                        case 1 -> {
                            // Cadastrar usuário
                            scanner.nextLine(); // Limpa o buffer se tiver usado nextInt() antes
                            System.out.print("Nome do usuário: ");
                            String nomeUsuario = scanner.nextLine();
                            System.out.print("Email do usuário: ");
                            String emailUsuario = scanner.nextLine();
                            Usuario usuario = new Usuario(nomeUsuario, emailUsuario);
                            biblioteca.cadastrarUsuario(usuario);
                            System.out.println("Usuário cadastrado com sucesso!");
                        }
                        
                        case 2 -> {
                            scanner.nextLine();
                            // Cadastrar livro
                            System.out.print("Título do livro: ");
                            String titulo = scanner.nextLine();
                            System.out.print("Autor do livro: ");
                            String autor = scanner.nextLine();
                            Livro l = new Livro(titulo, autor);
                            biblioteca.cadastrarLivro(l);
                            System.out.println("Livro cadastrado com sucesso!");
                        }
                        
                        case 3 -> {
                            scanner.nextLine();
                            // Cadastrar admin
                            System.out.print("Nome do admin: ");
                            String nomeAdmin = scanner.nextLine();
                            System.out.print("Código do admin: ");
                            String codigoAdmin = scanner.nextLine();
                            Adm adm = new Adm(nomeAdmin, codigoAdmin);
                            biblioteca.cadastrarAdm(adm);
                            System.out.println("Admin cadastrado com sucesso!");
                        }
                        
                        case 4 -> {
                            // Listar livros
                            System.out.println("=== Lista de Livros ===");
                            biblioteca.listarLivros();
                        }
                        
                        case 5 -> {
                            // Listar admins
                            System.out.println("=== Lista de Admins ===");
                            biblioteca.listarAdms();
                        }
                        
                        case 6 -> {
                            // Listar usuários
                            System.out.println("=== Lista de Usuários ===");
                            biblioteca.listarUsuarios();
                        }
                        
                        case 7 -> {
                            // Sair
                            System.out.println("Saindo do sistema...");
                            System.exit(0); // Encerra o programa
                        }
                        
                        default ->
                            System.out.println("Opção inválida. Tente novamente.");
                    }
                } catch (Exception e) {
                    System.out.println("Erro: entrada inválida.");
                    scanner.nextLine(); // Limpar buffer após erro
                }
            }
        }
    }
}
