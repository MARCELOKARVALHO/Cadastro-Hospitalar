
package cadastro.hospitalar.git.controle;

 
import cadastro.hospitalar.git.exceptions.DadoConsultadoException;
import cadastro.hospitalar.git.modelo.Projeto;
import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
 
public class ProjetoImpl implements ProjetoDAO {
    //Collection que irá armazenar todos os projetos
    private static final Set<Projeto> projetos = new HashSet<>();
    
    
 
    @Override
    public void adicionar(Projeto projeto) {
     
         
        projetos.add(projeto);
          
    }
 
    @Override
    public List<Projeto> listar() {
        List<Projeto> projetoList = new ArrayList<>();
        projetoList.addAll(projetos);
        return projetoList;
    
    }
 
    @Override
    public Projeto consultarPorNome(String nome) throws DadoConsultadoException {
        for(Projeto projeto: projetos){
            if (projeto.getNome().equalsIgnoreCase(nome)){
                return projeto;
            }
        }
        throw new DadoConsultadoException("\n **** Não existe Paciente com o nome: "+nome);
    }
 
 
     @Override
    public void excluir(String nome) throws DadoConsultadoException, UnsupportedOperationException {
       Projeto projeto = consultarPorNome(nome);
       this.excluir(projeto);
       
       
    }

    @Override
    public void excluir(Projeto projeto) throws DadoConsultadoException, UnsupportedOperationException {
        if (projetos.contains(projeto)){
            projetos.remove(projeto);
            
            System.out.println("\n******** Alta do paciente efetuada com sucesso!********");
         
            return;
       }
         throw new DadoConsultadoException("Paciente escolhido não foi encontrado!");
    }
   
}




 