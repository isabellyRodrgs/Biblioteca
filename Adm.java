public class Adm extends Usuario{
    
    //Atributos
    private String cargo;
    
    //CONSTRUTOR
    public Adm(String nome, String email){
        super(nome, email);
    }
    
    //GETTER
    public String getCargo(){
        return this.cargo;
    }
    
    //SETTER
    public void setCrago(String novoCargo){
        this.cargo = novoCargo;
    }
    
    //@Override
    public String exibirInformacoes(){
        String info = "Id: " +getId()+ ", Usuario: " +getNome()+ ", Email: " +getEmail()+ ", Cargo: "+cargo;
        return info;
    }
}