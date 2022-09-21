
package manipulastrings;


class ExercicioStrings {

    static int contaCaractere() {
       String s, s1;
        System.out.println("Insira um texto");
        s = ManipulaStrings.ler.next();
        s1 = ManipulaStrings.ler.nextLine();
        s = s+s1;
        return s.length();
         
    }

   }
