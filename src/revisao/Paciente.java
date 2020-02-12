
package revisao;

/**
 *
 * @author guimel martins
 */
public class Paciente extends Pessoa {
    private int CodPaciente;
    private String Senha;
  
    //setters
    public void setCodPaciente(int CodPaciente){
        this.CodPaciente = CodPaciente;
    }
    public void setSenha(String Senha){
        this.Senha = Senha;
    }
    //getters
    public int getCOdPaciente(){
        return this.CodPaciente;
    }
    public String getSenha(){
        return this.Senha;
    }
    
}
