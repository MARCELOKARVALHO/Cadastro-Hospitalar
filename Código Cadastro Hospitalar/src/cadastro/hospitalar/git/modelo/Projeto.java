package cadastro.hospitalar.git.modelo;
 
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.Scanner;

public class Projeto {
 
    private String nome;
    private String tiposang;
    private String convenio;
    private String procedimento;
    private String nomebebe;
public String nomemae = nome;
private String sanguern;
private String nenem;
      private int cod = 0;
      private int codp = 0;
      private final String v1= "Unisaude";
      private final String v2= "Saude e compania";
      private final String v3="Saúde dez";
      private final String p1= "Cirurgia";
      private final String p2= "Parto";
      private double peso = 0;
      private double altura = 0;
   
     

    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public String getTiposang() {
        return tiposang;
    }
 
    public void setTiposang(String tiposang) {
        this.tiposang = tiposang;
    }
 
    public String getConvenio() {
        return convenio;
    }
 
    public void setConvenio(String convenio) {

System.out.println("\nDigite o tipo de convênio do paciente: ");
            System.out.println("\nOpção 1- Unisaúde\nOpção 2- Saúde e compania\nOpção 3- Saúde dez \n"); 
do{
        Scanner scannerMenu = new Scanner(System.in);
            cod = scannerMenu.nextInt();
       
            if(cod==1)       
           {  this.convenio = v1; System.out.println("Convênio: Unisaúde\n-----------------------------"); } 
            if(cod==2)       
           {  this.convenio = v2; System.out.println("\nConvênio: Saúde e compania\n-----------------------------"); } 
            if(cod==3)       
           {  this.convenio = v3; System.out.println("\nConvênio: Saúde Dez\n-----------------------------"); } 
           
            if((cod>3) || (cod<1)){            
            System.out.println("\n************** OPÇÃO INVÁLIDA!***************\n\nDigite a opção correta\n\n  opção 1- Cirurgia\n  opção 2- Parto");
            }
        }while(cod>3);          
            
      }
  
    public String getProcedimento() {
        return procedimento;
    }


 
    public void setProcedimento(String procedimento) {
               
        System.out.println("Digite o tipo de procedimento") ;
        System.out.println("\nOpção 1- CIRURGIA\nOpção 2- PARTO");

         do{
        Scanner scannerMenu = new Scanner(System.in);
            codp = scannerMenu.nextInt();
            if((codp>2) || (codp<1)){            
            System.out.println("\n************** OPÇÃO INVÁLIDA!***************\n\nDigite a opção correta\n\n  opção 1- Cirurgia\n  opção 2- Parto");
            }
       
            if(codp==1)       
           {  this.procedimento = p1; 
            System.out.println("Tipo de Procedimento escolhido: CIRURGIA\n-----------------------------------------\n");
            System.out.println("       Cadastro concluído com sucesso!\n\n"); 
           } 

            if(codp==2)       
           {  this.procedimento = p2; 
            System.out.println("\nTipo de Procedimento escolhido: PARTO\n-------------------------------------------------\n"); 
          
            System.out.println("\n  Prossiga com o Registro da criança\n");          

            System.out.println("---- Cadastro do Recém nascido -----\n");  

            
            System.out.println("---------------------------------------");
            this.nenem = scannerMenu.nextLine();                
            System.out.println("Digite o nome do bebe: ");
            this.nenem = scannerMenu.nextLine(); 
            System.out.println("Digite o tipo sanguíneo do bebe: ");
            this.sanguern = scannerMenu.nextLine();                
                           
            System.out.println("Digite o peso do RN, utilizando vírgula para casas decimais: ");
             this.peso = scannerMenu.nextDouble();              
            System.out.println("Digite a altura do RN, utilizando vírgula para casas decimais: ");
            this.altura = scannerMenu.nextDouble(); 
        System.out.println("Nome da mãe: " + nome + "\n");
        System.out.println("Convênio: " + convenio + "\n"); 
            
            System.out.println("----------------------------------------\n"); 
            } 

            
                      
        }while(codp>2);          

      }


 /*   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Projeto projeto = (Projeto) o;
        return Objects.equals(nome, projeto.nome);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }  */
 
    public Projeto copia() {
        Projeto projeto = new Projeto();
        projeto.setNome(this.nome);
        projeto.setTiposang(this.tiposang);
        projeto.setConvenio(this.convenio);
        projeto.setProcedimento(this.procedimento);
        return projeto;
    }
 
    public void substituir(Projeto projetoNovo) {
        
        this.setNome(projetoNovo.getNome());
        this.setTiposang(projetoNovo.getTiposang());
        this.setConvenio(projetoNovo.getConvenio());
        this.setProcedimento(projetoNovo.getProcedimento());
    }
 
    @Override
    public String toString() {
if(codp==1)
        return "\nPaciente: \n\n" +
                "Nome: " + nome + "\n" +
                "Tipo Sanguíneo: " + tiposang + "\n" +
                "Convênio: " + convenio + "\n" +
                "Procedimento: " + procedimento + "\n-----------------------------\n\n"; 
  if(codp==2)
               return "\nPaciente: \n\n" +
                "Nome: " + nome + "\n" +
                "Tipo Sanguíneo: " + tiposang + "\n" +
                "Convênio: " + convenio + "\n" +
                "Procedimento: " + procedimento + "\n\n" +
                "Nome da criança: " + nenem + "\n" + 
                "Tipo sanguíneo do bebê: " + sanguern + "\n" +
                "Convênio do bebe: " + convenio + "\n" +              
                "Peso: " + peso + "\n" +
                "Altura: " + altura + "\n-----------------------------"; 
        return null;
        
     } 
}


 
 
 
