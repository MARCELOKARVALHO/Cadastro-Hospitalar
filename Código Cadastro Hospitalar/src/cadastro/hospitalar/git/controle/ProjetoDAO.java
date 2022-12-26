
package cadastro.hospitalar.git.controle;
 
import cadastro.hospitalar.git.exceptions.DadoConsultadoException;
import cadastro.hospitalar.git.modelo.Projeto;
import java.util.List;

 
public interface ProjetoDAO {
 
    void adicionar(Projeto projeto);
    List<Projeto> listar();
    Projeto consultarPorNome(String nome) throws DadoConsultadoException;
    void excluir(Projeto projeto) throws DadoConsultadoException, UnsupportedOperationException;
    void excluir(String nome) throws DadoConsultadoException, UnsupportedOperationException;
}
