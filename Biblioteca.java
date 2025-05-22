import java.util.ArrayList;

public class Biblioteca {
    
    //Atributos
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Adm> adms;
    private static final String SENHA_ADM_PADRAO = "admin";
    
    //Construtor 
    public Biblioteca(){
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.adms = new ArrayList<>();
    }
    
    //Metodo para verificar senha
    public boolean autenticarAdm(String senha){
        return SENHA_ADM_PADRAO.equals(senha); // o equals compara a senha do admin
    }
    
    //Metodo para buscar livro
    public Livro buscarLivroPorIsbn(int isbn){
        for (Livro livro : livros){
            if(livro.getIsbn()==isbn){
                return livro;
            }
        }
        return null;
    }
    
    //Metodo para buscar usuario
    public Usuario buscarUsuarioPorId(int idUsuario){
        for (Usuario usuario : usuarios){
            if(usuario.getId()==idUsuario){
                return usuario;
            }
        }
        return null;
    }
    
    //Metodo para buscar Adm por id
    public Adm buscarAdmPorId(int idAdm){
        for(Adm adm : adms){
            if(adm.getId()== idAdm){
                return adm;
            }
        }
        return null;
    }
    
    // METODO PARA CADASTRAR LIVRO
    public String cadLivro(String titulo, String autor, int ano){
        
        if(titulo==null
        || titulo.trim().isEmpty()
        || autor==null
        || autor.trim().isEmpty()){
        
        return "Erro: Titulo ou autor nao podem ser validos.";
    }
    
    Livro livro = new Livro(titulo, autor, ano);
    livros.add(livro);
    return "livro "+titulo+ "cadastrado.";
}
    
    //METODO PARA CADASTRAR O USUARIO
    public String cadUsuario(String nome, String email){
        Usuario usuario = new Usuario(nome, email);
        usuarios.add(usuario);
        return "Usuario "+ nome +"cadastrado com sucesso";
    }    
    
    //METODO PARA CADASTRAR ADM
    public String cadAdm (String nome, String email){
        Adm adm = new Adm (nome, email);
        adms.add(adm);
        return "O administrador"+nome+" foi cadastrado";
    }

    void cadastrarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void cadastrarLivro(Livro l) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void cadastrarAdm(Adm adm) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void listarLivros() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void listarAdms() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void listarUsuarios() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
