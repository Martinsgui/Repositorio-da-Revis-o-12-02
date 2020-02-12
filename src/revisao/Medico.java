
package revisao;

/**
 *
 * @author guimel martins
 */
public class Medico extends Funcionario {
    private String CRM;
    private String Especialidade;
    
    //setters 
    public void setCRM(String CRM){
        this.CRM = CRM;
    }
    public void setEspecialidade(String Especialidade){
         this.Especialidade = Especialidade;
         
    }
     //getters
    public String getCRM(){
        return this.CRM;
    }
    public String getEspecialidade(){
        return this.Especialidade;
    }
}
