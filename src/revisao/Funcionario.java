
package revisao;

/**
 *
 * @author guimel martins
 */
public class Funcionario extends Pessoa{
    private int Matricula;
    private String Senha;
    
    //setters
    public void setMatricula(int Matricula){
        this.Matricula = Matricula;
    }
    public void setSenha(String Senha){
        this.Senha = Senha;
    }
    //getters
    public int getMatricula(){
        return this.Matricula;  
    }
    public String getSenha(){
        return this.Senha;
    }
}
