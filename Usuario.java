public class Usuario {
    private static int proximoId = 1;
    private int id;
    private String nome;
    private String email;
    
    //GETTERS
    public int getId(){
        return this.id;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getEmail(){
        return this.email;
    }
   
    //SETTERS
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    
    public void setEmail(String novoEmail){
        this.email = novoEmail;
    }
    
    //CONSTRUTOR
    public Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
        this.id = proximoId++;
    }
    
    //METODO PARA EXIBIR AS INFORMAÇÕES DO USUARIO
    public String exibirInfoEmail(){
        String info = "Id: "+id+", Usuario: "+nome+", Email: "+email;
        return info;
    }