
package manipulastrings;


class ExercicioStrings {
    
    static String s, s1;
    static void leStrings(String texto){
        
        System.out.println(texto);
        s = ManipulaStrings.ler.next();
        s1 = ManipulaStrings.ler.nextLine();
        s = s+s1;
    }
    static int contaCaractere() {
        leStrings("Insira um texto");
        return s.length(); 
    }

    static void arvoreCharAt() {
        int x,y;
        leStrings("Insira um texto");
        for(x=0;x<s.length();x++){ //Este for controla as linhas
            for (y=0;y<=x;y++){ //Este for percorre as colunas
               System.out.print(s.charAt(y));
            }
        System.out.println();
        }
        for (x=s.length()-1;x>0;x--){
          for (y=0;y<x;y++){
               System.out.print(s.charAt(y));  
        }
        System.out.println();  
    }

}
}
