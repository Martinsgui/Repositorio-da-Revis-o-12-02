
package revisao;

/**
 *
 * @author guimel martins
 */
public class Principal {

    public static void main(String[] args) {
        Paciente p = new Paciente();
        Funcionario f = new Funcionario();
        Enfermeiro e = new Enfermeiro();
        Medico m = new Medico();
        
        //instanciando os objetos (Paciente)
        p.setNome("Roberto");
        p.setIdade(17);
        p.setCPF("123.456.789-10");
        p.setRg("987.654.321-00");
        p.setCodPaciente(1);
        p.setSenha("senha123");
        
        //instanciando os objetos (funcionario)
        f.setNome("Marcos");
        f.setIdade(30);
        f.setCPF("653.465.234-78");
        f.setRg("345.865.365-64");
        f.setMatricula(1);
        f.setSenha("senha321");
        
        //instanciando os objetos (Enfermeiro)
        e.setNome("Vitinho");
        e.setIdade(32);
        e.setCPF("945.342.345-33");
        e.setRg("123.989.321-22");
        e.setCoren("00009");
        
        //instanciando os objetos (Medico)
        m.setNome("Robervaldo");
        m.setIdade(50);
        m.setCPF("657.785.256-97");
        m.setRg("957.235.832-76");
        m.setCRM("00001");
        m.setMatricula(1234);
        m.setEspecialidade("medico fonodiologo");
        
        //exibindo Informações (Paciente)
        System.out.println("Nome do Paciente: "+ p.getNome());
        System.out.println("Idade do Paciente: "+ p.getIdade());
        System.out.println("CPF: "+p.getCPF());
        System.out.println("RG: "+p.getRg());
        System.out.println("Código do Paciente: "+ p.getCOdPaciente());
        System.out.println("Senha: "+p.getSenha());
        
        //exibindo Informações (Funcionario)
        System.out.println("Nome do Funcionario: "+f.getNome());
        System.out.println("Idade: "+e.getIdade());
        System.out.println("CPf: "+f.getCPF());
        System.out.println("RG: "+f.getRg());
        System.out.println("Matricula: "+f.getMatricula());
        System.out.println("Senha: "+f.getSenha());
        
        //exibindo Informações (Enfermeiro)
        System.out.println("Nome: "+ e.getNome());
        System.out.println("Idade: "+ e.getIdade());
        System.out.println("CPF: "+e.getCPF());
        System.out.println("RG: "+e.getRg());
        System.out.println("CRM: "+e.getCoren());
        
        //exibindo Informações (Medico)
        System.out.println("Nome: "+m.getNome());
        System.out.println("Idade: "+m.getIdade());
        System.out.println("CPF: "+m.getCPF());
        System.out.println("RG: "+m.getRg());
        System.out.println("Matricula: "+m.getMatricula());
        System.out.println("Especialidade: "+m.getEspecialidade());
        
    }
    
}
