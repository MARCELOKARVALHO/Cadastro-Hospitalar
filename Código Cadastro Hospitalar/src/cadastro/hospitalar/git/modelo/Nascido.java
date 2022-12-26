
package cadastro.hospitalar.git.modelo;

import java.util.Scanner;


public class Nascido extends Projeto{



    
    private String nome;
    private String tiposang;
    public String convenio;
    private String procedimento;
    private String nomebebe = "";

      private int cod = 0;
      private int codp = 0;
      private final String v1= "unisaude";
      private final String v2= "saude e compania";
      private final String v3="saude dez";
      private final String p1= "Cirurgia";
      private final String p2= "Parto";
      private double peso = 0;
      public double altura = 0;
      private String sanguern;
      public String nenem;

/*
public void imprime(){     
        System.out.println("Nome: " + getNome());}
        
 */
        
 public String getNomebebe() {
        return nomebebe;
    }
 
    public void setNomebebe(String nomebebe) {
        this.nomebebe = nomebebe;
    }
 
public double getPeso() {
        return peso;
    }
 
    public void setPeso(double peso) {
        this.peso = peso;
    }

public double getAltura() {
        return altura;
    }
 
    public void setAltura(double altura) {
        this.altura = altura;
    }  

}


 
 
 

