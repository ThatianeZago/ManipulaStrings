package manipulastrings;

import java.util.Scanner;


public class ManipulaStrings {

    public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        int op;
        do{
          System.out.println(">>>>>>MENU<<<<<<");  
          System.out.println(" 1 - Tamanho String");
          System.out.println(" 2 - Árvore de Letras");
          System.out.println(" 3 - Capitalização de letras");
          System.out.println(" 4 - ");

          
          
          
          System.out.println(" 0 - SAIR");
          System.out.println("Insira a opção pretendida: ");
          op = ler.nextInt();
          
          switch (op){
              case 0: break;
              case 1:
                 System.out.println("A string tem " + ExercicioStrings.contaCaractere() + " caractere");
                 break;
                 /*
                 int t = 
                 System.out.println("A String inserida");
                 */
               case 2:
                  ExercicioStrings.arvoreCharAt();
                  break; 
                case 3:
                  ExercicioStrings.capitalizaLetras();
                  break; 
                case 4:
                  /*ExercicioStrings.();
                  break;*/
              default:
                    System.out.println("Insira a opção válida.");
          }
        }while (op!=0);
        
   }

}
