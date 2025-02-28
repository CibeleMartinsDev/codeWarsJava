package daySevenEight;


/**
 * Complete a solução para que a função quebre o camel casing, usando um espaço entre as palavras.
 *
 * Exemplo
 * "camelCasing"  =>  "camel Casing"
 * "identifier"   =>  "identifier"
 * ""             =>  ""
 */
public class BreakCamelCase {


       public static String camelCase(String input) {
           String[] stringArray = input.split("");

           for (int i = 0; i < stringArray.length; i++){
               if(Character.isUpperCase(input.charAt(i))){
                   stringArray[i] = " " + stringArray[i];
               }
           }

           return String.join("", stringArray);
       }

}
