
package cadastro.hospitalar.git.principal;
 
import cadastro.hospitalar.git.controle.ProjetoDAO;
import cadastro.hospitalar.git.controle.ProjetoImpl;
import cadastro.hospitalar.git.exceptions.DadoConsultadoException;
import cadastro.hospitalar.git.modelo.Projeto;
 
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;
 
public class Principal {
    
    public static void main(String[] args) {
        
        ProjetoDAO dao = new ProjetoImpl();
               
        
        int opcao;
        do{
            System.out.println("\n----------- REGISTRO DE PROJETOS -----------\n\nEscolha o número da opção desejada:\n");
            System.out.println("Opção 1 - Cadastro de Internação");
            System.out.println("Opção 2 - Listar ");
            System.out.println("Opção 3 - Localizar por nome");
            System.out.println("Opção 4 - Alta de Internação");
             System.out.println("Opção 0 - Sair do programa\n");
            System.out.println("Digite a opção escolhida:  \n");
            
            Scanner scannerMenu = new Scanner(System.in);
            opcao = scannerMenu.nextInt();
                  if((opcao>5) || (opcao<0))
                        System.out.println("\n************** OPÇÃO INVÁLIDA!***************\n\nDigite apenas um número dentre as opções apresentadas.");
            
           try {
                switch (opcao){
                    case 1:
                        Projeto projeto = new Projeto();
System.out.println("-------- HOSPITAL UNIVERSITÁRIO --------");
                        projeto.setNome(coletarTexto("\nDigite o nome do Paciente:"));
                        projeto.setTiposang(coletarTexto("Digite o tipo sanguineo:")); 
                        projeto.setConvenio(coletarTexto("Tecle ENTER para escolher a opção do Convenio:"));
                        projeto.setProcedimento(coletarTexto("Tecle ENTER para escolher a opção do Procedimento:"));

                        dao.adicionar(projeto);
                        break;
                    case 2:
                  
                        System.out.println(dao.listar());
                        break;
                        
                    case 3:

                        String nomeConsultado = coletarTexto("\nDigite o nome do paciente que está buscando.");
                        Projeto projetoEncontrado = dao.consultarPorNome(nomeConsultado);
                        System.out.println(projetoEncontrado);
                        break;

                    case 4:

                        String nomeConsultaExcluir = coletarTexto("\nDigite o nome do paciente que está recebendo alta.");
                        dao.excluir(nomeConsultaExcluir);
                        break;
                    
                    case 0:
                        break;
                }
            
            } catch (InputMismatchException e){
                System.out.println("********* Não foi possível registrar corretamente a sua opção.*********");
             } catch (DadoConsultadoException e) {
                System.out.println(e.getMessage());
            }
            
            }while (opcao!=0);
              coletarTexto("-------------------------------------------------------");        
    }
 
    private static String coletarTexto(String descricao){
        Scanner scanner = new Scanner(System.in);
        System.out.println(descricao);
        return scanner.nextLine();
    }
}