
package revisao;

/**
 *
 * @author guimel martins
 */
public abstract class Pessoa {
    private String Nome;
    private String Rg;
    private String CPF;
    private int Idade;
    
    
    //setters
    public void setNome(String Nome){
        this.Nome = Nome;
    }
    public void setRg(String Rg){
        this.Rg = Rg;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    public void setIdade(int Idade){
        this.Idade = Idade;
    }
    //getters
    public String getNome(){
        return this.Nome;
    }
    public String getRg(){
        return this.Rg;
    }
    public String getCPF(){
        return this.CPF;
    }
    public int getIdade(){
        return this.Idade;
    }
}
